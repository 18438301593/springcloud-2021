package club.jiajiajia.springcloud.hystrix.controller;


import club.jiajiajia.springcloud.hystrix.service.PaymentService;
import club.jiajiajia.springcloud.openfeign.payment.PaymentServiceOpenfeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
/**
 * @ClassName PaymentController
 * @Author Jiajiajia
 * @Date 2021/7/18 10:32
 * @Description TODO
 **/

@RestController
@Slf4j
public class PaymentController implements PaymentServiceOpenfeign {

    @Resource
    private PaymentService paymentService;

    @Override
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("*******result:"+result);
        return result;
    }

    @Override
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("*******result:"+result);
        return result;
    }
}

