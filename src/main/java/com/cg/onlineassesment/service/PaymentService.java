package com.cg.onlineassesment.service;

import java.util.List;

import com.cg.onlineassesment.dao.PaymentDTO;

public interface PaymentService {
	public  PaymentDTO addPayment(PaymentDTO paymentDto);

    public PaymentDTO updatePayment(PaymentDTO paymentDTO);

    public boolean deletePayment(PaymentDTO paymentDTO);

    public PaymentDTO getById( int id);

    public List<PaymentDTO> findAll();

}
