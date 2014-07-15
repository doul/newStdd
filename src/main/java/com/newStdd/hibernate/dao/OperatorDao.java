package com.newStdd.hibernate.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.newStdd.po.Operator;

public class OperatorDao extends HibernateDaoSupport {
	
  public void save(Operator operater){
  	getSessionFactory().getCurrentSession().save(operater);
//  	currentSession().save(operater);
}
}
