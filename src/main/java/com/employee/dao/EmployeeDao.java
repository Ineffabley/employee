package com.employee.dao;

import com.employee.pojo.Department;
import com.employee.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ywq
 * @date 2020/4/14 17:17
 */
@Repository
public class EmployeeDao {
    //模拟数据库中的数据
    private static Map<Integer, Employee> employees=null;
    @Autowired
    private DepartmentDao dao;

    static
    {
        employees=new HashMap<Integer, Employee>();
        employees.put(101,new Employee(1001,"Lisa","187358732@qq.com",1,new Department(101,"美食部")));
        employees.put(102,new Employee(1002,"Tom","18735332@qq.com",0,new Department(102,"娱乐部")));
        employees.put(103,new Employee(1003,"Jerry","187358332@qq.com",1,new Department(103,"灵魂")));
        employees.put(104,new Employee(1004,"Lisa","18787332@qq.com",0,new Department(104,"搞事部")));
        employees.put(105,new Employee(1005,"Lisa","18737332@qq.com",1,new Department(105,"武装部")));
    }

    //主键自增
    private static Integer initId=1006;
    //add an employee
    public void save(Employee e)
    { //not exists
        if(e.getId()==null)
        {
            e.setId(initId++);
        }

        e.setDepartment(dao.getDepartmentById(e.getDepartment().getId()));
        employees.put(e.getId(),e);
    }

    public Employee getEmployeeById(Integer id)
    {
        return employees.get(id);
    }

    public void delete(Integer id)
    {
        employees.remove(id);
    }
}
