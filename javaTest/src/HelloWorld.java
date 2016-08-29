import java.applet.*;
import java.awt.*;
import java.io.*;
//import java.swing.*;

class Employee{
    String name;
    public void getName(String name){
        this.name=name;
    }
}

public class HelloWorld {
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.blue);
        g.drawString("aaaaaaaaaaaaaaaaaaaaaaaaaaa",30,20);
    }

    public static void main(String args[]) {
        HelloWorld hw=new HelloWorld();
        Employee employee_1=new Employee();
        employee_1.getName("spike");
        System.out.println("Hello World"); // 打印 Hello World
        System.out.println(employee_1.);
//        hw.paint();
    }
}