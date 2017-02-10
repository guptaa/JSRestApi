package com.js.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class Album {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "title")
	private String title;

	@Column(name = "release_year")
	private Integer releaseYear;

	@Column(name = "more_info")
	private String moreInfo;

	@Column(name = "pics")
	private String pics;

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
	 * @return the releaseYear
	 */
	public Integer getReleaseYear() {
		return this.releaseYear;
	}

	/**
	 * @param releaseYear
	 *            the releaseYear to set
	 */
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
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
	 * @return the pics
	 */
	public String getPics() {
		return this.pics;
	}

	/**
	 * @param pics
	 *            the pics to set
	 */
	public void setPics(String pics) {
		this.pics = pics;
	}

}
