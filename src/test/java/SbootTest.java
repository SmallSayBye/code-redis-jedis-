import com.jedis.code.ApplicationRun;
import com.jedis.code.config.JedisConfig;
import com.jedis.code.controller.DemoController;
import com.jedis.code.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationRun.class)
public class SbootTest {

    @Autowired
    private JedisConfig jedisConfig;

    @Autowired
    DemoController demoController;

    @Test
    public void test(){
        User user = new User();
        user.setId(1);
        user.setAge(20);
        user.setName("张三");
        demoController.jedisTest();
    }


}


