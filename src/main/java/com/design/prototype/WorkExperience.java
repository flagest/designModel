package com.design.prototype;

/**
 * @author jzwu
 * @since 2024-09-07
 */
public class WorkExperience implements Cloneable {

    private String timeArea;

    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public WorkExperience clone() {
        WorkExperience workExperience = null;
        try {
            workExperience = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return workExperience;
    }
}
