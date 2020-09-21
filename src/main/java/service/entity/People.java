package service.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author WangYao
 * @date 2020/9/21
 * @function 实体类
 */

@Getter
@Setter
@ToString
public class People implements Serializable {
    private Integer studentNumber;
    private String name;
    private Date birthday;
    private String sex;
    private String address;
}
