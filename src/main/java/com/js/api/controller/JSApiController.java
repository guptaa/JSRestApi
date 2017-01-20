package com.js.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.js.api.domain.Album;
import com.js.api.domain.Poem;
import com.js.api.service.AlbumService;
import com.js.api.service.PoemService;

@RestController
public class JSApiController {

	@Autowired
	private AlbumService albumService;

	@Autowired
	private PoemService poemService;

	@RequestMapping(value = "/albums/", method = RequestMethod.GET)
	public ResponseEntity<List<Album>> listAllAlbum() {
		List<Album> albums = albumService.listAllAlbums();
		if (albums.isEmpty()) {
			// You many decide to return HttpStatus.NOT_FOUND
			return new ResponseEntity<List<Album>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Album>>(albums, HttpStatus.OK);
	}

	@RequestMapping(value = "/poems/{album}", method = RequestMethod.GET)
	public ResponseEntity<List<Poem>> listAllPoemFromAnAlbum(@PathVariable String album) {
		List<Poem> poems = poemService.listAllPoemsFromAnAlbum(new Integer(album));

		if (poems.isEmpty()) {
			return new ResponseEntity<List<Poem>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Poem>>(poems, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/poems/", method = RequestMethod.GET)
	public ResponseEntity<List<Poem>> listAllPoem() {
		List<Poem> poems = poemService.listAllPoems();

		if (poems.isEmpty()) {
			return new ResponseEntity<List<Poem>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Poem>>(poems, HttpStatus.OK);
	}

}
