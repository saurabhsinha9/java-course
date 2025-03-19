package com.jlcindia.struts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.LabelValueBean;

import com.jlcindia.dao.DAOFactory;
import com.jlcindia.dao.StudentDAO;
import com.jlcindia.hibernate.Student;
import com.jlcindia.hibernate.StudentTO;

public class StudentAction extends DispatchAction {
	String bid;
	int nos;
	String showNext;
	String showPrevious;
	int start;
	int total=5;
	StudentDAO sdao=null;
	public StudentAction() {
		sdao=DAOFactory.getStudentDAO();
	}
	
	public ActionForward displayBatches(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
		List batches=sdao.getBatchesList();
		List batchList=new ArrayList();
		Iterator it=batches.iterator();
		while(it.hasNext()){
			String batch=it.next().toString();
			LabelValueBean lvb=new LabelValueBean(batch, batch);
			batchList.add(lvb);
		}
		HttpSession session=request.getSession();
		session.setAttribute("BatchList", batchList);
		return mapping.findForward("searchHome");
	}
	
	public ActionForward bidSearch(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
		DynaActionForm daf=(DynaActionForm)form;
		bid=daf.get("batchId").toString();
		start=0;
		List batchStudentsList=sdao.findByBatchId(bid, start, total);
		nos=sdao.getNumberOfStudentsByBatch(bid);
		showHideLinks();
		HttpSession session=request.getSession();
		session.setAttribute("NOS", new Integer(nos));
		session.setAttribute("START", new Integer(start+1));
		session.setAttribute("END", new Integer(start+5));
		session.setAttribute("BatchStudentsList", batchStudentsList);
		session.setAttribute("ShowPrevious", showPrevious);
		session.setAttribute("ShowNext", showNext);
		return mapping.findForward("searchHome");
	}

	public ActionForward nextStudents(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
		start=start+total;
		List batchStudentsList=sdao.findByBatchId(bid, start, total);
		HttpSession session=request.getSession();
		session.setAttribute("BatchStudentsList", batchStudentsList);
		showHideLinks();
		session.setAttribute("NOS", new Integer(nos));
		session.setAttribute("START", new Integer(start+1));
		if(nos-start>5){
			session.setAttribute("END", new Integer(start+5));
		}else{
			session.setAttribute("END", new Integer(nos));
		}
		session.setAttribute("ShowPrevious", showPrevious);
		session.setAttribute("ShowNext", showNext);
		return mapping.findForward("searchHome");
	}
	
	public ActionForward previousStudents(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
		start=start-total;
		List batchStudentsList=sdao.findByBatchId(bid, start, total);
		HttpSession session=request.getSession();
		session.setAttribute("BatchStudentsList", batchStudentsList);
		showHideLinks();
		session.setAttribute("NOS", new Integer(nos));
		session.setAttribute("START", new Integer(start+1));
		session.setAttribute("END", new Integer(start+5));
		session.setAttribute("ShowPrevious", showPrevious);
		session.setAttribute("ShowNext", showNext);
		return mapping.findForward("searchHome");
	}
	
	public ActionForward updateStudent(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
		DynaActionForm daf=(DynaActionForm)form;
		Student stu=new Student();
		stu.setStudentId(daf.get("studentId").toString());
		stu.setBatchId(daf.get("batchId").toString());
		stu.setFirstName(daf.get("firstName").toString());
		stu.setLastName(daf.get("lastName").toString());
		stu.setEmail(daf.get("email").toString());
		stu.setPhone(daf.get("phone").toString());
		stu.setGender(daf.get("gender").toString());
		stu.setQualification(daf.get("qualification").toString());
		stu.setTotalFee(new Double(daf.get("totalFee").toString()));
		stu.setFeePaid(new Double(daf.get("feePaid").toString()));
		stu.setFeeBal(new Double(daf.get("feeBal").toString()));
		stu.setStatus(daf.get("status").toString());
		sdao.updateStudent(stu);
		List batchStudentsList=sdao.findByBatchId(bid, start, total);
		HttpSession session=request.getSession();
		session.removeAttribute("STO");
		session.setAttribute("BatchStudentsList", batchStudentsList);
		return mapping.findForward("searchHome");
	}

	public ActionForward showStudentBySid(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
		DynaActionForm daf=(DynaActionForm)form;
		String sid=daf.get("studentId").toString();
		StudentTO sto=sdao.findByStudentId(sid);
		HttpSession session=request.getSession();
		session.setAttribute("STO",sto);
		return mapping.findForward("searchHome");
	}
	private void showHideLinks() {
		if(nos-start>5){
			showNext="TRUE";
		}else{
			showNext="FALSE";
		}
		if(start==0){
			showPrevious="FALSE";
		}else {
			showPrevious="TRUE";
		}
	}
}
