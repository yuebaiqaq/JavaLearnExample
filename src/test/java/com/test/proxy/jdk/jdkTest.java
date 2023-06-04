package com.test.proxy.jdk;

import org.junit.jupiter.api.Test;

public class jdkTest {
    @Test
    public void jdkProxyTest(){
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");

    }
}
