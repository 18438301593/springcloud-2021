package club.jiajiajia.springcloud.hystrix.controller;


import club.jiajiajia.springcloud.openfeign.payment.PaymentServiceOpenfeign;
import club.jiajiajia.springcloud.openfeign.payment.provider.PaymentProvider;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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
public class PaymentController {

    @Resource
    private PaymentProvider paymentProvider;

    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentProvider.paymentInfo_OK(id);
        log.info("*******result:"+result);
        return result;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")  //3秒钟以内就是正常的业务逻辑
    })
    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentProvider.paymentInfo_TimeOut(id);
        log.info("*******result:"+result);
        return result;
    }
    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   系统繁忙80, 请稍候再试  ,id：  "+id+"\t"+"哭了哇呜";
    }
}

