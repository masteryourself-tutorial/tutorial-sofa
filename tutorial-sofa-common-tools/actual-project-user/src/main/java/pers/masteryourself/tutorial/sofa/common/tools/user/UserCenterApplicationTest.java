package pers.masteryourself.tutorial.sofa.common.tools.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.masteryourself.tutorial.sofa.common.tools.apm.Apm;
import pers.masteryourself.tutorial.sofa.common.tools.apm.ApmMetrics;
import pers.masteryourself.tutorial.sofa.common.tools.user.service.UserService;

/**
 * <p>description : UserCenterApplicationTest
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 12:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserCenterApplication.class)
public class UserCenterApplicationTest {

    @Autowired
    private UserService userService;

    @Test
    public void testPrintUserInfo() {
        ApmMetrics metrics = Apm.begin("printUserInfo");
        try {
            userService.printUserInfo();
        } catch (Exception e) {
            metrics.error(e);
        } finally {
            metrics.end();
        }
    }

}
