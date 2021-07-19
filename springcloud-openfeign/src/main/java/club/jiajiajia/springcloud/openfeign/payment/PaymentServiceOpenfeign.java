package club.jiajiajia.springcloud.openfeign.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName Order
 * @Author Jiajiajia
 * @Date 2021/7/4 15:51
 * @Description TODO
 **/
public interface PaymentServiceOpenfeign {

    @GetMapping("/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id);

}
