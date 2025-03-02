package com.design.vistor.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jzwu
 * @since 2024-03-09
 */
public class Run {
    public static void main(String[] args) {
        List<Person> personArrayList = new ArrayList<>();
        Man man1 = new Man();
        man1.setAction("成功");
        personArrayList.add(man1);
        Woman woman1 = new Woman();
        woman1.setAction("成功");
        personArrayList.add(man1);

        Man man2 = new Man();
        man2.setAction("失败");
        personArrayList.add(man2);
        Woman woman2 = new Woman();
        woman2.setAction("失败");
        personArrayList.add(woman2);

        Man man3 = new Man();
        man3.setAction("恋爱");
        personArrayList.add(man3);
        Woman woman3 = new Woman();
        woman3.setAction("恋爱");
        personArrayList.add(woman3);
        for (Person person : personArrayList) {
            person.getConclusion();
        }
    }
}
