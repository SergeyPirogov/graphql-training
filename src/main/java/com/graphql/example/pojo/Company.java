package com.graphql.example.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company{

	@JsonProperty("coo")
	private String coo;

	@JsonProperty("name")
	private String name;

	@JsonProperty("employees")
	private int employees;

	@JsonProperty("ceo")
	private String ceo;

	public String getCoo(){
		return coo;
	}

	public String getName(){
		return name;
	}

	public int getEmployees(){
		return employees;
	}

	public String getCeo(){
		return ceo;
	}
}