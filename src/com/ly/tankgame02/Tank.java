package com.ly.tankgame02;

/**
 * @author 刘样
 * @version 1.0
 */
public class Tank {
    private int x;
    private int y;
    private int spead=1;
    private int direct;



    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public void methodUP(){
        y-=spead;
    }public void methodDOWN(){
        y+=spead;
    }public void methodLEFT(){
        x-=spead;
    }public void methodRIGHT(){
        x+=spead;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
