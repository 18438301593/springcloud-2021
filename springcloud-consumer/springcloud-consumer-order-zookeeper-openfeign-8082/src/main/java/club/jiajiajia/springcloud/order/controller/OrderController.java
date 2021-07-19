package club.jiajiajia.springcloud.order.controller;

/**
 * @ClassName OrderController
 * @Author Jiajiajia
 * @Date 2021/4/11 10:55
 * @Description TODO
 **/
import club.jiajiajia.springcloud.common.entities.CommonResult;
import club.jiajiajia.springcloud.openfeign.order.provider.OrderProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderProvider orderProvider;

    @GetMapping("consumer/hasOrder")
    public CommonResult<Object> hasOrder(@RequestParam("orderId") Integer orderId){
        return orderProvider.hasOrder(orderId);
    }

}
