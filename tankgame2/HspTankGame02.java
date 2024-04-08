package tankgame2;

import javax.swing.*;

public class HspTankGame02 extends JFrame {
    //定义MyPanel
    MyPanel mp=null;
    public static void main(String[] args) {
        HspTankGame02 hspTankGame01=new HspTankGame02();
    }
    public HspTankGame02(){
        mp=new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);//增加监听事件
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
