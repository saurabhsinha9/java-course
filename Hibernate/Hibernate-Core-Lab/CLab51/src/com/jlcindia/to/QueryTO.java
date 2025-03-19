package com.jlcindia.to;

public class QueryTO {
	private int queryId;
	private String subject;
	private String author;
	private String postDate;
	private String catName;
	private String description;

	public QueryTO() {
	}

	public QueryTO(int queryId, String subject, String author, String postDate,
			String catName, String description) {
		this.queryId = queryId;
		this.subject = subject;
		this.author = author;
		this.postDate = postDate;
		this.catName = catName;
		this.description = description;
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

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
