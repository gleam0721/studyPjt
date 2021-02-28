package com.study.member.model.vo;

import lombok.Data;

@Data
public class Member {
	private int memberNo;
	private int employeeNo;
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberTel;
	private String memberPhone;
	private String memberEmail;
	private int memberPermission;
	private String memberPosition;
}
