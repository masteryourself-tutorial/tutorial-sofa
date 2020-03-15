package pers.masteryourself.tutorial.sofa.common.tools.apm;

/**
 * <p>description : Apm, 监控工具类
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 11:49
 */
public class Apm {

    public static ApmMetrics begin(String methodName) {
        ApmMetrics metrics = new ApmMetrics();
        metrics.setBeginTime(System.currentTimeMillis());
        metrics.setMethodName(methodName);
        return metrics;
    }

}
