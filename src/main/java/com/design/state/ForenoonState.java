package com.design.state;

/**
 * @author jzwu
 * @since 2024-10-24
 */
public class ForenoonState extends StateNew {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间： "+work.getHour()+"点 上午工作，精神百倍");
            return;
        }
        work.setCurrent(new NoonState());
        work.writeProgram();
    }
}
