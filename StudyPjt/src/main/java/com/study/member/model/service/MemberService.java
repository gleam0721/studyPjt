package com.study.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.member.model.dao.MemberDao;
import com.study.member.model.vo.Member;

@Service
public class MemberService {

	@Autowired
	private MemberDao dao;
	
	public Member selectOneMember(Member m) {
		return dao.selectOneMember(m);
	}

	public int insertMember(Member m) {
		return dao.insertMember(m);
	}
}
