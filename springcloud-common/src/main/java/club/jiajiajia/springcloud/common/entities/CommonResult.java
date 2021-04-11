package club.jiajiajia.springcloud.common.entities;

/**
 * @ClassName CommonResult
 * @Author Jiajiajia
 * @Date 2021/4/11 10:01
 * @Description TODO
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
