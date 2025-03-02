package com.design.factory.abstrat;

import java.lang.reflect.InvocationTargetException;

/**
 * @author jzwu
 * @since 2024-10-13
 */
public class DataAccess2 {
    private static String assemblyName = "com.design.factory.abstrat.";
    private static String db = "Sqlserver";

    public static IUser createUser() {
        return (IUser) getInstance(assemblyName + db + "User");
    }

    public static IDepartment createDepartment() {
        return (IDepartment) getInstance(assemblyName + db + "Department");
    }

    private static Object getInstance(String className) {
        Object result;
        try {
            result = Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
