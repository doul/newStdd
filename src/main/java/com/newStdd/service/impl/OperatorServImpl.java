package com.newStdd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.newStdd.hibernate.dao.OperatorDao;
import com.newStdd.mybatis.OperatorMapper;
import com.newStdd.po.Operator;
import com.newStdd.service.interfaces.OperatorServ;

public class OperatorServImpl implements OperatorServ{
	@Autowired
	private OperatorMapper operatorMapper;	
	@Autowired
	private OperatorDao operatorDao;

	public void insertOperatorMybatis(String operatorId, String operatorName, String loginCode, String loginPassword) {
		Operator operator= new Operator();
		operator.setOperatorId(operatorId);
		operator.setOperatorName(operatorName);
		operator.setLoginCode(loginCode);
		operator.setLoginPassword(loginPassword);
		operatorMapper.insertOperator(operator);
	}
	
	public void insertOperatorHibernate(String operatorId, String operatorName, String loginCode, String loginPassword) {
		Operator operator= new Operator();
		operator.setOperatorId(operatorId);
		operator.setOperatorName(operatorName);
		operator.setLoginCode(loginCode);
		operator.setLoginPassword(loginPassword);
		operatorDao.save(operator);
	}	
	
}
