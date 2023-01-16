package com.example.academy.response;

import java.util.Date;
import java.util.List;

public class Response {

	private Date date;
	private String message;
	private List<String> errorMessages;
	private Object data;

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(Date date, String message, List<String> errorMessages, Object data) {
		super();
		this.date = date;
		this.message = message;
		this.errorMessages = errorMessages;
		this.data = data;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Response [date=" + date + ", message=" + message + ", errorMessages=" + errorMessages + ", data=" + data
				+ "]";
	}

}
