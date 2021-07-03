package order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication_8081 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication_8081.class,args);
    }
}
