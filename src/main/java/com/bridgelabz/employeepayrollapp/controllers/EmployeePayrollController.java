package com.bridgelabz.employeepayrollapp.controllers;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Aman", 3000));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId, new EmployeePayrollDTO("AMna", 5000));
        ResponseDTO responseDTO = new ResponseDTO("Get Call For ID Successful", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody
                                                         EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Create Employee Payroll Data Successfully", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody
                                                                    EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Update Employee Payroll Data Successfully", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        ResponseDTO responseDTO = new ResponseDTO("Delete Successfully", "Delete Id: " +empId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
