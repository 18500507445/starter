package com.starter.business.entity.param;

import com.starter.common.core.controller.BaseController;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Description:
 * @Author: wzh
 * @Date: 2022/11/26 16:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseParam extends BaseController implements Serializable {

    private static final long serialVersionUID = 893624039677038384L;

    /**
     * header
     * source
     */
    private String source;

    /**
     * header
     * 渠道号
     */
    private String sid;

    /**
     * 请求ip
     */
    private String requestIp = getIp();

    private String userName;

    public String getSource() {
        return getValue("source");
    }

    public String getSid() {
        return getValue("sid");
    }
}
