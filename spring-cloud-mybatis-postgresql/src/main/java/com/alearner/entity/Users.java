package com.alearner.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users  implements Serializable{
    private int id;
    private String userid;
    private String psw;
    private String email;
    private String name;

}
