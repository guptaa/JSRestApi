package com.js.api.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Artist")
public class Artist {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "born_on")
	private LocalDate bornOn;

	@Column(name = "died_on")
	private LocalDate diedOn;

	@Column(name = "more_info")
	private String moreInfo;

	@Column(name = "introduction")
	private String introduction;

	@Column(name = "activity_years")
	private String activityYears;

	@Column(name = "occupation")
	private String occupation;

	@Column(name = "pics")
	private String pics;

	@Column(name = "other_names")
	private String otherNames;
}
