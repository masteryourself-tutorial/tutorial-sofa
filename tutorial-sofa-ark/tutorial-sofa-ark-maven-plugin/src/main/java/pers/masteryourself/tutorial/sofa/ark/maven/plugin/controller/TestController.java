package pers.masteryourself.tutorial.sofa.ark.maven.plugin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>description : TestController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/14 16:43
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "just for test!!!";
    }

}
