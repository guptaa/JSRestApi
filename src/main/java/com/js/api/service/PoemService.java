package com.js.api.service;

import java.util.List;

import com.js.api.domain.Poem;

public interface PoemService {
	public List<Poem> listAllPoems();
	public List<Poem> listAllPoemsFromAnAlbum(Integer Id);

}
