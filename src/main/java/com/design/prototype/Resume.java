package com.design.prototype;

/**
 * @author jzwu
 * @since 2024-09-01
 */
public class Resume implements Cloneable {
    private String name;

    private String sex;
    private int age;

    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        this.work = new WorkExperience();
    }

    public void setPersonalInfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.work.setTimeArea(timeArea);
        this.work.setCompany(company);
    }

    public void display() {
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.println("工作经历" + this.work.getTimeArea() + " " + this.work.getCompany());
    }

    /* 实现克隆接口方法 */
    public Resume clone() {
        Resume cloneResume = null;
        try {
            cloneResume = (Resume) super.clone();
            cloneResume.work = this.work.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return cloneResume;
    }
}
