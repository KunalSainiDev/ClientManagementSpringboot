package com.prudential.client.clientmanagement.service;

import com.prudential.client.clientmanagement.domain.EmployeeFieldsEntity;
import com.prudential.client.clientmanagement.repository.EmployeeFieldsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeFieldsService {

    @Autowired
    private EmployeeFieldsRepository employeeFieldsRepository;

    public Iterable<EmployeeFieldsEntity>  saveOrUpdateEmployeeFields(EmployeeFieldsEntity [] employeeFieldsEntity) {

        List<EmployeeFieldsEntity> employeeFieldsEntityIterable = Arrays.asList(employeeFieldsEntity);

        Iterable<EmployeeFieldsEntity> iterableEmployeeFields = employeeFieldsRepository.saveAll(employeeFieldsEntityIterable);
        return iterableEmployeeFields;
    }

    public List<EmployeeFieldsEntity> getAllEmployeeFields(String groupName) {

        return employeeFieldsRepository.findByGroupName(groupName);
    }
}
