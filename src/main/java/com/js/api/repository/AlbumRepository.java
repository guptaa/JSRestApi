package com.js.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.js.api.domain.Album;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Integer> {
	
	public Album findById(Integer id);

}
