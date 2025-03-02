package com.design.observer;

/**
 * @author jzwu
 * @since 2024-09-21
 */
public class StockObserver extends Observer{
    public StockObserver(String name, Subject sub) {
        super(name,sub);
    }

    public void update() {
        System.out.println(super.subject.name + ":" + this.subject.getAction() + "!" + this.name + "请关闭股票，赶紧工作！");
    }
}
