package club.jiajiajia.springcloud.order.config;

/**
 * @ClassName ApplicationContextConfig
 * @Author Jiajiajia
 * @Date 2021/4/11 10:54
 * @Description TODO
 **/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
