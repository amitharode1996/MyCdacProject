

package com.example.demo.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="book_tbl")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	int bid;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date book_date;
	
	
	@Column
	double amount ;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	Date delivery_date;
	
	//@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name = "cid")//constraint : NOT NULL : Optional BUT recommended
	//@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	
	@Column
	private int cid;
	
	
	
	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "d_id")
	private Distributor distributor_tbl;*/
	/*
	@OneToMany(mappedBy = "OId", cascade = CascadeType.ALL)
	private List<BookingHistory> bhistory;
	
	*/
	/*
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)	  
	Customer customer_tbl;
	*/
	@Column
	String payment_mode;
	
	//@Column
	//int transaction_id;
	
	//@Column
	//Date payment_date;
	
	/*@Enumerated(EnumType.STRING)
	@Column(name = "delivery_status")
	private DeliveryStatus deliveryStatus;
*/
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public Booking(Date book_date, double amount, Date delivery_date, int cid, String payment_mode
			) {
		super();
		this.book_date = book_date;
		this.amount = amount;
		this.delivery_date = delivery_date;
		this.cid = cid;
		
		this.payment_mode = payment_mode;
		//this.deliveryStatus = deliveryStatus;
	}





	public int getBid() {
		return bid;
	}





	public void setBid(int bid) {
		this.bid = bid;
	}





	public Date getBook_date() {
		return book_date;
	}





	public void setBook_date(Date book_date) {
		this.book_date = book_date;
	}





	public double getAmount() {
		return amount;
	}





	public void setAmount(double amount) {
		this.amount = amount;
	}





	public Date getDelivery_date() {
		return delivery_date;
	}





	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}









	public int getCid() {
		return cid;
	}





	public void setCid(int cid) {
		this.cid = cid;
	}










	public String getPayment_mode() {
		return payment_mode;
	}





	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}





	@Override
	public String toString() {
		return "Booking [bid=" + bid + ", book_date=" + book_date + ", amount=" + amount + ", delivery_date="
				+ delivery_date + ", cid=" + cid + ", payment_mode=" + payment_mode + "]";
	}









	


/*

	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}





	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

*/












}	