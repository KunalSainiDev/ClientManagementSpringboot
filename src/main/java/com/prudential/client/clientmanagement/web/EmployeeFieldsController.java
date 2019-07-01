package com.prudential.client.clientmanagement.web;


import com.prudential.client.clientmanagement.domain.EmployeeEntity;
import com.prudential.client.clientmanagement.domain.EmployeeFieldsEntity;
import com.prudential.client.clientmanagement.service.EmployeeFieldsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeFieldsController {

    @Autowired
    private EmployeeFieldsService employeeFieldsService;

    @PostMapping("/api/dashboard/employeeFieldsAdd")
    public ResponseEntity<Iterable<EmployeeFieldsEntity> > SaveOrUpdateEmployeeFields(@RequestBody EmployeeFieldsEntity [] employeeFieldsEntity){
        Iterable<EmployeeFieldsEntity>  empFields  = employeeFieldsService.saveOrUpdateEmployeeFields(employeeFieldsEntity);
        return new ResponseEntity<Iterable<EmployeeFieldsEntity>>(empFields, HttpStatus.CREATED);
    }

    @RequestMapping("/api/dashboard/employeeFieldsGetAll")
    public ResponseEntity<List<EmployeeFieldsEntity> >  getEmployeeEntityFieldList(String groupName){
        List<EmployeeFieldsEntity> employeeFieldsEntityList = employeeFieldsService.getAllEmployeeFields(groupName);

        return new ResponseEntity<List<EmployeeFieldsEntity>>(employeeFieldsEntityList, HttpStatus.OK);
    }
}

