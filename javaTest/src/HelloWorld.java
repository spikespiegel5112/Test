import java.applet.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

class Employee {
    String name, food;

    void getName(String name) {
        this.name = name;
    }

    String printName() {
        return name;
    }

    void getFood(String paraFood) {
        food = paraFood;
    }
}

public class HelloWorld {
    public static void main(String args[]) {
        HelloWorld hw = new HelloWorld();
        Employee employee_1 = new Employee();
        String myName = "spike";
        employee_1.getName(myName);
        employee_1.getFood("egg");
        System.out.println("Hello World"); // 打印 Hello World
        System.out.println(employee_1.printName());
        System.out.println(employee_1.food);
        employee_1.getName("ccc");
        System.out.println(employee_1.printName());
        //hw.paint();
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.blue);
        g.drawString("aaaaaaaaaaaaaaaaaaaaaaaaaaa", 30, 20);
    }
}