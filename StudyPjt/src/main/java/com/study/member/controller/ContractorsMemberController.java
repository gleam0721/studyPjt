package com.study.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.member.model.service.ContractorsMemberService;
import com.study.member.model.vo.ContractorsMember;

@Controller
public class ContractorsMemberController {

	@Autowired
	private ContractorsMemberService service;
	
	@RequestMapping("/constractorsMemberLogin.do")
	public String login(ContractorsMember cm, HttpSession session, Model model) {
		ContractorsMember cmember = service.selectOneMember(cm);
		if(cmember != null) {
			session.setAttribute("m", cmember);
			model.addAttribute("msg", "환영합니다.");
		}else {
			model.addAttribute("msg", "아이디 또는 비밀번호를 확인해주세요");
		}
		model.addAttribute("loc", "/");
		return "common/msg";
	}
	
	@RequestMapping("/joinConstractorsMember.do")
	public String joinMember(ContractorsMember cm, Model model) {
		int result = service.insertMember(cm);
		if(result>0) {
			model.addAttribute("msg", "회원가입이 완료되었습니다.");
		}else {
			model.addAttribute("msg", "회원가입실패. 관리자에게 문의하세요.");
		}
		model.addAttribute("loc", "/");
		return "common/msg";
	}
}
