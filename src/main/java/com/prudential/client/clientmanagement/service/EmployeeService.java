package com.prudential.client.clientmanagement.service;

import com.prudential.client.clientmanagement.domain.EmployeeEntity;
import com.prudential.client.clientmanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeEntity saveOrUpdateEmployee(EmployeeEntity employeeEntity){
        return employeeRepository.save(employeeEntity);
    }

    public void deleteEmployee(EmployeeEntity employeeEntity){
         employeeRepository.delete(employeeEntity);

    }

    public List<EmployeeEntity> getAllEmployees() {
        List<EmployeeEntity> empList = new ArrayList<>();
        Iterable<EmployeeEntity> iterable = employeeRepository.findAll();
        iterable.forEach(empList::add);
        return empList;
    }
}
