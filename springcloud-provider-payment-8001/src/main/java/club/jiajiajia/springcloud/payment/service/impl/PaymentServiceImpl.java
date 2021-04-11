package club.jiajiajia.springcloud.payment.service.impl;

import club.jiajiajia.springcloud.payment.dao.PaymentDao;
import club.jiajiajia.springcloud.common.entities.Payment;
import club.jiajiajia.springcloud.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Author Jiajiajia
 * @Date 2021/4/11 10:12
 * @Description TODO
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    @Override
    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);
    }
}
