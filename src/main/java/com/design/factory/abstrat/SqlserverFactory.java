package com.design.factory.abstrat;

/**
 * @author jzwu
 * @since 2024-10-05
 */
public class SqlserverFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }
}
