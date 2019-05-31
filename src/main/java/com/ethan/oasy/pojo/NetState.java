package com.ethan.oasy.pojo;

/**
 * @program: oasy
 * @description: 接口请求状态
 * @author: sam
 * @create: 2019-03-19 21:39
 */
public class NetState {
    public static final int SUCCESS_CONN = 2000;// 操作查询成功
    public static final int NODATA = 9001; // 查询成功无记录
    public static final int FEAILED = 9002; // 查询失败
    public static final int ACCOUNT_ERROR = 1000; // 账户不存在或被禁用
    public static final int API_NOT_EXISTS = 1001;// 请求的接口不存在
    public static final int API_NOT_PER = 1002;// 没有该接口的访问权限
    public static final int PARAMS_ERROR = 1004;// 参数为空或格式错误
    public static final int SIGN_ERROR = 1005;// 数据签名错误
    public static final int AMOUNT_NOT_QUERY = 1010;// 余额不够，或者过期
    public static final int API_DISABLE = 1011;// 查询权限已被限制
    public static final int DATA_RE = 1012; // 数据重复
    public static final int UNKNOWN_IP = 1099;// 非法IP请求
    public static final int SYSTEM_ERROR = 9999;// 系统异常
    public static final int SUCCESS_OPERATE = 3000;// 操作成功
    public static final int ERROR_OPERATE= 3001; //操作失败
    private String data;// 网络状态
    private int errorCode;// 网络状态码
    private Object Json;

    public Object getJson() {
        return Json;
    }

    public void setJson(Object json) {
        Json = json;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    private Object otherJson;// 不改变原接口前提下 添加新数据

    public Object getOtherJson() {
        return otherJson;
    }

    public void setOtherJson(Object otherJson) {
        this.otherJson = otherJson;
    }
}
