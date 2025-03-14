package com.design.state;

/**
 * @author jzwu
 * @since 2024-10-24
 */
public class SleepingState extends StateNew {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间： " + work.getHour() + "点 不行了，睡着了");
    }
}
