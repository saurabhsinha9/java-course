package com.jlcindia.spring.ioc;

public class Workshop {
	String topic;
	double fee;
	int nos;
	public Workshop(String topic, double fee, int nos) {
		super();
		this.topic = topic;
		this.fee = fee;
		this.nos = nos;
	}
	
	public String toString() {
		return "JLC Anno... New Workshop [topic=" + topic + ", fee=" + fee + ", nos=" + nos
				+ "]";
	}
	
}
