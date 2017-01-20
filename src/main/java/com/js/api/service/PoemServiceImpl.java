/*
 * Copyright 2017 Virgin Australia Airlines Pty Limited. All rights reserved. Not to be copied, redistributed or
 * modified without prior written consent of Virgin Australia Airlines Pty Limited
 */
package com.js.api.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.js.api.domain.Poem;
import com.js.api.repository.PoemRepository;

/**
 * @version $Revision$
 * @author <a href="arvind.gupta@virginaustralia.com">Arvind Gupta</a>
 */
@Service
@Transactional
public class PoemServiceImpl implements PoemService {

	
	@Resource
	private PoemRepository poemRepository;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Poem> listAllPoemsFromAnAlbum(Integer id) {
		
		return poemRepository.findByAlbum(id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Poem> listAllPoems() {
		return poemRepository.findAll();
	}

}
