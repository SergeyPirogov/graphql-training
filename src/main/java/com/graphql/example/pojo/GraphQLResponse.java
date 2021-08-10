package com.graphql.example.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GraphQLResponse<T> {

	@JsonProperty("data")
	private Data<T> data;

	public Data<T> getData(){
		return data;
	}
}