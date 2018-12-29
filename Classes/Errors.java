/*
 * Copyright (c) 2018. utaka and/or its affiliates.
 */

package com.utaka.united.customer.web;

/**
 * @author LANXE
 */
public class Errors {

    public static final String FAIL = "fail";

    /**
     * 已经禁用
     */
    public static final String ALREADY_STOP = "customer_already_stop";

    /**
     * 已解禁
     */
    public static final String ALREADY_OPEN = "customer_already_open";

    /**
     * 用户没找到
     */
    public static final String CUSTOMER_NONEXISTENT = "customer_not_found";

    /**
     * 实名重复提交
     */
    public static final String IDENTITY_REPET_SUBMIT = "customer_identity_repet_submit";
    /**
     * 没有找到数据
     */
    public static final String NOT_FIND_ARTICLE = "customer_not_find_article";
    /**
     * custId 已经存在
     */
    public static final String CUSTID_ALREADY = "customer_custid_already";

    /**
     * 参数错误
     */
    public static final String FAILD_PARAM = "customer_faild_param";
    /**
     * 身份证/护照号码错误
     */
    public static final String CARD_NUMBER_FAILD = "customer_card_number_faild";

    /**
     * 身份证号码已使用
     */
    public static final String CARD_NUMBER_USED = "customer_card_number_used";
    /**
     * 身份证号码未使用
     */
    public static final String CARD_NUMBER_UNUSED = "customer_card_number_unused";

    /**
     * 在相同交易所 邮箱已存在
     */
    public static final String EMAIL_EXISTS = "email_exists";

    /**
     * 在相同交易所 电话号码已存在
     */
    public static final String PHONE_EXISTS = "phone_exists";
    /**
     * 认证异常
     */
    public static final String AUTHENTICATION_EXCEPTION = "customer_authentication_exception";


    //-----------------以下是通用异常code ------------//
    /**
     * 邮箱格式错误
     */
    public static final String EMAIL_FORMAT_ERROR = "email_format_error";
    /**
     * 记录不存在
     */
    public static final String ENTITY_NOT_FOUND = "entity_not_found";
    /**
     * 验证码错误
     */
    public static final String CAPTCHA_CODE_FAILD = "captcha_code_faild";
    /**
     * 邮箱验证码错误
     */
    public static final String EMAIL_CAPTCHA_FAILD = "email_captcha_faild";
    /**
     * 手机验证码错误
     */
    public static final String PHONE_CODE_FAILD = "phone_code_faild";
    /**
     * 资金密码错误
     */
    public static final String ASSETPWD_FAILD = "assetpwd_faild";
    /**
     * 绑定谷歌验证器失败
     */
    public static final String GOOGLE_FAILD_BIND = "google_faild_bing";
    /**
     * 关闭谷歌验证器失败
     */
    public static final String GOOGLE_FAILD_CLOSE = "google_faild_close";
    /**
     * 谷歌验证码错误
     */
    public static final String GOOGLE_FAILD_GOOGLECODE_ERROR = "google_faild_googlecode_error";
    /**
     * 没有找到发送地址
     */
    public static final String NOT_ADDRESS_SEND = "not_address_send";
    /**
     * 谷歌验证器修改失败
     */
    public static final String GOOGLE_FAILD_UPDATE = "google_faild_update";
    /**
     * 谷歌验证器密钥未找到
     */
    public static final String GOOGLE_FAILD_NOT_GOOGLE_KEY = "google_faild_not_google_key";
    /**
     * 没有找到用户策略
     */
    public static final String NOT_FIND_STRATEGY = "not_find_stratrgy";

    /**
     * 发送手机验证码错误
     */
    public static final String SEND_PHONE_CODE_FAILD = "send_phone_code_faild";
    /**
     * 发送邮箱验证码错误
     */
    public static final String SEND_EMAIL_CODE_FAILD = "send_email_code_faild";
    /**
     * 更新资金密码状态错误
     */
    public static final String UPDATE_ASSETPWD_STATUS_FAILD = "update_assetpwd_status_faild";
    /**
     * 发送验证码次数过多
     */
    public static final String SEND_PHONE_COUNT_EXCEED = "send_phone_count_exceed";

    /**
     * 审核失败
     */
    public static final String AUDIT_FAILD = "audit_faild";

    /**
     * 没有找到数据
     */
    public static final String NOT_FIND_ENTITY = "not_find_entity";
    /**
     * 关闭手机验证失敗
     */
    public static final String FAILD_CUST_PHONE_CLOSE = "faild_cust_phone_close";
    /**
     * 清除实名信息错误
     */
    public static final String ERROR_CLOSE_ENTITY = "error_close_entity";
    /**
     * 更新会员类型错误
     */
    public static final String UPDATE_CUSTOMER_TYPE_ERROR = "update_customer_type_error";
    /**
     * 清除实名认证信息错误
     */
    public static final String CLEAR_IDENTITY_ERROR = "clear_identity_error";
    /**
     * 禁用用户错误
     */
    public static final String ERROR_DISABLE_USER = "error_disable_user";
    /**
     * 清楚实名信息错误
     */
    public static final String ERROR_CLEAR_IDENTITY ="error_clear_identity";
}
