package com.example.vault;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("config")
public class MyConfiguration {

	private String authtoke;
	private String value;
	public String getAuthtoke() {
		return authtoke;
	}
	public void setAuthtoke(String authtoke) {
		this.authtoke = authtoke;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
