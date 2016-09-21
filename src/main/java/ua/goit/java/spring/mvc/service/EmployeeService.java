package ua.goit.java.spring.mvc.service;

import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.spring.mvc.dao.EmployeeDao;
import ua.goit.java.spring.mvc.model.Employee;

import java.util.List;

/**
 * Created by Daniel Solo on 19.09.2016.
 */
public class EmployeeService {

    private EmployeeDao employeeDao;

    @Transactional
    public List<Employee> getEmployees(){
        return employeeDao.findAllEmployees();
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
