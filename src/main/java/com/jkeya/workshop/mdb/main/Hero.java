package com.jkeya.workshop.mdb.main;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

/**
 * JPA entity class for a Hero. Re-used in the API layer.
 */
@Entity
public class Hero {
	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Size(min = 3, max = 50)
	private String name;

	private String otherName;

	@NotNull
	@Positive
	private Integer level;

	private String picture;

	@Column(columnDefinition = "TEXT")
	private String powers;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOtherName() {
		return this.otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPowers() {
		return this.powers;
	}

	public void setPowers(String powers) {
		this.powers = powers;
	}

	@Override
	public String toString() {
		return "Hero{" +
			"id=" + this.id +
			", name='" + this.name + '\'' +
			", otherName='" + this.otherName + '\'' +
			", level=" + this.level +
			", picture='" + this.picture + '\'' +
			", powers='" + this.powers + '\'' +
			'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Hero hero = (Hero) o;
		return this.id.equals(hero.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id);
	}
}
