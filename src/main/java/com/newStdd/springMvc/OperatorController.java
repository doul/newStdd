package com.newStdd.springMvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.newStdd.service.interfaces.OperatorServ;

@Controller
public class OperatorController {
	@Autowired
	private OperatorServ operatorServ;	
	
	@RequestMapping(value="/{orm}/operatorInsertInit",method=RequestMethod.GET)
	public ModelAndView operInsert(HttpServletRequest AHttpServletRequest, HttpServletResponse AHttpServletResponse, @PathVariable String orm) throws ServletException, IOException {
    ModelAndView mv = new ModelAndView(); 
    mv.addObject("orm", orm);
    mv.setViewName("operatorInsertInit");  
    return mv;  
	}
	
	@RequestMapping(value="/mybatis/operatorInsertSubmmit",method=RequestMethod.POST)
	@ResponseBody
	public String operInsertSubmmitMybatis(HttpServletRequest AHttpServletRequest, HttpServletResponse AHttpServletResponse) throws ServletException, IOException {
		String operatorId= (String) AHttpServletRequest.getParameter("operatorId");
		String operatorName= (String) AHttpServletRequest.getParameter("operatorName");
		String loginCode= (String) AHttpServletRequest.getParameter("loginCode");
		String loginPassword= (String) AHttpServletRequest.getParameter("loginPassword");	
		operatorServ.insertOperatorMybatis(operatorId, operatorName, loginCode, loginPassword);
		return "";
	}		
	
	@RequestMapping(value="/hibernate/operatorInsertSubmmit",method=RequestMethod.POST)
	@ResponseBody
	public String operInsertSubmmitHibernate(HttpServletRequest AHttpServletRequest, HttpServletResponse AHttpServletResponse) throws ServletException, IOException {
		String operatorId= (String) AHttpServletRequest.getParameter("operatorId");
		String operatorName= (String) AHttpServletRequest.getParameter("operatorName");
		String loginCode= (String) AHttpServletRequest.getParameter("loginCode");
		String loginPassword= (String) AHttpServletRequest.getParameter("loginPassword");	
		operatorServ.insertOperatorHibernate(operatorId, operatorName, loginCode, loginPassword);
		return "";
	}			
}
