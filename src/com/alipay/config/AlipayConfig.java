package com.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016091300499765";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCWvIX4l/g9qx0iLxFoEuy6DzytVbDXi5TaNnvFvMRcNFq8c9F32+gcOCFcdEJP7t1ILLyo8gyaS2RYT+nNY8x8JWwMJ8ywbjQTw0Tm6pvJlSaRmIevYXkiNXTUuNfr2thaHoDKYbQPrN5pQqusrOQ+twmOYQrHkWVZONyvjlhtsW+skK84WLBfHLr3pV4L3qxzrtr9hV64Y2k6VNhbirOyQFWh2JDBE1hil287hbaAiKJLgOcWgPiQ0EKJ727RHJqofLE0pw5/WFfVX/oMOmGVdwd5n6cil7J4+bIvQ+CWTgW49B7yMzxFdiDsoipT6DrTBYkjNx0LQfW3UnaxLOplAgMBAAECggEASfBRuv44e297C/CQlj9qNV4SAmhdJW3HZz6Aeh89Jolb1MLvBd8tvOHfo203tePSUXv4UtrgSbMflp4kbmY8wMzOciv3oLd9/g+ztZ1xK3FpCNQMAoBKnfggxdOhvoSLybDates1GtdOBc35TetEzmqUWm3JjtkIILrerZKiV7OHZBc7b/IJt7mt3WSK78QOsqZB/eUIzxaA678TSHjUFxiFmNsfBpFTKpM1dhMbK0fgocSRxLeuMIiN9y1KwCiZKH7aPsuqsFLYo1Y3//6tqRLJdWTQb+FGi5IyvFHQvx237kNBEoLnubKWxPq6n0b/1pWrMwcr7ZrVrniFsnGDAQKBgQDUp5/yYv8LrCJ/02mj53jUslU0pRAeXwcNA/xyZuuyXfyFBkCffYP6SuqSiDFi064/M6ZOhx9/T8J3W0I5P6OKlxZK262Pj1HPIknBnZlASlta/I1t4JWuDmTx4QCQvslGrKvaIWUbunb6XwFqWZwFF7BsvGg2ZBewASgPYTDSQQKBgQC1dfvuE+gw8+Zp0IbNuMWz5flsNhyQrNKoHhrNDbaERbHnUwyNPOZapSZ8swGf9CYxCbebvj/23gv3UVbcy+PHK4s3fFMtDszEhPCfWYNTYqDjura9w3q7N8K0pKVNHGgHonqWRHExMI27XHEftsFHeDiABsAhEwwk+Lbcai7HJQKBgGLZiIAjhGromSDSJUkLUB+OxgyyrctwYNasA60qKmW/SqKLRX7d2Xt/V4rFxC8sNtMqLyRRq1KCwOK6iQ4ThvHlSXeCpisVc/HU/nQBzjsUVWL2AsgQnYNLLaFB9gFSrj0sBrZez6EUDDpV71KAVQYI/PmOmuKtpFUsNHLxusABAoGAI/HpI7IBzqChxdguu9WcJBSsIcleQzJY0ECWYoQS4YTExuPmmpuzrcUFKLJ04fCFGDWqj0lSdl5p1GXiZP5mcm+ntigEeepymYMT/xzGLOBeqn2z8UclqqxS/2GV9P5phQmkatvH6EyL5s9bAUM8aiHgX0v3BxY006YI4wSNm5kCgYB82jgMSabmjTcHkcULyQXpZ8On8PMVinRXttd2ZHGfuYa8krNDtFK+FngXD6wYoI1c0+gxeaOFkZSrXGEwG5HDc87eaHUEVtqbOsregppt7rAMIa90VPv1LeiwHkSHJD2sfWLUFP5GKQyGx7mB9HqQHp9sU07rHZqUI5jig3aBVA==";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://dtsvm9.natappfree.cc/alipay.trade.wap.pay/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://dtsvm9.natappfree.cc/alipay.trade.wap.pay/return_url.jsp";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtrfFwgZz9IXrYE80SG+UDqQhgBOISvmcgQaXz9KwuuOl83ZIZFTwbGcaQvyWyOGj62CRhDrILwqcJ/BQsCuU6xbQNxnsGe46U/s8QfsUu91cxzqcNSGkFPst5XMYBH2fBma47gWm4N4/oQk47gmCGccAvsHjWMC+PM6nWMGmEUrlqTLLD5LPUUmA89kWdhlLPhOnyFJQFCI+aSyX1Zv5GcBqP66y5q/OqxTq1Va0KHxICi5sYHkBLUCn7DOGqtzhmyAzsZThhGLLCe2WKw9AauGxyhIOKlY2p2De+ywkj/g3mWBVTBXjmS0rKyagtZewZTUaT1OLdtaXM7db86F/xQIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
