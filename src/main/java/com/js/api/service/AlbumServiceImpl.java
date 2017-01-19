package com.js.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.js.api.domain.Album;
import com.js.api.repository.AlbumRepository;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {

	@Resource
	private AlbumRepository albumRepository;

	@Override	
	public List<Album> listAllAlbums() {
		List<Album> albums = new ArrayList<Album>();

		Iterable<Album> source = albumRepository.findAll();

		source.forEach(albums::add);

		return albums;
	}

}
