package com.employee.dao;

import com.employee.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

/**
 * @author ywq
 * @date 2020/4/14 17:17
 */
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments = null;

    static {
        departments.put(101, new Department(101, "美食部"));
        departments.put(102, new Department(102, "娱乐部"));
        departments.put(103, new Department(103, "灵魂部"));
        departments.put(104, new Department(104, "搞事部"));
        departments.put(105, new Department(105, "武装部"));
    }

    //get all Information
    public Collection<Department> getDepartment() {
        return departments.values();
    }
    //by id
    public Department getDepartmentById(Integer id) {
        return departments.get(id);
    }

}
