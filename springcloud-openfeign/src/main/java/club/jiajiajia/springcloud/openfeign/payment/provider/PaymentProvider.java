package club.jiajiajia.springcloud.openfeign.payment.provider;

import club.jiajiajia.springcloud.openfeign.payment.PaymentServiceOpenfeign;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @ClassName OrderProvider
 * @Author Jiajiajia
 * @Date 2021/7/4 15:54
 * @Description TODO
 **/
@FeignClient(contextId = "payment",value = "springcloud-provider-zookeeper-hystirx-8005",fallback = PaymentFallBackService.class)
public interface PaymentProvider extends PaymentServiceOpenfeign {
}
