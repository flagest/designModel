package com.design.prototype;

/**
 * @author jzwu
 * @since 2024-09-07
 */
public class Run {
    public static void main(String[] args) {
        Resume resume1 = new Resume("大鸟");
        resume1.setPersonalInfo("男", 29);
        resume1.setWorkExperience("1998-2000", "xxxx公司");

        Resume resume2 = resume1.clone();
        resume2.setWorkExperience("1996-1998", "xxxx公司");

        Resume resume3 = resume1.clone();
        resume3.setPersonalInfo("女", 27);
        resume3.setWorkExperience("1994-1996", "xxxx公司");

        resume1.display();
        resume2.display();
        resume3.display();

    }
}
