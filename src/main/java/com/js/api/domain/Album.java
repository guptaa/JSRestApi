package com.js.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "album")
@Data
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

	@Column(name = "pics" )
	private String pics;
}
