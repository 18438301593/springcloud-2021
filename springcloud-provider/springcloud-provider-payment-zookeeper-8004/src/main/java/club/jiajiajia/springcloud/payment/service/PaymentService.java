package club.jiajiajia.springcloud.payment.service;

import club.jiajiajia.springcloud.common.entities.Payment;

/**
 * @ClassName PaymentService
 * @Author Jiajiajia
 * @Date 2021/4/11 10:12
 * @Description TODO
 **/
public interface PaymentService {
    int create(Payment payment); //写

    Payment getPaymentById(Long id);  //读取
}
