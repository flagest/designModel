package com.design.state;

/**
 * @author jzwu
 * @since 2024-10-24
 */
public class NoonState extends StateNew {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间： " + work.getHour() + "点 饿了 午饭犯困，午休");
            return;
        }
        work.setCurrent(new EveningState());
        work.writeProgram();
    }
}
