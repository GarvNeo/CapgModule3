package com.cg.db_utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseON {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	
	static{
		factory= Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public EntityManager getManager() {
		if(manager==null || !manager.isOpen())
			manager=factory.createEntityManager();
		else
			getManager();
		return manager;
	}
}
