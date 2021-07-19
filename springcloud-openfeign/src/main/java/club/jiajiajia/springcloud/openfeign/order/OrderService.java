package club.jiajiajia.springcloud.openfeign.order;


import club.jiajiajia.springcloud.common.entities.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName Order
 * @Author Jiajiajia
 * @Date 2021/7/4 15:51
 * @Description TODO
 **/
public interface OrderService {

    @GetMapping("hasOrder")
    CommonResult<Object> hasOrder(@RequestParam("orderId") Integer orderId);

}
