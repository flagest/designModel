package com.design.composite;

import java.util.ArrayList;

/**
 * @author jzwu
 * @since 2024-11-22
 */
public class ConcreteCompany extends Company {
    protected ArrayList<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);
        for (Company child : children) {
            child.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
