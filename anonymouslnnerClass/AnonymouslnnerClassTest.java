package anonymouslnnerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

public class AnonymouslnnerClassTest {
    public static void main(String[] args) {
        var clock=new TalkingClock();
        clock.start(1000,true);

        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}

class TalkingClock{
    public void start(int interval,boolean boop) {
        var listener = new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.out.println("At the cone ,the time is"+ Instant.ofEpochMilli(event.getWhen()));
            }
        };
        var timer=new Timer(interval,listener);
        timer.start();
    }
}