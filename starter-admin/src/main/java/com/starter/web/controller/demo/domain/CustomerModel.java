package com.starter.web.controller.demo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * 客户测试信息
 *
 * @author starter
 */
public class CustomerModel {
    /**
     * 客户姓名
     */
    private String name;

    /**
     * 客户手机
     */
    private String phoneNumber;

    /**
     * 客户性别
     */
    private String sex;

    /**
     * 客户生日
     */
    private String birthday;

    /**
     * 客户描述
     */
    private String remark;

    /**
     * 商品信息
     */
    private List<GoodsModel> goods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<GoodsModel> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsModel> goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("name", getName())
                .append("phoneNumber", getPhoneNumber())
                .append("sex", getSex())
                .append("birthday", getBirthday())
                .append("goods", getGoods())
                .append("remark", getRemark())
                .toString();
    }
}
