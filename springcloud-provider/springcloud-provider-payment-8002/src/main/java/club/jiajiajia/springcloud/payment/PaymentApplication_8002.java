package club.jiajiajia.springcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentApplication
 * @Author Jiajiajia
 * @Date 2021/4/11 10:15
 * @Description TODO
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication_8002 {
    public static void main(String[] args){
        SpringApplication.run(PaymentApplication_8002.class,args);
    }
}
