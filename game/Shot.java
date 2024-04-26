package game;

public class Shot implements Runnable{
    //子弹的坐标
    private int x;
    private int y;
    private int direct=0;

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

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private boolean isLive=true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    private int speed=2;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //根据方向改变
            switch (direct){
                case 0://上
                    y-=speed;
                    break;
                case 1://右
                    x+=speed;
                    break;
                case 2:
                    x-=speed;
                    break;
                case 3:
                    y+=speed;
                    break;
            }
            System.out.println("x="+x+"y="+y);
            //当子弹碰到敌人坦克时结束线程
            if (!(x>=0&&x<=1000&&y>=0&&y<=750)&&isLive) {
                isLive=false;
                break;
            }

        }
    }
}
