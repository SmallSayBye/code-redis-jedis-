import com.jedis.code.ApplicationRun;
import com.jedis.code.controller.DemoController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationRun.class)
public class SbootTest {


    @Autowired
    DemoController demoController;

    @Test
    public void test(){
        demoController.jedisTest();
    }
}


