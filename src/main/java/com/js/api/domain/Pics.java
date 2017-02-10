package com.js.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pics")
public class Pics {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "title")
	private String title;

	@Column(name = "path")
	private String path;

	@Column(name = "album")
	private Integer album;

	@Column(name = "artist")
	private Integer artist;

	@Column(name = "more_info")
	private String moreInfo;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return this.path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the album
	 */
	public Integer getAlbum() {
		return this.album;
	}

	/**
	 * @param album
	 *            the album to set
	 */
	public void setAlbum(Integer album) {
		this.album = album;
	}

	/**
	 * @return the artist
	 */
	public Integer getArtist() {
		return this.artist;
	}

	/**
	 * @param artist
	 *            the artist to set
	 */
	public void setArtist(Integer artist) {
		this.artist = artist;
	}

	/**
	 * @return the moreInfo
	 */
	public String getMoreInfo() {
		return this.moreInfo;
	}

	/**
	 * @param moreInfo
	 *            the moreInfo to set
	 */
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}

}
