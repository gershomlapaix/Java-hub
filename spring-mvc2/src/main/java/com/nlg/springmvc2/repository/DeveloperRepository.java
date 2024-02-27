package com.nlg.springmvc2.repository;

import com.nlg.springmvc2.model.Developer;
import org.springframework.data.repository.CrudRepository;

public interface DeveloperRepository extends CrudRepository<Developer, Long> {
}
