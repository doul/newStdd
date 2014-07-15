package com.newStdd.service.interfaces;

public interface OperatorServ {
	public void insertOperatorMybatis(String operatorId, String operatorName, String loginCode, String loginPassword);
	public void insertOperatorHibernate(String operatorId, String operatorName, String loginCode, String loginPassword);
}