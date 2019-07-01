package com.prudential.client.clientmanagement.repository;

import com.prudential.client.clientmanagement.domain.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {


}
