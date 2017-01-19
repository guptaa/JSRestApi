package com.js.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.js.api.domain.Artist;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Integer> {

}
