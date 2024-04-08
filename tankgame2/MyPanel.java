package tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//绘图区
//为了监听键盘事件，实现接口KeyListener
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero=null;
    public MyPanel(){
        hero=new Hero(100,100);
        hero.setSpeed(1);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//

        //画出坦克-封装方法
        draw_tank(hero.getX(),hero.getY(),g,hero.getDirect(),0);
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
        //根据坦克的方向绘制对应形象的坦克
        switch (direct){
            case 0://表示向上
                g.fill3DRect( x, y,10,60,false);
                g.fill3DRect( x+30, y,10,60,false);
                g.fill3DRect( x+10, y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y);
                break;
            case 1://表示向右
                g.fill3DRect( x, y,60,10,false);
                g.fill3DRect( x, y+30,60,10,false);
                g.fill3DRect( x+10, y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x+60,y+20);
                break;
            case 2://表示向左
                g.fill3DRect( x, y,60,10,false);
                g.fill3DRect( x, y+30,60,10,false);
                g.fill3DRect( x+10, y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x,y+20);
                break;
            case 3://表示向上
                g.fill3DRect( x, y,10,60,false);
                g.fill3DRect( x+30, y,10,60,false);
                g.fill3DRect( x+10, y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y+60);
                break;
            default:
                System.out.println("暂时没有处理");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wsad按下的键
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_W)
        {
            //改变坦克的方向
            hero.setDirect(0);
            hero.move_up();

        } else if (e.getKeyCode()==KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.move_right();

        } else if (e.getKeyCode()==KeyEvent.VK_A) {
            hero.setDirect(2);
            hero.move_left();
        } else if (e.getKeyCode()==KeyEvent.VK_S) {
            hero.setDirect(3);
            hero.move_down();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
