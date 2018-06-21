package com.zone;

public enum Hemisphere {

	NORTH("N","North"), SOUTH("S","South");

	private final String key;

	private final String value;

	Hemisphere(String key, String value) {
		this.key = key;
		this.value = value;
	}

}
