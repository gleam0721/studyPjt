package com.study.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.member.model.dao.ContractorsMemberDao;
import com.study.member.model.vo.ContractorsMember;

@Service
public class ContractorsMemberService {

	@Autowired
	private ContractorsMemberDao dao;

	public ContractorsMember selectOneMember(ContractorsMember cm) {
		return dao.selectOneMember(cm);
	}

	public int insertMember(ContractorsMember cm) {
		return dao.insertMember(cm);
	}
}
