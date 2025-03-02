package com.design.factory.abstrat;

/**
 * @author jzwu
 * @since 2024-10-07
 */
public interface IDepartment {
    public void insert(Department department);

    public Department getDepartment(int id);
}
