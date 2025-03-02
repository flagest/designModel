package com.design.state;

/**
 * @author jzwu
 * @since 2024-10-24
 */
public class Work {
    private StateNew current;
    private int hour;
    private boolean workFinished = false;

    public Work() {
        current = new ForenoonState();
    }

    public void writeProgram() {
        this.current.writeProgram(this);
    }

    public StateNew getCurrent() {
        return current;
    }

    public void setCurrent(StateNew current) {
        this.current = current;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean getWorkFinished() {
        return workFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        this.workFinished = workFinished;
    }
}
