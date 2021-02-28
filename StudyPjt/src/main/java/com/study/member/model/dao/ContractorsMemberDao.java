package com.study.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.member.model.vo.ContractorsMember;

@Repository
public class ContractorsMemberDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public ContractorsMember selectOneMember(ContractorsMember cm) {
		return sqlSession.selectOne("contractorsMember.selectOneMember",cm);
	}

	public int insertMember(ContractorsMember cm) {
		return sqlSession.insert("contractorsMember.insertMember",cm);
	}
}
