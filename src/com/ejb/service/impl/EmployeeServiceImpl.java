package com.ejb.service.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.metamodel.EmbeddableType;


import com.ejb.services.EmployeeService;
import com.jpa.entities.Employee;

@Stateless
public class EmployeeServiceImpl implements EmployeeService {
	
	@PersistenceContext(name = "crud_ejb_jpa_jsf")
	private EntityManager em;

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
