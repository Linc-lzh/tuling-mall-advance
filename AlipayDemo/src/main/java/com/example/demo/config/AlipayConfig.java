package com.example.demo.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ：楼兰
 * @date ：Created in 2021/1/19
 * @description:
 **/

public class AlipayConfig {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000116694736";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCof7pjblw5Fkes/CuN1L6O4uGVjt+fsMGh76yGbczz8pYSh3/G6bxMUR3USjkItxyZLKPF+gzc2KjUgaef5Hovf9cIY95e9yoU5oU+DC4Qf3WL6e9pYsKSlKCc679tHOLyTC+BfIoFSQjunLTc/FvRbo7wRX3/JbKXEgn20s2+xlYxuXYEVeNyii01yVrWdJ8KT+iVvz97uZbSFDFTwk3hMa6LXsH3857xcnszsKcwjHR7DK1JKuHY9QfcurP4BzzE3lEFNjGZ26TDj9RGJWYkJyozl3sFECCHzS78pTGSXVqrc9sqjnYGr8J3+PTiQPTLirxbTqUzkeIlfz18K1TrAgMBAAECggEBAJUH6+Y33S/MyfZxT2Bx011zxExQgu+uGYVOBA0eHpGBdUTMPbLEVvw1Hqn+P/W6Z3v/JJddc3T92E2ko4rjPUK30owkMLFT8Q9tWFop0bBb2661aUCPzkJxXKGOTdCHJR9jTP09FqJYF6NcTQfL2LYjEB/phuheAlhl5xQ9HSbmttXaCGHtytUbLw/s8Xh7qsjL58cGCT4iWGlglPV98Xiq8gQOySbrLEx63/MB13t7IbDLzmVS4I4fvtUUxvBDMBUVC3ljOJ4HFTyVaFbeGieVON1L0kHB7Mf+s3ymTyT47OR9eMxMu9haJv5fzZ4rQ5PAfgBp92LRnF4N4E2w+RECgYEA9oSlS+Pq4FaEy90ISZM5nHO1KIdVplm+5XjVYpr3m6+yE9M5P8HnSN5qC6y0cofeEoC/Yj1yUPTt0xY/R/wSj6TgjhRD2kdtFYZ3LiWneySKTyn7h8UVifyz3nq8Q0FllTFHUG0Q+MfAN/aLPJwB/XKaZpB9d1/3Zt9CT7Wzy7MCgYEArvrcrNYXuSSfy+t1xh5+abTFMJnpXFgGeTUz4TRTMPgxbPXbyuhG/8PZeTsTdepCKl2zceoaB2bndfnsHdJRHHi1YLDVkoBeaEl2xLbO+R6KHVbrsPp4ylcFtSuVEDPYbarZv+/8UgjrAzxouY9JLr40Fs8/OGntK4lkwl9J1ekCgYEAmvWOokHGpvY7y5pJV1aAZGQngC5yHHtVkBGAsNcQxoCOw/+GgRl2NUv6BRSu6T+WzLK5mxtc/J650HKvnKRLVpghv63laRR08Y7w48Uvniy99D1Dq3irrW1382Xbabt2C25Kkbe9b2TA42zK4XJ/nb2oaMhy1dMxRS0aFdj2CBkCgYEAp4nvDVYYdN9KWZfjtoSwCUpanERiGlb2K8vzFqhhFzwtJuTpRAjPIklFyzvzUC2ymJoLHQFHVtsCuAVKPOuJWjeBg0kN1S4wNq5Ql91po0HIgHsfRN8uFJ7qCiPmoBLkIW06/Potn+aGDx0iMLmvGqBng4eAQuW5frwYy7stGTECgYAxdJ8f0CrXSUc+AK0+SGS6iMwdcqYlnYPLs1b3jqxSaKJoEXWwv90T+vCubrHqxL4AvMc+qBa8jEXwlalOi33fWPt9/hDJ0xWUSFuf8U74+5VFG+k8UVa/sJxtZh7KfNxHcKEZoCbmnbXenzyuiItu8zFFhUI3gba3j1ZH/HIkKw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmZtTJ6+1lzuj4fedov6egPZ2fZOlKvASgybRulXKWJGdwDVbQu6Z8m0Ef7JwWcEjQivnWCAyHOxohobQpcOxGpWH/2SEsylghWAhUG57uy7XKuPHH4fNPZc4XRJMSJ0c0Y+e8w7NJRdZR/n+oDkg7wk1vh6+NgRnvP6wR7IeX6dYip4mXAS3nfAprPDMyAwnoDagl0xmhB6iEPBBqsAyDMWFyvTQQW+NfC2Ras0twS2+epm5iUcW8fgIru2cO3pYkWunC7kDUQm2ojHvY4GHJWclo/rj4eBwMun5yg562f9owpndeZGlJsjvMU47pFqaZDJkbGj5rv5+S6VN6FQdKwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://roykingw.free.idcfengye.com/ali/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://roykingw.free.idcfengye.com/ali/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝日志地址
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
