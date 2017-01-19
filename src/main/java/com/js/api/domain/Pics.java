package com.js.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
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

}
