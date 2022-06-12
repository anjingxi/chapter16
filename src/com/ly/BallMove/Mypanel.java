package com.ly.BallMove;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 刘样
 * @version 1.0
 */
//KeyListener 是监听器,可以监听键盘事件
public class Mypanel extends JPanel implements KeyListener {
    //为了让小球可以移动,我们把小球的x和y设成变量
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {

        super.paint(g);
        g.fillOval(x,y,30,30);
    }
    //有字符输出时,该方法就会被触发,
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //当某个键按下时,该方法会被触发
    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println((char) e.getKeyCode());
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y++;
        } else if (e.getKeyCode()==KeyEvent.VK_UP) {
           y--;
        }else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
           x--;
        }else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
           x++;
        }
        this.repaint();
    }
    //当某个键释放(松开)了,该方法会被触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
