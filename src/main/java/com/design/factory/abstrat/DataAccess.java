package com.design.factory.abstrat;

/**
 * @author jzwu
 * @since 2024-10-05
 */
public class DataAccess {
    private static String db = "Sqlserver";

    public static IUser createUser() {
        IUser result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
        }
        return result;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
        }
        return result;
    }
}
