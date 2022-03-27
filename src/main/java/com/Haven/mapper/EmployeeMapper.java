package com.Haven.mapper;

import com.Haven.pojo.Department;
import com.Haven.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工mapper
@Repository
public class EmployeeMapper {

    //模拟数据库数据
    private static Map<Integer, Employee> employees = null;
    //员工有所属部门
    @Autowired
    DepartmentMapper departmentMapper;

    static {
        employees = new HashMap<>();

        employees.put(1001, new Employee(1001, "教A", "a147637821@qq.com", 0, new Department(101, "教学部")));
        employees.put(1002, new Employee(1002, "市A", "b146378219@qq.com", 1, new Department(102, "市场部")));
        employees.put(1003, new Employee(1003, "教A", "c147378219@qq.com", 0, new Department(103, "教研部")));
        employees.put(1004, new Employee(1004, "运A", "d147638219@qq.com", 1, new Department(104, "运营部")));
        employees.put(1005, new Employee(1005, "小A", "e147637219@qq.com", 0, new Department(105, "小卖部")));
    }

    //主键自增!
    private static Integer initID = 1006;
    //增加一个员工
    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initID++);
        }
        employee.setDepartment(departmentMapper.getDepartmentById(employee.getDepartment().getDepartmentID()));
        employees.put(employee.getId(), employee);
    }

    //查询员工信息
    public Collection<Employee> getAll() {
        return employees.values();
    }

    //通过ID查询员工
    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }

    public void delete(Integer id) {
        employees.remove(id);
    }
}
