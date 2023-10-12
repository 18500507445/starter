package com.starter.common.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 全局配置类
 *
 * @author wzh
 */
@Component
@ConfigurationProperties(prefix = "starter")
public class GlobalConfig {
    /**
     * 项目名称
     */
    @Getter
    private static String name;

    /**
     * 版本
     */
    @Getter
    private static String version;

    /**
     * 版权年份
     */
    @Getter
    private static String copyrightYear;

    /**
     * 实例演示开关
     */
    @Getter
    private static boolean demoEnabled;

    /**
     * 上传路径
     */
    @Getter
    private static String profile;

    /**
     * 获取地址开关
     */
    @Getter
    private static boolean addressEnabled;

    public void setName(String name) {
        GlobalConfig.name = name;
    }

    public void setVersion(String version) {
        GlobalConfig.version = version;
    }

    public void setCopyrightYear(String copyrightYear) {
        GlobalConfig.copyrightYear = copyrightYear;
    }

    public void setDemoEnabled(boolean demoEnabled) {
        GlobalConfig.demoEnabled = demoEnabled;
    }

    public void setProfile(String profile) {
        GlobalConfig.profile = profile;
    }

    public void setAddressEnabled(boolean addressEnabled) {
        GlobalConfig.addressEnabled = addressEnabled;
    }

    /**
     * 获取导入上传路径
     */
    public static String getImportPath() {
        return getProfile() + "/import";
    }

    /**
     * 获取头像上传路径
     */
    public static String getAvatarPath() {
        return getProfile() + "/avatar";
    }

    /**
     * 获取下载路径
     */
    public static String getDownloadPath() {
        return getProfile() + "/download/";
    }

    /**
     * 获取上传路径
     */
    public static String getUploadPath() {
        return getProfile() + "/upload";
    }
}
