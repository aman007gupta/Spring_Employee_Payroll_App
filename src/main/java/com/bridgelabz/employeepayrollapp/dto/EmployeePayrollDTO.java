package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDTO {
    public String name;
    public long salary;

    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

//    public String getName() {
//        return name;
//    }
//
//    public long getSalary() {
//        return salary;
//    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
