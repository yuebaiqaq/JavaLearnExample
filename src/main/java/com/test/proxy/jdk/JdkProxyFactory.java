package com.test.proxy.jdk;

import static java.lang.reflect.Proxy.newProxyInstance;

public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target));
    }
}
