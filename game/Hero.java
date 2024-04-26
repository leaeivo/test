package game;

public class Hero extends Tank {
    public Hero(int x, int y) {
        super(x, y);
    }
    //定义一个shot对象
    Shot shot=null;
    public void shotEnemyTank(){
        //根据当前hero对象的位置和方向来创建Shot
        switch (getDirect()){
            case 0://向上
                shot=new Shot(getX()+20,getY(),0);
                break;
            case 1://向右
                shot=new Shot(getX()+60,getY()+20,1);
                break;
            case 2://向左
                shot=new Shot(getX(),getY()+20,2);
                break;
            case 3://向下
                shot=new Shot(getX()+20,getY()+60,3);
                break;
        }
        new Thread(shot).start();
    }
    //启动shot线程


}
