package com.ly.tankgame02;

import javax.swing.*;

/**
 * @author 刘样
 * @version 1.0
 */
public class LyTankGame02 extends JFrame {
        MyPanel mp = null;
    public static void main(String[] args) {
        LyTankGame02 lyTankGame02 = new LyTankGame02();

    }
    public LyTankGame02(){
         mp = new MyPanel();
         this.add(mp);
         this.addKeyListener(mp);
         this.setSize(1000,750);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);

    }

}
