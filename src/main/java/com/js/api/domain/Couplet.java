package com.js.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "couplet")
public class Couplet {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "description")
	private String description;

	@Column(name = "poet")
	private Integer poet;

	@Column(name = "other_singer")
	private Integer otherSinger;

	@Column(name = "composer")
	private Integer composer;

	@Column(name = "poem")
	private Integer poem;

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
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the poet
	 */
	public Integer getPoet() {
		return this.poet;
	}

	/**
	 * @param poet
	 *            the poet to set
	 */
	public void setPoet(Integer poet) {
		this.poet = poet;
	}

	/**
	 * @return the otherSinger
	 */
	public Integer getOtherSinger() {
		return this.otherSinger;
	}

	/**
	 * @param otherSinger
	 *            the otherSinger to set
	 */
	public void setOtherSinger(Integer otherSinger) {
		this.otherSinger = otherSinger;
	}

	/**
	 * @return the composer
	 */
	public Integer getComposer() {
		return this.composer;
	}

	/**
	 * @param composer
	 *            the composer to set
	 */
	public void setComposer(Integer composer) {
		this.composer = composer;
	}

	/**
	 * @return the poem
	 */
	public Integer getPoem() {
		return this.poem;
	}

	/**
	 * @param poem
	 *            the poem to set
	 */
	public void setPoem(Integer poem) {
		this.poem = poem;
	}

}
