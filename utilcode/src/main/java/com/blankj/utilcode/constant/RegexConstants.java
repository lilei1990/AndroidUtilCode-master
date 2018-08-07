package com.blankj.utilcode.constant;

/**
 * 作者 : LiLei
 * 时间 : 2018/4/8 0008.
 * 邮箱 :416587959@qq.com
 * 正则常量
 */
public final class RegexConstants {

    /**
     * 正则移动号码
     */
    public static final String REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$";
    /**
     * Regex of exact mobile.
     * <p>中国移动: 134(0-8), 135, 136, 137, 138, 139, 147, 150, 151, 152, 157, 158, 159, 178, 182, 183, 184, 187, 188, 198</p>
     * <p>中国联通: 130, 131, 132, 145, 155, 156, 166, 171, 175, 176, 185, 186</p>
     * <p>中国电信: 133, 153, 173, 177, 180, 181, 189, 199</p>
     * <p>全球星卫星电话: 1349</p>
     * <p>虚拟运营商: 170</p>
     */
    public static final String REGEX_MOBILE_EXACT  = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(16[6])|(17[0,1,3,5-8])|(18[0-9])|(19[8,9]))\\d{8}$";
    /**
     * 电话号码.
     */
    public static final String REGEX_TEL           = "^0\\d{2,3}[- ]?\\d{7,8}";
    /**
     * 长度为15的身份证号码
     */
    public static final String REGEX_ID_CARD15     = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$";
    /**
     * 长度为18的身份证号码
     */
    public static final String REGEX_ID_CARD18     = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$";
    /**
     * 邮件
     */
    public static final String REGEX_EMAIL         = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    /**
     * URL
     */
    public static final String REGEX_URL           = "[a-zA-z]+://[^\\s]*";
    /**
     * 汉字
     */
    public static final String REGEX_ZH            = "^[\\u4e00-\\u9fa5]+$";
    /**
     * 用户名
     * <p>范围 "a-z", "A-Z", "0-9", "_", "汉字"</p>
     * <p>不能 "_"结尾</p>
     * <p>长度6到20之间</p>
     */
    public static final String REGEX_USERNAME      = "^[\\w\\u4e00-\\u9fa5]{6,20}(?<!_)$";
    /**
     * 格式为“yyyy-mm-dd”的日期。
     */
    public static final String REGEX_DATE          = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";
    /**
     * IP地址
     */
    public static final String REGEX_IP            = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";



    /**
     * 双字节字符
     */
    public static final String REGEX_DOUBLE_BYTE_CHAR     = "[^\\x00-\\xff]";
    /**
     * 空行.
     */
    public static final String REGEX_BLANK_LINE           = "\\n\\s*\\r";
    /**
     * QQ号码
     */
    public static final String REGEX_QQ_NUM               = "[1-9][0-9]{4,}";
    /**
     * 中国邮政编码
     */
    public static final String REGEX_CHINA_POSTAL_CODE    = "[1-9]\\d{5}(?!\\d)";
    /**
     * 正整数
     */
    public static final String REGEX_POSITIVE_INTEGER     = "^[1-9]\\d*$";
    /**
     * 负整数
     */
    public static final String REGEX_NEGATIVE_INTEGER     = "^-[1-9]\\d*$";
    /**
     * 整数
     */
    public static final String REGEX_INTEGER              = "^-?[1-9]\\d*$";
    /**
     * 非负整数
     */
    public static final String REGEX_NOT_NEGATIVE_INTEGER = "^[1-9]\\d*|0$";
    /**
     * 非正整数
     */
    public static final String REGEX_NOT_POSITIVE_INTEGER = "^-[1-9]\\d*|0$";
    /**
     * 正浮点数
     * Regex of positive float.
     */
    public static final String REGEX_POSITIVE_FLOAT       = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$";
    /**
     * 负浮点数
     * Regex of negative float.
     */
    public static final String REGEX_NEGATIVE_FLOAT       = "^-[1-9]\\d*\\.\\d*|-0\\.\\d*[1-9]\\d*$";

    ///////////////////////////////////////////////////////////////////////////
    // If u want more please visit http://toutiao.com/i6231678548520731137
    ///////////////////////////////////////////////////////////////////////////
}
