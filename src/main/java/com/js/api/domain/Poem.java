package com.js.api.domain;

import static javax.persistence.CascadeType.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "poem")
public class Poem {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "title")
	private String title;

	@ManyToOne(optional = false, cascade = ALL)
	@JoinColumn(name = "album")
	private Album album;

	@Column(name = "more_info")
	private String moreInfo;

	@Column(name = "other_albums")
	private String otherAlbums;

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
	 * @return the album
	 */
	public Album getAlbum() {
		return this.album;
	}

	/**
	 * @param album
	 *            the album to set
	 */
	public void setAlbum(Album album) {
		this.album = album;
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

	/**
	 * @return the otherAlbums
	 */
	public String getOtherAlbums() {
		return this.otherAlbums;
	}

	/**
	 * @param otherAlbums
	 *            the otherAlbums to set
	 */
	public void setOtherAlbums(String otherAlbums) {
		this.otherAlbums = otherAlbums;
	}

}
