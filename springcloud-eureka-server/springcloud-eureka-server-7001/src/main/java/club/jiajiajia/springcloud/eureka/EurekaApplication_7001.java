package club.jiajiajia.springcloud.eureka;

/**
 * @ClassName EurekaApplication
 * @Author Jiajiajia
 * @Date 2021/4/11 20:20
 * @Description TODO
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//启动euraka服务
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_7001.class,args);
    }
}
