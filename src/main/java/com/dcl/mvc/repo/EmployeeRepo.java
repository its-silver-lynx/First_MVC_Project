package com.dcl.mvc.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.dcl.mvc.entity.Employee;

@Repository
public class EmployeeRepo {

	
	public String saveEmployee(Employee e1)
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
    	session.persist(e1);
    	
    	trans.commit();
    	session.close();
    	
    	return "Data Saved Sucessfully";
	}
}
