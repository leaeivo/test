package tankgame;

import javax.swing.*;
import java.awt.*;

//绘图区
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero=null;
    public MyPanel(){
        hero=new Hero(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//

        //画出坦克-封装方法
        draw_tank(hero.getX(),hero.getY(),g,0,0);
        draw_tank(hero.getX()+60,hero.getY()+60,g,0,1);
    }
    //编写方法，画出坦克

    /**
     *
     * @param x 坦克左上角x的坐标
     * @param y 坦克的左上角y的坐标
     * @param g 画笔
     * @param direct 坦克方向
     * @param type 坦克类型
     */
    public void draw_tank(int x,int y,Graphics g,int direct,int type){
        switch (type){
            case 0:
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.orange);
                break;

        }
        //根据tank的方向绘制
        switch (direct){
            case 0://表示向上
                g.fill3DRect( x, y,10,60,false);
                g.fill3DRect( x+30, y,10,60,false);
                g.fill3DRect( x+10, y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y);
                break;
            default:
                System.out.println("暂时没有处理");
        }

    }

}
