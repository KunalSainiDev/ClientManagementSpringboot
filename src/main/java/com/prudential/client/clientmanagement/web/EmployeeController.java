package com.prudential.client.clientmanagement.web;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.prudential.client.clientmanagement.service.EmployeeService;
import com.prudential.client.clientmanagement.domain.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/api/employee/getAll")
    public List<EmployeeEntity> getEmployeeEntityList(){
        List<EmployeeEntity> employeeEntityList = employeeService.getAllEmployees();

        return employeeEntityList;
    }

    @PostMapping("/api/employee/add")
    public ResponseEntity<EmployeeEntity> addEmployeeDetails(@RequestBody EmployeeEntity employeeEntity){
        EmployeeEntity emp = employeeService.saveOrUpdateEmployee(employeeEntity);
        return new ResponseEntity<EmployeeEntity>(emp,HttpStatus.CREATED);
    }

    @RequestMapping("/api/employee/update")
    public ResponseEntity<EmployeeEntity> updateEmployeeDetails(@RequestBody EmployeeEntity employeeEntity){
        EmployeeEntity emp = employeeService.saveOrUpdateEmployee(employeeEntity);
        return new ResponseEntity<EmployeeEntity>(emp,HttpStatus.OK);
    }

    @RequestMapping("/api/employee/delete")
    public ResponseEntity<EmployeeEntity> deleteEmployeeDetails(@RequestBody EmployeeEntity employeeEntity){
         employeeService.deleteEmployee(employeeEntity);
        return new ResponseEntity<EmployeeEntity>(employeeEntity,HttpStatus.OK);
    }
}
