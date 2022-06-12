package com.ly.tankgame;

import javax.swing.*;

/**
 * @author 刘样
 * @version 1.0
 */
public class LyTankGame extends JFrame {
        MyPanel mp = null;
    public static void main(String[] args) {
        LyTankGame lyTankGame = new LyTankGame();

    }
    public LyTankGame(){
         mp = new MyPanel();
         this.add(mp);
         this.setSize(1000,750);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);

    }

}
