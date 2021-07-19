package club.jiajiajia.springcloud.openfeign.order.provider;

import club.jiajiajia.springcloud.openfeign.order.OrderService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @ClassName OrderProvider
 * @Author Jiajiajia
 * @Date 2021/7/4 15:54
 * @Description TODO
 **/
@FeignClient(contextId = "order",value = "springcloud-payment-service")
public interface OrderProvider extends OrderService {
}
