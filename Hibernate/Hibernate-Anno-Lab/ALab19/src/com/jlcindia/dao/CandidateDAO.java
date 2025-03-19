package com.jlcindia.dao;

import java.util.List;

import com.jlcindia.bean.Candidate;

public interface CandidateDAO {
	public void addCandidate(Candidate can);
	public void updateCandidate(Candidate can);
	public void deleteCandidate(int cid);
	public Candidate getCandidateByCid(int cid);
	public List<Candidate> getAllCandidate();
}
