package club.jiajiajia.springcloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName MainApplication_8005
 * @Author Jiajiajia
 * @Date 2021/4/11 10:15
 * @Description TODO
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class MainApplication_8005 {
    public static void main(String[] args){
        SpringApplication.run(MainApplication_8005.class,args);
    }
}
