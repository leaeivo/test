package event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 演示小球通过键盘上下左右的移动，java的事件控制
 */
public class BallMove extends JFrame{
    MyPanel mp=null;
    public static void main(String[] args) {
        BallMove ballMove=new BallMove();
    }
    public BallMove(){
        mp=new MyPanel();
        this.add(mp);
        this.setSize(400,200);
        //在窗口对象里面加入我们监听事件，既可以监听面板上面的监听事件0
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
/**
 * Keylistener 是监听器，可以监听键盘事件
 */
class MyPanel extends JPanel implements KeyListener {

    //为了让小球可以移动，我们把左上角的坐标(x,y)设置成变量
    int x=10,y=10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,30,30);
    }
    //监听字符
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //某个键按下会触发
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char) e.getKeyCode()+"被按下");
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y++;
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            y--;
        }
        else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            x++;
        }
        else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            x--;
        }


        this.repaint();
    }
    //当某个建松开该方法触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}