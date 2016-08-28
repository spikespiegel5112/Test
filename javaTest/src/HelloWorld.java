import java.applet.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); // 打印 Hello World
        HelloWorld hw=new HelloWorld();
        hw.paint();
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawString("aaaaaaaaaaaaaaaaaaaaaaaaaaa",30,20);
    }
}