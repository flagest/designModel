package com.design.singleton;

/**
 * @author jzwu
 * @since 2024-12-21
 */
public class Singleton2 {
    private static final Singleton2 singleton2 = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}
