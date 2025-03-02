package com.design.factory.factorystaragedecotor;

import com.design.decorator.shop.ISale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * 用反射替换工厂模式
 *
 * @author jzwu
 * @since 2024-10-13
 */
public class CashContextReflection {
    private static String assemblyName = "com.design.factory.factorystaragedecotor.";
    private ISale cs; // 声明一个ISale接口

    public CashContextReflection(int cashType) {
        String[] config = getConfig(cashType).split(",");
        IFactory fs = getInstance(config[0], Double.parseDouble(config[1]), Double.parseDouble(config[2]), Double.parseDouble(config[3]));
        this.cs = fs.createSalesModel();
    }

    public String getConfig(int numType) {
        try {
            Properties properties = new Properties();
            String path = "D:\\study\\Internet_Java\\designModel\\designModel\\src\\main\\java\\com\\design\\factory\\factorystaragedecotor\\data.properties";
            //String path = System.getProperty("use.dir") + "/com/design/factory/factorystaragedecotor/data.properties";
            System.out.println("path:\n " + path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            properties.load(bufferedReader);
            return properties.getProperty("strategy" + numType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private IFactory getInstance(String className, double a, double b, double c) {
        try {
            return (IFactory) Class.forName(assemblyName + className).getDeclaredConstructor(double.class,double.class,double.class).newInstance(1.0d,2.0d,3.0d);
            //return (IFactory) Class.forName(assemblyName + className).getDeclaredConstructor().newInstance();
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
    }

    public static void main(String[] args) {
        CashContextReflection cashContextReflection = new CashContextReflection(1);
    }
}
