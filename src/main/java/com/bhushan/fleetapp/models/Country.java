package com.bhushan.fleetapp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Country {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String code;
	private String capital;
	private String name;
	private String nationality;
	private String continent;
	
	@OneToMany(mappedBy="country")
	private List<State> states;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public Country(Integer id, String code, String capital, String name, String nationality, String continent,
			List<State> states) {
		super();
		this.id = id;
		this.code = code;
		this.capital = capital;
		this.name = name;
		this.nationality = nationality;
		this.continent = continent;
		this.states = states;
	}

	public Country() {
		super();
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", code=" + code + ", capital=" + capital + ", name=" + name
				+ ", nationality=" + nationality + ", continent=" + continent + ", states=" + states + "]";
	}
}