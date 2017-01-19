package com.js.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.js.api.domain.Couplet;

@Repository
public interface CoupletRepository extends CrudRepository<Couplet, Integer> {

}
