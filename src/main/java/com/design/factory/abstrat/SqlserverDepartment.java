package com.design.factory.abstrat;

/**
 * @author jzwu
 * @since 2024-10-07
 */
public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在Sql中 server的 Department表添加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在SQL中获取的一行记录");
        return null;
    }
}
