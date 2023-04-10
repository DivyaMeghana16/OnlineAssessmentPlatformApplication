package com.cg.onlineassesment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineassesment.entity.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {
	  Iterable<Payment> findAll();
}
