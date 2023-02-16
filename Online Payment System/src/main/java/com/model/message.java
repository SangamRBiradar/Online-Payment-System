package com.model;

public class message {
	private String content;
	private String type;
	private String css;
	public message(String content, String type, String css) {
		super();
		this.content = content;
		this.type = type;
		this.css = css;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCss() {
		return css;
	}
	public void setCss(String css) {
		this.css = css;
	}
	
	
}
