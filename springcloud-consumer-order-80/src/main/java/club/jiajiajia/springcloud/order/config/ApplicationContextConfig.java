package club.jiajiajia.springcloud.order.config;

/**
 * @ClassName ApplicationContextConfig
 * @Author Jiajiajia
 * @Date 2021/4/11 10:54
 * @Description TODO
 **/
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

}
