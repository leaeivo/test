package game;

public class Tank {
    private int direct;//0 上 3下 1 右 2 左

    private int speed;
    private int x;//坦克的横坐标
    private int y;//坦克的纵坐标

    //WASD方法
    public void move_up(){
        y-=speed;
    }
    public void move_right(){
        x+=speed;
    }public void move_down(){
        y+=speed;
    }public void move_left(){
        x-=speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
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
}
