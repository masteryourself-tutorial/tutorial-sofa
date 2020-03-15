package pers.masteryourself.tutorial.sofa.common.tools.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * <p>description : UserService
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 12:01
 */
@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public void printUserInfo() throws Exception {
        LOGGER.info("打印用户信息");
        long time = new Random().nextInt(1000);
        TimeUnit.MILLISECONDS.sleep(time);
        if (time > 500) {
            throw new RuntimeException("timeout");
        }
    }

}
