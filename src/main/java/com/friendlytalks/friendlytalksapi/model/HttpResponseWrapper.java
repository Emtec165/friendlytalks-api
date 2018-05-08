package com.friendlytalks.friendlytalksapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
public class HttpResponseWrapper<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	private T payload;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String token;

	public HttpResponseWrapper(T payload) {
		this.payload = payload;
	}

	public HttpResponseWrapper(T payload, String token) {
		this.payload = payload;
		this.token = token;
	}
}