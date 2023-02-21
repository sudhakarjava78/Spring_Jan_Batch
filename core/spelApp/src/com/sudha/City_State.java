package com.sudha;

public class City_State {

	private String city;
	private String state;

	public City_State(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "City_State [city=" + city + ", state=" + state + "]";
	}

}
