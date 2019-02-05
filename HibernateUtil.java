package com.connectionprovider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	public static SessionFactory getsessionfactory() {
		
		AnnotationConfiguration acfg = new AnnotationConfiguration();
		acfg.configure();
		SessionFactory sf = acfg.buildSessionFactory();
		
		return sf;
		
	}
	
	
	

}
