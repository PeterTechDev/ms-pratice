package com.peter.hrpayroll.services;

import entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Harden", 200.0, days);

    }
}
