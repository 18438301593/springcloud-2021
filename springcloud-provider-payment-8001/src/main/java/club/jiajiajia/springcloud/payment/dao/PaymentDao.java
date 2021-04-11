package club.jiajiajia.springcloud.payment.dao;

import club.jiajiajia.springcloud.common.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Author Jiajiajia
 * @Date 2021/4/11 10:07
 * @Description TODO
 **/
@Mapper
public interface PaymentDao {
     int create(Payment payment); //写

     Payment getPaymentById(@Param("id") Long id);  //读取
}
