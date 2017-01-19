package com.js.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.js.api.domain.Album;
import com.js.api.service.AlbumService;

@RestController
public class JSApiController {

	@Autowired
	private AlbumService albumService;

	//@RequestMapping(value = "/albums/", method = RequestMethod.GET)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Album>> listAllAlbum() {
		List<Album> albums = albumService.listAllAlbums();
		if (albums.isEmpty()) {
			// You many decide to return HttpStatus.NOT_FOUND
			return new ResponseEntity<List<Album>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Album>>(albums, HttpStatus.OK);
	}

}
