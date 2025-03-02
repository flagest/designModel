package com.design.composite;

/**
 * @author jzwu
 * @since 2024-11-22
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " :公司财务收支管理");
    }
}
