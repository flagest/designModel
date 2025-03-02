package com.design.proxy;

/**
 * @author jzwu
 * @since 2024-08-22
 */
public class Run {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("凡凡");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
