package com.design.factory.abstrat;

/**
 * @author jzwu
 * @since 2024-10-05
 */
public class SqlserverUser implements IUser {


    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一行记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SQL中 得到一行记录");
        return null;
    }
}
