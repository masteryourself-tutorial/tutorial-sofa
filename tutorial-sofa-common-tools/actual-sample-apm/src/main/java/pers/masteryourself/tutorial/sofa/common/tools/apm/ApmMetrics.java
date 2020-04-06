package pers.masteryourself.tutorial.sofa.common.tools.apm;

import com.alipay.sofa.common.utils.StringUtil;
import lombok.Data;
import org.slf4j.Logger;
import pers.masteryourself.tutorial.sofa.common.tools.apm.log.ApmLoggerFactory;

/**
 * <p>description : ApmMetrics
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 11:48
 */
@Data
public class ApmMetrics {

    private static final Logger LOGGER = ApmLoggerFactory.getLogger(ApmMetrics.class);

    private String methodName;

    private String errorMsg;

    private Long beginTime;

    private Long endTime;

    public void error(Throwable e) {
        this.setErrorMsg(e.getMessage());
    }

    public void end() {
        this.setEndTime(System.currentTimeMillis());
        this.submitResult();
    }

    private void submitResult() {
        long spendTime = this.getEndTime() - this.getBeginTime();
        if (StringUtil.isEmpty(this.getErrorMsg())) {
            LOGGER.info("{} 执行正常，耗时 {} ms", this.getMethodName(), spendTime);
        } else {
            LOGGER.error("{} 执行失败，耗时 {} ms，异常信息 {}", this.getMethodName(),
                    spendTime, this.getErrorMsg());
        }
    }

}
