package club.jiajiajia.springcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentApplication
 * @Author Jiajiajia
 * @Date 2021/4/11 10:15
 * @Description TODO
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication_8004 {
    public static void main(String[] args){
        SpringApplication.run(PaymentApplication_8004.class,args);
    }
}
