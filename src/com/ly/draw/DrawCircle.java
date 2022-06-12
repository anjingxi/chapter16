package com.ly.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘样
 * @version 1.0
 * 演示如何在面板上画圆
 */
//2.继承JFrame类(框架)
@SuppressWarnings({"all"})
public class DrawCircle extends JFrame {//JFrame对应一个窗口,可以理解成一个画框
    //定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口中去()
        this.add(mp);
        //设置窗口的大小
        this.setSize(400, 300);
        //设置窗口可以显示
        this.setVisible(true);
        //当点击窗口的'X'程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//1.先定义一个MyPanel,继承JPanel类,画图在这个面板上画
class MyPanel extends JPanel {
    //1.1重写方法
    /*
    1,可以理解 MyPanel就是一个画板
    2,Graphics g的g理解为一个画笔
    3,Graphics 提供了很多画图的方法
     */
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法完成初始化
        System.out.println("!!!");
        //画出一个圆形
        //g.drawOval(10,10,100,100);
        g.drawRect(20, 20, 20, 100);
        g.setColor(Color.CYAN);
        g.fillRect(20, 20, 20, 100);
        g.setColor(Color.BLACK);
        g.drawRect(100, 20, 20, 100);
        g.setColor(Color.CYAN);
        g.fillRect(100, 20, 20, 100);

        g.setColor(Color.BLACK);
        g.drawRect(40, 30, 70, 70);
        g.setColor(Color.CYAN);
        g.fillRect(40, 30, 70, 70);

    }
}