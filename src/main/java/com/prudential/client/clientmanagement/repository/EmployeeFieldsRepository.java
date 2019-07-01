package com.prudential.client.clientmanagement.repository;

import com.prudential.client.clientmanagement.domain.EmployeeFieldsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeFieldsRepository extends CrudRepository<EmployeeFieldsEntity,Integer> {


    List<EmployeeFieldsEntity> findByGroupName(String groupName);
}
