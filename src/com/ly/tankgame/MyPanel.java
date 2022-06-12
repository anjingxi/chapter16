package com.ly.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘样
 * @version 1.0
 */
//画板
public class MyPanel extends JPanel {
    //定义自己的坦克
    MyTank tank = null;
    public MyPanel(){
        tank = new MyTank(100,100);
    }
    //重写方法

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillRect(0,0,1000,750);
        //画出坦克封装方法
        drawTank(tank.getX(),tank.getY(),g,0,0);
    }


    /**
     *
     * @param x 坦克的左上角x坐标
     * @param y 坦克的左上角y坐标
     * @param g 画笔
     * @param direct 坦克方向(上下左右)
     * @param type 坦克类型
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type){

        //先判断类型
        switch (type){
            case 0: //自己的
                g.setColor(Color.cyan);
                break;
            case 1://别人的
                g.setColor(Color.yellow);
                break;
            default:
        }
        //判断方向
        switch (direct){
            case 0: //向上的
                g.fill3DRect(x,y,10,60,false);//画出左边的轮子
                g.fill3DRect(x+30,y,10,60,false);//画出右边的轮子
                g.fill3DRect(x+10,y+10,20,40,false);//画出中间的
                g.fillOval(x+10,y+20,20,20);//画出中间圆形
                g.drawLine(x+20,y+30,x+20,y);
                break;
            default:
                System.out.println("先不处理");

        }
    }
}
