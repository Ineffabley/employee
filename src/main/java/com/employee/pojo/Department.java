package com.employee.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ywq
 * @date 2020/4/14 17:10
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;
    private  String name;
}
