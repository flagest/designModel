package com.design.factory.abstrat;

/**
 * @author jzwu
 * @since 2024-10-07
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在Access中给Department表中添加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("添加记录");
        return null;
    }
}
