package com.js.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.js.api.domain.Pics;

@Repository
public interface PicsRepository extends CrudRepository<Pics, Integer> {

}
