package com.cice.gestionpagos.service.converter;

import com.cice.gestionpagos.controller.dto.PaymentDTO;
import com.cice.gestionpagos.repository.entity.PaymentEntity;

public class PaymentEntityToPaymentDTOConverter {

    public static PaymentDTO convert(PaymentEntity entity){
        PaymentDTO paymentDTO = null;

        paymentDTO = new PaymentDTO()
                .setOperationId(entity.getPaymentId())
                .setStudentId(entity.getUserId())
                .setTransactionId(entity.getPaymentTransactionId())
                .setAmount(entity.getPaymentAmount())
                .setPaymentStatus(entity.getPaymentStatus());

        return paymentDTO;
    }
}
