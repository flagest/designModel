package com.design.state;

/**
 * @author jzwu
 * @since 2024-10-24
 */
public class EveningState extends StateNew {
    @Override
    public void writeProgram(Work work) {
        if (work.getWorkFinished()) {
            work.setCurrent(new RestState());
            work.writeProgram();
            return;
        }
        if (work.getHour() < 21) {
            System.out.println("当前时间： " + work.getHour() + "点 加班哦，疲累之极");
            return;
        }
        work.setCurrent(new SleepingState());
        work.writeProgram();
    }
}
