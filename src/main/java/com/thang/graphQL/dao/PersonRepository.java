package com.thang.graphQL.dao;

import com.thang.graphQL.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Integer> {
    Person findByEmail(String email);
}
