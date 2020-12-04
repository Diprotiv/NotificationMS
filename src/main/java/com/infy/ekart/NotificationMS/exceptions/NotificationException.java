package com.infy.ekart.NotificationMS.exceptions;

public class NotificationException extends Exception{
	 private static final long serialVersionUID = 1L;
	    public NotificationException() {
	        super();
	    }
	    public NotificationException(String errors) {
	        super(errors);
	    }

}
