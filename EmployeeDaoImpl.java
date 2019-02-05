package com.employee.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Repository;

import com.connectionprovider.HibernateUtil;
import com.employee.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> listEmployee() {
		List<Employee> list = new ArrayList<>();
		
		SessionFactory sessionFactory = HibernateUtil.getsessionfactory();
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    Query query = session.createQuery("from Employee");
	    list = query.list();
	    transaction.commit();
	    session.close();
		return list;
	}

	@Override
	public void addEmployee(Employee employee) {
		SessionFactory sessionFactory = HibernateUtil.getsessionfactory();
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    session.save(employee);
	    transaction.commit();
	    session.close();
	    
		
	}

	@Override
	public void editEmployee(Employee employee) {
		SessionFactory sessionFactory = HibernateUtil.getsessionfactory();
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    session.update(employee);
	    transaction.commit();
	    session.close();
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getsessionfactory();
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    session.delete(employee);
	    transaction.commit();
	    session.close();
		
	}

}
