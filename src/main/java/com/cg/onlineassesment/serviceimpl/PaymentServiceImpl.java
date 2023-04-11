package com.cg.onlineassesment.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineassesment.dao.PaymentDTO;
import com.cg.onlineassesment.entity.Payment;
import com.cg.onlineassesment.repository.PaymentRepository;
import com.cg.onlineassesment.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	   private PaymentRepository paymentRepository;
	@Override
	public PaymentDTO addPayment(PaymentDTO paymentDto) {
		// TODO Auto-generated method stub
		Payment payment = new Payment();
        BeanUtils.copyProperties(paymentDto, payment);
        Payment paymentSave=paymentRepository.save(payment);
        paymentDto.setPaymentid(paymentSave.getPaymentid());
        payment.setBookingId(paymentDto.getBookingId());
        payment.setPaymenttype(paymentDto.getPaymenttype());
        payment.setPaymentdate(paymentDto.getPaymentdate());
        return paymentDto;


	
	}

	@Override
	public PaymentDTO updatePayment(PaymentDTO paymentDTO) {
		// TODO Auto-generated method stub
		Payment payment = new Payment();
        payment.setPaymentid(paymentDTO.getPaymentid());
	payment.setBookingId(paymentDto.getBookingId());
        payment.setPaymenttype(paymentDTO.getPaymenttype());
        payment.setPaymentdate(paymentDTO.getPaymentdate());


        return paymentDTO;

	}

	@Override
	public boolean deletePayment(PaymentDTO paymentDTO) {
		// TODO Auto-generated method stub
		Payment payment = new Payment();
        payment.setPaymentid(paymentDTO.getPaymentid());
        paymentRepository.delete(payment);

		return true;
	}

	@Override
	public PaymentDTO getById(int id) {
		// TODO Auto-generated method stub
		  Optional<Payment> booking = paymentRepository.findById(id);
	        if (booking.isPresent()) {
	            PaymentDTO dto = new PaymentDTO();
	            BeanUtils.copyProperties(booking.get(), dto);
	            return dto;
	        }

		return null;
	}

	@Override
	public List<PaymentDTO> findAll() {
		// TODO Auto-generated method stub
		Iterable<Payment> payment = paymentRepository.findAll();
        List<PaymentDTO> dtos = new ArrayList<>();
        for (Payment payments : payment) {
            PaymentDTO dto = new PaymentDTO();
            BeanUtils.copyProperties(payments, dto);
            dtos.add(dto);
        }

		return null;
	}


}
