package com.cg.onlineassesment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	@Id
    private int paymentid;
    private String  paymenttype;
    private String paymentdate;
    private int bookingId;



    public int getPaymentid() {
        return paymentid;
    }
    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }
   
    public String getPaymentdate() {
        return paymentdate;
    }
    public void setPaymentdate(String paymentdate) {
        this.paymentdate = paymentdate;
    }
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
    
    
   
}
