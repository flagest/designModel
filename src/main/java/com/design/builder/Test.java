package com.design.builder;

import javax.swing.*;
import java.awt.*;

/**
 * @author jzwu
 * @since 2024-09-16
 */
public class Test extends JFrame {
    public Test() {
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void paint(Graphics g){
        PersonThinBuilder thin = new PersonThinBuilder(g);
        PersonDirector personDirector = new PersonDirector(thin);
        personDirector.CreatePerson();
    }

    public static void main(String[] args) {
        new Test().setVisible(true);
    }
}
