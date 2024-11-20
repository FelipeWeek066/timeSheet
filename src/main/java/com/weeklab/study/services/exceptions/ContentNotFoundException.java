package com.weeklab.study.services.exceptions;

public class ContentNotFoundException extends RuntimeException{
	
	public ContentNotFoundException(Object id) {
		super("Resource Not Found, Id = " + id);
	}

}
