import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.PeopleService;
import service.entity.People;

import java.util.Date;

/**
 * @author WangYao
 * @date 2020/9/21
 * @function 测试Spring和mybatis
 */
@RunWith(SpringJUnit4ClassRunner.class) //Spring如果使用Test需要这个,忘记了不知道为啥一直空指针
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class testSpringAndMybatis {
    @Autowired
    private PeopleService peopleService;

    @Test
    public void test1(){
        People people = new People();
        people.setAddress("北京");
        people.setName("王耀");
        people.setBirthday(new Date("2002/03/06"));
        people.setSex("男");
        people.setStudentNumber(460240);

        peopleService.save(people);
    }

}
