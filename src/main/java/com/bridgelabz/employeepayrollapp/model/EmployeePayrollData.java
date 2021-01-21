package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "employee_payroll")
public @Data class EmployeePayrollData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "employee_id")
    private int employeeId;
    @Column(name="name")
    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String notes;
    private String profilePic;
    @ElementCollection
    @CollectionTable(name= "employee_department",
                        joinColumns = @JoinColumn(name = "id") )
    @Column(name = "department")
    private List<String> department;

    public EmployeePayrollData() {
    }

    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.updateEmployeePayrollData(employeePayrollDTO);
    }

    public void updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.notes = employeePayrollDTO.notes;
        this.startDate = employeePayrollDTO.startDate;
        this.profilePic = employeePayrollDTO.profilePic;
        this.department = employeePayrollDTO.department;
    }

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeId = empId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.notes = employeePayrollDTO.notes;
        this.startDate = employeePayrollDTO.startDate;
        this.profilePic = employeePayrollDTO.profilePic;
        this.department = employeePayrollDTO.department;
    }


    
}
