package com.SpringMVC.CRUD.model;

public class Employee {
    private int employeeID;
    private String name;
    private String address;
    private  String jobTitle;
    private String phoneNumber;

    public Employee() {
    }

    public Employee(int employeeID, String name, String address, String jobTitle, String phoneNumber) {
        this.employeeID = employeeID;
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
