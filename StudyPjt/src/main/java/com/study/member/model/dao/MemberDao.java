package com.study.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.member.model.vo.Member;


@Repository
public class MemberDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public Member selectOneMember(Member m) {
		return sqlSession.selectOne("member.selectOneMember",m);
	}

	public int insertMember(Member m) {
		return sqlSession.insert("member.insertMember",m);
	}
	
}
