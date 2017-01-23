package com.js.api.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.js.api.domain.Album;
import com.js.api.domain.Poem;
import com.js.api.repository.AlbumRepository;
import com.js.api.repository.PoemRepository;

@Service
@Transactional
public class PoemServiceImpl implements PoemService {

	@Resource
	private PoemRepository poemRepository;

	@Resource
	private AlbumRepository albumRepository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Poem> listAllPoemsFromAnAlbum(Integer id) {

		Album album = albumRepository.findById(id);

		return poemRepository.findByAlbum(album);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Poem> listAllPoems() {
		return poemRepository.findAll();
	}

}
