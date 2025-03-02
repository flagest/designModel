package com.design.factory.abstrat;

/**
 * @author jzwu
 * @since 2024-10-05
 */
public class Run {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        //IUser iu = DataAccess.createUser();
        IUser iu = DataAccess2.createUser();
        iu.insert(user);
        iu.getUser(1);
        //IDepartment idept = DataAccess.createDepartment();
        IDepartment idept = DataAccess2.createDepartment();
        idept.insert(department);
        idept.getDepartment(2);

    }
}
