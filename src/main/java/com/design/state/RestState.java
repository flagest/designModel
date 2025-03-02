package com.design.state;

/**
 * @author jzwu
 * @since 2024-10-24
 */
public class RestState extends StateNew {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间： " + work.getHour() + "点 下班回家了");
    }
}
