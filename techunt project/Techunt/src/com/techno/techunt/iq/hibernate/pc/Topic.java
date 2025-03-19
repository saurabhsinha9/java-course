package com.techno.techunt.iq.hibernate.pc;

public class Topic {
	private int topicid;
	private String topicname;
	private int numberofquestion;
	public Topic()
	 {
		 System.out.println("def cons of topic");
	 }
	
	public Topic(String topicname) {
		super();
		this.topicname = topicname;
		System.out.println("1 arg cons of topic");
	}
	//setter and getters
	public int getTopicid() {
		System.out.println("getter of gettopic id");
		return topicid;
	}
	public void setTopicid(int topicid) {
		System.out.println("setter of settopicid");
		this.topicid = topicid;
	}
	public String getTopicname() {
		return topicname;
	}
	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}
	public int getNumberofquestion() {
		return numberofquestion;
	}
	public void setNumberofquestion(int numberofquestion) {
		this.numberofquestion = numberofquestion;
	}
	
	
	
	
	
	

}
