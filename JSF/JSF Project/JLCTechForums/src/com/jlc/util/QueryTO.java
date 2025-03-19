package com.jlc.util;

public class QueryTO {
	private int queryId;
	private String subject;
	private String author;
	private String catName;
	private String postDate;
	private String description;

	public QueryTO() {

	}

	public QueryTO(int queryId, String subject, String author, String catName,
			String postDate, String descrition) {
		this.queryId = queryId;
		this.subject = subject;
		this.author = author;
		this.catName = catName;
		this.postDate = postDate;
		this.description = descrition;
	}

	public int getQueryId() {
		return queryId;
	}

	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
