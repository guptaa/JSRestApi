package com.js.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.js.api.domain.Album;
import com.js.api.domain.Poem;

@Repository
public interface PoemRepository extends JpaRepository<Poem, Integer> {
	
	public List<Poem> findByAlbum(Album album); 

}
