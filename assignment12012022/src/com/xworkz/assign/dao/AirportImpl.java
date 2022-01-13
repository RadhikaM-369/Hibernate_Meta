package com.xworkz.assign.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.assign.entity.AirportEntity;
import com.xworkz.assign.util.EMFUtil;

public class AirportImpl implements AirportInterf{
	
	public void put(AirportEntity entity) {
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
				
				
				EntityManager entityManager=entityManagerFactory.createEntityManager();
				EntityTransaction trans=entityManager.getTransaction();
				
				trans.begin();
				entityManager.persist(entity);
				trans.commit();
			}

	}
