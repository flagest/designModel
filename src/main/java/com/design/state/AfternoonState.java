package com.design.state;

/**
 * @author jzwu
 * @since 2024-10-24
 */
public class AfternoonState extends StateNew {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间： "+work.getHour()+"点 下午状态还不错，继续努力ForenoonState");
            return;
        }
        work.setCurrent(new EveningState() );
        work.writeProgram();
    }
}
