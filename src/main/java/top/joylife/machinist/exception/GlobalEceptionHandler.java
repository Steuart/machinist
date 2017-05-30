package top.joylife.machinist.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.joylife.machinist.common.constant.ReData;
import top.joylife.machinist.common.enums.ReCode;
import top.joylife.machinist.common.utils.ReUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by WuHaiming on 2017/5/30 0030.
 */

@ControllerAdvice
public class GlobalEceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalEceptionHandler.class);

    @ExceptionHandler(value = Warning.class)
    @ResponseBody
    public ReData jsonErrorHandler(HttpServletRequest req, Warning e) throws Exception {
        ReCode reCode = e.getReCode();
        Object data = e.getData();
        log.warn(e.toString(),e);
        return ReUtil.fail(data, reCode);
    }
}
