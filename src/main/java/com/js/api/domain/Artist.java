package com.js.api.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the bornOn
	 */
	public LocalDate getBornOn() {
		return this.bornOn;
	}

	/**
	 * @param bornOn
	 *            the bornOn to set
	 */
	public void setBornOn(LocalDate bornOn) {
		this.bornOn = bornOn;
	}

	/**
	 * @return the diedOn
	 */
	public LocalDate getDiedOn() {
		return this.diedOn;
	}

	/**
	 * @param diedOn
	 *            the diedOn to set
	 */
	public void setDiedOn(LocalDate diedOn) {
		this.diedOn = diedOn;
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
	 * @return the introduction
	 */
	public String getIntroduction() {
		return this.introduction;
	}

	/**
	 * @param introduction
	 *            the introduction to set
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	/**
	 * @return the activityYears
	 */
	public String getActivityYears() {
		return this.activityYears;
	}

	/**
	 * @param activityYears
	 *            the activityYears to set
	 */
	public void setActivityYears(String activityYears) {
		this.activityYears = activityYears;
	}

	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return this.occupation;
	}

	/**
	 * @param occupation
	 *            the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
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

	/**
	 * @return the otherNames
	 */
	public String getOtherNames() {
		return this.otherNames;
	}

	/**
	 * @param otherNames
	 *            the otherNames to set
	 */
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}

}
