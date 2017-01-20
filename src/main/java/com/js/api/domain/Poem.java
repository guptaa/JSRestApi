package com.js.api.domain;

import static javax.persistence.CascadeType.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
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
}
