package com.SpringMVC.CRUD.services;

import com.SpringMVC.CRUD.model.Employee;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeServices {
    List<Employee> employeeList = new ArrayList<>();
    @PostConstruct
    public void init(){
        employeeList.add(new Employee(3000, "Khalid", "Banasree", "Tranee", "01997770868"));
        employeeList.add(new Employee(3100, "Rakib", "Mirpur", "MERN J.S.E.", "01846970868"));
        employeeList.add(new Employee(3200, "Sabbir", "Mughda", "IOS S.S.E", "01997924368"));
        employeeList.add(new Employee(3300, "Khalid Kibria", "Bashabo", "Andorid S.S.E.", "01794130868"));
        employeeList.add(new Employee(3400, "Shuvo", "Jatrabari", "Tranee", "01799041090"));
        employeeList.add(new Employee(3600, "Ashik", "Banasree", "Andorid J.S.E.", "01719459702"));
    }
    public Employee findByID(Integer e_id){
        for(Employee emp:employeeList
             ) {
            if(Objects.equals(emp.getEmployeeID(),e_id))
                return emp;

        }
        return null;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }
}
