package com.masai.exceptions;

public class RouteException extends RuntimeException{

	  public RouteException() {
    }
    
    public RouteException(String message) {
        super(message);
    }
}
