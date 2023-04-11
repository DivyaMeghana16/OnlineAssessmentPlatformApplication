package com.cg.onlineassesment.dao;

public class PaymentDTO {
	private int paymentid;
    private String paymenttype;
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
