package club.jiajiajia.springcloud.openfeign.payment.provider;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallBackService
 * @Author Jiajiajia
 * @Date 2021/7/18 16:15
 * @Description TODO
 **/
@Component
public class PaymentFallBackService implements PaymentProvider {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallBackService-paymentInfo_OK-55555";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallBackService-paymentInfo_TimeOut-55555";
    }
}
