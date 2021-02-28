package com.study.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.study.member.model.service.MemberService;
import com.study.member.model.vo.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;

	@RequestMapping("/memberLogin.do")
	public String login(Member m, HttpSession session, Model model) {
		Member member = service.selectOneMember(m);
		if(member != null) {
			session.setAttribute("m", member);
			model.addAttribute("msg", "환영합니다.");
		}else {
			model.addAttribute("msg", "아이디 또는 비밀번호를 확인해주세요");
		}
		model.addAttribute("loc", "/");
		return "common/msg";
	}
	
	@RequestMapping("/joinFrm.do")
	public String joinFrm() {
		return "member/joinFrm";
	}
	
	@RequestMapping("/joinMember.do")
	public String joinMember(Member m, Model model) {
		int result = service.insertMember(m);
		if(result>0) {
			model.addAttribute("msg", "회원가입이 완료되었습니다.");
		}else {
			model.addAttribute("msg", "회원가입실패. 관리자에게 문의하세요.");
		}
		model.addAttribute("loc", "/");
		return "common/msg";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session, Model model, @SessionAttribute(required = false) Member member) {
		if (member != null) {
			session.invalidate();
			model.addAttribute("msg", "로그아웃 되었습니다.");
		} else {
			model.addAttribute("msg", "로그인되어있지 않습니다.");
		}
		model.addAttribute("loc", "/main.do");
		return "common/msg";
	}
}
