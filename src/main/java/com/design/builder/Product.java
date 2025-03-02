package com.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jzwu
 * @since 2024-09-18
 */
public class Product {
    List<String> parts = new ArrayList<String>();
    public void add(String part){
        parts.add(part);
    }
    public void show(){
        for(String part : parts){
            System.out.println("Part: " + part);
        }
    }

}
