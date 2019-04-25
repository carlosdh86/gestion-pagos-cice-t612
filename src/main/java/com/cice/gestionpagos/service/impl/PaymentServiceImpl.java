package com.cice.gestionpagos.service.impl;

import com.cice.gestionpagos.controller.dto.PaymentDTO;
import com.cice.gestionpagos.repository.PaymentRepository;
import com.cice.gestionpagos.repository.entity.PaymentEntity;
import com.cice.gestionpagos.service.PaymentService;
import com.cice.gestionpagos.service.converter.PaymentDTOToPaymentEntityConverter;
import com.cice.gestionpagos.service.converter.PaymentEntityToPaymentDTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public PaymentDTO generatePayment(PaymentDTO paymentDTO) {
        PaymentDTO generatedPaymentDTO = null;

        PaymentEntity paymentEntity = PaymentDTOToPaymentEntityConverter.convert(paymentDTO);
        paymentEntity = paymentRepository.save(paymentEntity);

        generatedPaymentDTO = PaymentEntityToPaymentDTOConverter.convert(paymentEntity);

        return generatedPaymentDTO;
    }
}
