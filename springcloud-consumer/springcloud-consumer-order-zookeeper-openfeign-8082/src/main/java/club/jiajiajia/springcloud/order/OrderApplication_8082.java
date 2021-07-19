package club.jiajiajia.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"club.jiajiajia.springcloud.openfeign.order.provider"})
public class OrderApplication_8082 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication_8082.class,args);
    }
}
