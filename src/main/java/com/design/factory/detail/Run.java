package com.design.factory.detail;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * @author jzwu
 * @since 2024-08-07
 */
public class Run {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //CashContext cashContext = new CashContext(1);
        //double result = cashContext.getResult(1, 2);
        ArrayList<Object> objectArrayList = new ArrayList<>();
        Test test = new Test();
        test.setName("xxx");
        test.setSex("33");
        //test.setA(1);
        objectArrayList.add(test);
        //objectArrayList.add("aLong");
        //objectArrayList.add(4);

        for (Object o : objectArrayList) {
            String name1 = o.getClass().getName();
            Field[] declaredFields = o.getClass().getDeclaredFields();
            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                String name = declaredField.getName();
                //declaredField.set(o2,"jiejie");
                //declaredField.set(o,"jiejie");
                Object o1 = declaredField.get(o);
                System.out.println(o1);
                System.out.println(name);
                System.out.println(declaredField.getType());
            }
            if (o instanceof String) {
                System.out.println(o);
            } else {
                System.out.println(o);
            }
        }
    }
}
