package game;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//绘图区
//为了监听键盘事件，实现接口KeyListener
//将子弹变成线程使用
public class MyPanel extends JPanel implements KeyListener,Runnable {
    //定义我的坦克
    Hero hero=null;
    //定义敌人的坦克，放入到vector里面
    Vector<EnemyTank> enemyTanks=new Vector<>();
    Vector<Bomb> bombs=new Vector<>();
    Image image1=null;
    int enemyTankSize=3;
    public MyPanel(){
        hero=new Hero(100,100);
        hero.setSpeed(1);
        //初始化敌人的tank
        for (int e = 0; e < enemyTankSize; e++) {
            EnemyTank enemyTank=new EnemyTank(100*(e+1),0);
            enemyTank.setDirect(3);
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            enemyTank.shots.add(shot);
            new Thread(shot).start();

            enemyTanks.add(enemyTank);

        }
        //初始化
        image1=Toolkit.getDefaultToolkit().getImage("./bomb1.gif");

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//

        //画出坦克-封装方法
        draw_tank(hero.getX(),hero.getY(),g,hero.getDirect(),0);
        //画出hero射击的子弹
        if(hero.shot!=null&&hero.shot.isLive())
        {
            g.fill3DRect(hero.shot.getX(),hero.shot.getY(),2,2,false);
        }
        //画炸弹
        for (int i = 0; i <bombs.size() ; i++) {
            Bomb bomb = bombs.get(i);
            //根据bomb对象的life值去画出炸弹
            if(bomb.life>0){
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            }
            bomb.lifeDown();
            //life为0
            if(bomb.life==0){
                bombs.remove(bomb);


            }
        }

        //画出敌人的坦克
        for (int i=0;i<enemyTanks.size();i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if(enemyTank.isLive){//确定坦克被击中
                draw_tank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
                    //画出子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //取出子弹
                    Shot shot = enemyTank.shots.get(j);
                    //绘制
                    if(shot.isLive()){

                        g.fill3DRect(shot.getX(),shot.getY(),2,2,false);
                    }
                    else {
                        enemyTank.shots.remove(shot);
                    }


                }
            }
        }
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
            case 3://表示向下
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
    //编写方法，判断子弹是否击中

    public void hitTank(Shot s, EnemyTank enemyTank){
        switch (enemyTank.getDirect()){
            case 0:
            case 2:
                if(s.getX()>enemyTank.getX()&&s.getX()<enemyTank.getX()+40
                        &&s.getY()>enemyTank.getY()&&s.getY()<enemyTank.getY()+60){
                    s.setLive(false);
                    enemyTank.isLive=false;
                    Bomb bomb=new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                    enemyTanks.remove(enemyTank);
                }
                break;
            case 1:
            case 3:
                if (s.getX()>enemyTank.getX()&&s.getX()<enemyTank.getX()+60
                &&s.getY()>enemyTank.getY()&&s.getY()<enemyTank.getY()+40) {
                    s.setLive(false);
                    enemyTank.isLive=false;
                    Bomb bomb=new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                    enemyTanks.remove(enemyTank);

                }
                break;
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
        if(e.getKeyCode()==KeyEvent.VK_J) {

            System.out.println("用户按下j");
            hero.shotEnemyTank();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {

                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断是否击中敌人坦克
            if(hero.shot!=null&&hero.shot.isLive()){
                //遍历敌人所有的坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot,enemyTank);
                }

            }
            this.repaint();
        }
    }
}
