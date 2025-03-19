package com.jlc.jsf;

import java.util.Iterator;
import java.util.List;

import javax.faces.component.html.HtmlDataTable;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import com.jlc.util.*;

public class ViewQueryBean extends JLCBaseBean {
	private SelectItem[] catList = null;
	private String catName;
	private List<QueryTO> queryList;
	private int start = 0;
	private int nor = 5;
	private int total;
	private int min;
	private int max;
	private boolean showPreviousLink;
	private boolean showNextLink;
	private boolean showDataTable;
	private HtmlDataTable queryDataTable;
	private boolean editable;
	private QueryTO queryTO;
	private boolean showDetailsPanel;

	public ViewQueryBean() {
		List<String> catNames = queryDAO.getAllCategories();
		System.out.println(catNames);
		Iterator<String> it = catNames.iterator();
		catList = new SelectItem[catNames.size()];
		System.out.println(catList);
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
		System.out.println(this.catName);
	}

	public List<QueryTO> getQueryList() {
		return queryList;
	}

	public void setQueryList(List<QueryTO> queryList) {
		this.queryList = queryList;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getNor() {
		return nor;
	}

	public void setNor(int nor) {
		this.nor = nor;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public boolean isShowPreviousLink() {
		return showPreviousLink;
	}

	public void setShowPreviousLink(boolean showPreviousLink) {
		this.showPreviousLink = showPreviousLink;
	}

	public boolean isShowNextLink() {
		return showNextLink;
	}

	public void setShowNextLink(boolean showNextLink) {
		this.showNextLink = showNextLink;
	}

	public boolean isShowDataTable() {
		return showDataTable;
	}

	public void setShowDataTable(boolean showDataTable) {
		this.showDataTable = showDataTable;
	}

	public HtmlDataTable getQueryDataTable() {
		return queryDataTable;
	}

	public void setQueryDataTable(HtmlDataTable queryDataTable) {
		this.queryDataTable = queryDataTable;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public QueryTO getQueryTO() {
		return queryTO;
	}

	public void setQueryTO(QueryTO queryTO) {
		this.queryTO = queryTO;
	}

	public boolean isShowDetailsPanel() {
		return showDetailsPanel;
	}

	public void setShowDetailsPanel(boolean showDetailsPanel) {
		this.showDetailsPanel = showDetailsPanel;
	}

	public void viewQueries(ActionEvent ae) {
		total = queryDAO.getTotalQueries(catName);
		System.out.println(catName);
		System.out.println(total);
		queryList = queryDAO.getQueries(catName, start, nor);
		System.out.println(queryList);
		showDataTable = true;
		min = start + 1;
		if (total >= 5) {
			max = start + nor;
		} else {
			max = total;

		}
		showHideLinks();
	}

	public void getNextQueries(ActionEvent ae) {
		start = start + nor;
		min = start + 1;
		if (max + nor <= total) {
			max = start + nor;
		} else {
			max = total;
		}
		queryList = queryDAO.getQueries(catName, start, nor);
		showHideLinks();
	}

	public void getPreviousQueries(ActionEvent ae) {
		start = start - nor;
		max = min - 1;
		min = min - nor;
		queryList = queryDAO.getQueries(catName, start, nor);
		showHideLinks();
	}

	private void showHideLinks() {
		if (max == total) {
			showNextLink = false;

		} else {
			showNextLink = true;
		}
		if (min == 1) {
			showPreviousLink = false;
		} else {
			showPreviousLink = true;
		}
	}

	public void viewSelectedQuery(ActionEvent ae) {
		System.out.println("viewSelectedQuery");
		queryTO = (QueryTO) queryDataTable.getRowData();
		showDetailsPanel = true;
	}

	public void editSelectedQuery(ActionEvent ae) {
		editable = true;
	}

	public void saveEditedQuery(ActionEvent ae) {
		editable = false;
		System.out.println("saveEditedQuery");
		QueryTO qto = (QueryTO) queryDataTable.getRowData();
		queryDAO.updateQuery(qto);
	}

	public void cancelShowDetails(ActionEvent ae) {
		showDetailsPanel = false;
	}
}
