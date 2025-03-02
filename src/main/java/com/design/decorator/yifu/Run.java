package com.design.decorator.yifu;

/**
 * @author jzwu
 * @since 2024-08-17
 */
public class Run {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("第一种扮装");
        Sneakers sneakers = new Sneakers();
        sneakers.decorate(person);

        BigTrouser bigTrouser = new BigTrouser();
        bigTrouser.decorate(sneakers);

        TShirts tShirts = new TShirts();
        tShirts.decorate(bigTrouser);
        tShirts.show();
    }
}
