package com.design.factory.abstrat;

/**
 * @author jzwu
 * @since 2024-10-05
 */
public interface IUser {
    public void insert(User user);

    public User getUser(int id);
}
