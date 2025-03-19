package com.jlc.jsf;

import java.util.Iterator;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;

import com.jlc.util.*;

public class PostQueryBean extends JLCBaseBean {
	private SelectItem[] catList = null;
	private String catName;
	private String subject;
	private String description;
	private String postDate;
	private String author;

	public PostQueryBean() {
		List<String> catNames = queryDAO.getAllCategories();
		Iterator<String> it = catNames.iterator();
		catList = new SelectItem[catNames.size()];
		int i = 0;
		while (it.hasNext()) {

			String cat = it.next();
			SelectItem si = new SelectItem(cat);
			catList[i] = si;
			i++;
		}
	}

	public SelectItem[] getCatList() {
		return catList;
	}

	public void setCatList(SelectItem[] catList) {
		this.catList = catList;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@SuppressWarnings("deprecation")
	public String postQuery() {
		String str = "success";
		java.util.Date d = new java.util.Date();
		postDate = "" + d.getDate() + "-" + d.getMonth() + "-" + d.getYear();
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession hs = (HttpSession) ec.getSession(false);
		UserTO userTO = (UserTO) hs.getAttribute("UTO");
		author = userTO.getUsername();
		QueryTO qto = new QueryTO();
		qto.setAuthor(author);
		qto.setCatName(catName);
		qto.setDescription(description);
		qto.setPostDate(postDate);
		qto.setSubject(subject);
		int x = queryDAO.postQuery(qto);
		if (x == 0) {
			str = "failure";
			fc.addMessage("postQueryError", new FacesMessage(
					"Your Query is not Posted.."));
		}
		return str;
	}
}
