package com.SpringMVC.CRUD.controller;


import com.SpringMVC.CRUD.model.Employee;
import com.SpringMVC.CRUD.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {
    //Dependency Injection
    @Autowired
    private EmployeeServices employeeServices;
    @GetMapping("/")
    public String homePage(){return "home-page.html";}
    @PostMapping("/search-by-employeeID")
    public  String searchByID(@RequestParam Integer id, Model model){
        model.addAttribute("employee", employeeServices.findByID(id));
        return "employee-page.html";
    }
    @GetMapping("/add-employee")
    public String addEmployee(){return "add-employee-page.html";}
    @PostMapping("/save-employee")
    public  String saveCandidate(@ModelAttribute Employee employee){
        employeeServices.addEmployee(employee);
        return "home-page.html";
    }
    @GetMapping("/all-employee-list")
    public String listOfEmployees(Model model){
        model.addAttribute(employeeServices.getEmployeeList());
        return "all-employee-list.html";
    }
}
