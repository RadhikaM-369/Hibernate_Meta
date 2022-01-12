package com.xworkz.ticketbook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket_details")
public class TicketbookEntity {
	@Id
	@Column(name="ticketID")
	private int Tid;
	
	@Column(name="availableSeats")
	private int noOfSeatsAvailable;
	
	@Column(name="Passengername")
	private String passengerName;
	
	@Column(name="Route")
	private String route;
	
	@Column(name="Date_time")
	private String dateTime;
	
	@Column(name="Amount")
	private int amount;
	
		public TicketbookEntity() {
		super();
		}

	public TicketbookEntity(int tid, int noOfSeatsAvailable, String passengerName, String route, String dateTime,
			int amount) {
		super();
		Tid = tid;
		this.noOfSeatsAvailable = noOfSeatsAvailable;
		this.passengerName = passengerName;
		this.route = route;
		this.dateTime = dateTime;
		this.amount = amount;
	}

	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public int getNoOfSeatsAvailable() {
		return noOfSeatsAvailable;
	}
	public void setNoOfSeatsAvailable(int noOfSeatsAvailable) {
		this.noOfSeatsAvailable = noOfSeatsAvailable;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TicketbookEntity [Tid=" + Tid + ", noOfSeatsAvailable=" + noOfSeatsAvailable + ", passengerName="
				+ passengerName + ", route=" + route + ", dateTime=" + dateTime + ", amount=" + amount + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
	
	
	

}
