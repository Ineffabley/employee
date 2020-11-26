package com.employee.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @author ywq
 * @date 2020/4/14 17:12
 */
@Data
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;  //0:女
    private Department department;
    private Date birth;

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth=new Date();

    }
}
