package com.js.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.js.api.domain.Poem;

@Repository
public interface PoemRepository extends CrudRepository<Poem, Integer> {

}
