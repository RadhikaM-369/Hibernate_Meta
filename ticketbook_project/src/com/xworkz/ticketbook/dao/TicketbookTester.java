package com.xworkz.ticketbook.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TicketbookTester {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManangerFactory=Persistence.createEntityManagerFactory("com.xworkz.ticketbook");
		System.out.println(entityManangerFactory);
	}

}
