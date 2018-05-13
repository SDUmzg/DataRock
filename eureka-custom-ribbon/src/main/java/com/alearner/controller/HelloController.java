package com.alearner.controller;

import com.alearner.orm.UserDto;
import com.alearner.service.HelloService;
import com.alearner.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @Autowired
    QueryService queryService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return helloService.hello(name);
    }

    @ResponseBody
    @RequestMapping(value = "queryHbase",method = RequestMethod.GET)
    public UserDto queryHbase(@RequestParam(value = "row") String row){
        return queryService.query(row);
    }


    @RequestMapping(value = "query",method = RequestMethod.GET)
    public List<UserDto> query(@RequestParam(value = "startRow")String startRow,
                               @RequestParam(value = "stopRow")String stopRow){
        return queryService.query(startRow,stopRow);
    }

}
