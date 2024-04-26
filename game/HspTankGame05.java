package game;


import javax.swing.*;

public class HspTankGame05 extends JFrame {
    //定义MyPanel
    MyPanel mp=null;
    public static void main(String[] args) {
        HspTankGame05 hspTankGame01=new HspTankGame05();
    }
    public HspTankGame05(){
        mp=new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.addKeyListener(mp);//增加监听事件
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
