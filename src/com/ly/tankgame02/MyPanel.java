package com.ly.tankgame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 刘样
 * @version 1.0
 */
//画板
public class MyPanel extends JPanel implements KeyListener {
    //定义自己的坦克
    MyTank tank = null;

    public MyPanel() {
        tank = new MyTank(100, 100);
    }
    //重写方法

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillRect(0, 0, 1000, 750);
        //画出坦克封装方法
        drawTank(tank.getX(), tank.getY(), g, tank.getDirect(), 1);
    }


    /**
     * @param x      坦克的左上角x坐标
     * @param y      坦克的左上角y坐标
     * @param g      画笔
     * @param direct 坦克方向(上下左右)
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        //先判断类型
        switch (type) {
            case 0: //自己的
                g.setColor(Color.cyan);
                break;
            case 1://别人的
                g.setColor(Color.yellow);
                break;
            default:
        }
        //判断方向
        switch (direct) {//0向上,1向右,2,向下,3向左
            case 0: //向上的
                g.fill3DRect(x, y, 10, 60, false);//画出左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出中间的
                g.fillOval(x + 10, y + 20, 20, 20);//画出中间圆形
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1: //向右的
                g.fill3DRect(x, y + 20, 60, 10, false);//画出左边的轮子
                g.fill3DRect(x, y + 50, 60, 10, false);//画出右边的轮子
                g.fill3DRect(x + 10, y + 30, 40, 20, false);//画出中间的
                g.fillOval(x + 20, y + 30, 20, 20);//画出中间圆形
                g.drawLine(x + 30, y + 40, x + 60, y + 40);
                break;
            case 2: //向下的
                g.fill3DRect(x, y, 10, 60, false);//画出左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出中间的
                g.fillOval(x + 10, y + 20, 20, 20);//画出中间圆形
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3: //向左的
                g.fill3DRect(x, y + 20, 60, 10, false);//画出左边的轮子
                g.fill3DRect(x, y + 50, 60, 10, false);//画出右边的轮子
                g.fill3DRect(x + 10, y + 30, 40, 20, false);//画出中间的
                g.fillOval(x + 20, y + 30, 20, 20);//画出中间圆形
                g.drawLine(x + 30, y + 40, x, y + 40);
                break;
            default:
                System.out.println("先不处理");

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            tank.setDirect(0);
            tank.methodUP();
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            tank.setDirect(2);
            tank.methodDOWN();
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            tank.setDirect(3);
            tank.methodLEFT();
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            tank.setDirect(1);
            tank.methodRIGHT();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
