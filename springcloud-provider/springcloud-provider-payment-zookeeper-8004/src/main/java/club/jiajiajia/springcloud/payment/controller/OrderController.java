package club.jiajiajia.springcloud.payment.controller;

import club.jiajiajia.springcloud.common.entities.CommonResult;
import club.jiajiajia.springcloud.openfeign.order.OrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Author Jiajiajia
 * @Date 2021/7/4 15:57
 * @Description TODO
 **/
@RestController
public class OrderController implements OrderService {

    @Value("${server.port}")
    private Integer port;

    @Override
    public CommonResult<Object> hasOrder(Integer orderId) {
        return CommonResult.ok(port+":"+orderId);
    }
}
