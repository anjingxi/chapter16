package com.ly.BallMove;

import javax.swing.*;
import java.awt.event.KeyListener;

/**
 * @author 刘样
 * @version 1.0
 */
public class Ball extends JFrame {
    Mypanel mp =null;
    public static void main(String[] args) {
        Ball ball = new Ball();
    }
    public Ball(){
        mp = new Mypanel();
        this.add(mp);
        this.setSize(400,400);
        //窗口JFrame 对象可以监听键盘事件,(即在mp画板上的键盘事件)
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
