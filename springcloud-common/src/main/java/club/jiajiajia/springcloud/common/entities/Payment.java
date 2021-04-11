package club.jiajiajia.springcloud.common.entities;

/**
 * @ClassName Payment
 * @Author Jiajiajia
 * @Date 2021/4/11 10:05
 * @Description TODO
 **/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
