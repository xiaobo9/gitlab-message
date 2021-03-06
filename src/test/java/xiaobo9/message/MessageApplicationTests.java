package xiaobo9.message;

import xiaobo9.message.sonar.SonarConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MessageApplicationTests {
    @Autowired
    private SonarConfig sonarConfig;

    @Test
    public void contextLoads() {
        Assert.assertFalse("默认关闭 sonarcheck ", sonarConfig.isSonarCheck());
    }

}
