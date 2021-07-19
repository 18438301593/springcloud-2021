package club.jiajiajia.springcloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName MainApplication_8005
 * @Author Jiajiajia
 * @Date 2021/4/11 10:15
 * @Description TODO
 **/
@SpringBootApplication(scanBasePackages = {
        "club.jiajiajia.springcloud.hystrix",
        "club.jiajiajia.springcloud.openfeign.payment.provider"
})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"club.jiajiajia.springcloud.openfeign.payment.provider"})
@EnableHystrix
public class MainApplication_8085 {
    public static void main(String[] args){
        SpringApplication.run(MainApplication_8085.class,args);
    }
}
