package com.ethan.oasy.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @program: oasy
 * @description: 密码加密
 * @author: sam
 * @create: 2019-03-20 21:20
 */
public class MD5 {
    /**
     * 加密
     * @param text
     * @return
     * @throws Exception
     */
    public static String md5(String text) throws Exception {
        //加密后的字符串
        String encodeStr= DigestUtils.md5Hex(text);
        return encodeStr;
    }
    /**
     * MD5验证方法
     *
     * @param text 明文
     * @param md 密文
     * @return true/false
     * @throws Exception
     */
    public static boolean verify(String text, String md) throws Exception {
        //根据传入的密钥进行验证
        String md5Text = md5(text);
        if(md5Text.equalsIgnoreCase(md)) {
            return true;
        }
        return false;
    }

}
