package com.design.composite;

import com.graphbuilder.math.func.AvgFunction;

/**
 * @author jzwu
 * @since 2024-11-22
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int depth);

    public abstract void lineOfDuty(); // 履行职责


}
