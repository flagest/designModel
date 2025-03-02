package com.design.observer;

import java.util.Optional;

/**
 * @author jzwu
 * @since 2024-09-21
 */
public class Run {
    public static void main(String[] args) {
        // 老板胡汉三
        Subject boss1 = new Boss("胡汉三");
        Observer employee1 = new StockObserver("小李", boss1);
        Observer employee2 = new StockObserver("小王", boss1);
        Observer employee3 = new NBAObserver("小张", boss1);

        boss1.attach(employee1);
        boss1.attach(employee2);
        boss1.attach(employee3);
        boss1.detach(employee1);

        boss1.setAction("老板来了，大家快来上班吧！");

        boss1.notifyEmployee();


    }
}
