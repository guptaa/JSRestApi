package com.js.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
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

}
