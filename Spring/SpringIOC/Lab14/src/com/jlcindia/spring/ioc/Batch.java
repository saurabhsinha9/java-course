package com.jlcindia.spring.ioc;

public class Batch {
	String bid;
	String sd;
	String timings;
	int nos;
	public Batch(String bid, String sd, String timings, int nos) {
		super();
		this.bid = bid;
		this.sd = sd;
		this.timings = timings;
		this.nos = nos;
	}
	
	public String toString() {
		return "Batch Anno...New Batch [bid=" + bid + ", sd=" + sd + ", timings=" + timings
				+ ", nos=" + nos + "]";
	}
	
	
}
