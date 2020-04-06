package pers.masteryourself.tutorial.sofa.common.tools.apm.log;

import com.alipay.sofa.common.log.MultiAppLoggerSpaceManager;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>description : ApmLoggerFactory, 中间件的日志 API
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 11:49
 */
public class ApmLoggerFactory {

    private static final String APM_LOG_SPACE = "pers.masteryourself.tutorial.sofa.common.tools.apm";

    static {
        if (!MultiAppLoggerSpaceManager.isSpaceInitialized(APM_LOG_SPACE)) {
            Map spaceIdProperties = new HashMap<String, String>();
            MultiAppLoggerSpaceManager.init(APM_LOG_SPACE, spaceIdProperties);
        }
    }

    public static org.slf4j.Logger getLogger(Class<?> clazz) {
        if (clazz == null) {
            return null;
        }
        return getLogger(clazz.getCanonicalName());
    }

    public static org.slf4j.Logger getLogger(String name) {
        //From "pers/masteryourself/study/apm/log" get the xml  and init,then get the logger object
        return MultiAppLoggerSpaceManager.getLoggerBySpace(name, APM_LOG_SPACE);
    }

}
