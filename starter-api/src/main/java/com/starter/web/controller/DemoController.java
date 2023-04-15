package com.starter.web.controller;

import cn.hutool.json.JSONUtil;
import com.starter.business.entity.param.BaseParam;
import com.starter.common.core.controller.BaseController;
import com.starter.common.core.domain.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 测试demo
 * @Author: wzh
 * @Date: 2022/11/26 17:17
 */
@Slf4j
@RestController
@RequestMapping("/api/test/")
public class DemoController extends BaseController {

    /**
     * 测试demo
     */
    @PostMapping("demo")
    @ResponseBody
    public AjaxResult demo(BaseParam param) {
        return AjaxResult.success(JSONUtil.parseObj(param));
    }
}
