package com.cice.gestionpagos.service;

import com.cice.gestionpagos.controller.dto.PaymentDTO;

public interface PaymentService {

    /**
     * Metodo que va a generar un uuid de transaccion para cada usuario que se reciba.
     *
     * @param paymentDTO
     * @return PaymentDTO
     */
    PaymentDTO generatePayment(PaymentDTO paymentDTO);
}
