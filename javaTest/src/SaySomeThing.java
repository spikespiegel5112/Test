import java.awt.*;

public class SaySomeThing {
    public static void main(String args[]) {
        SaySomeThing hw = new SaySomeThing();
        Employee employee_1 = new Employee();
        String myName = "spike";
        employee_1.getName(myName);
        employee_1.getFood("egg");
        System.out.println("Hello World"); // 打印 Hello World
        System.out.println(employee_1.printName());
        System.out.println(employee_1.food);
        employee_1.getName("ccc");
        System.out.println(employee_1.printName());
//        hw.paint(Graphics);
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.blue);
        g.drawString("aaaaaaaaaaaaaaaaaaaaaaaaaaa", 30, 20);
    }
}
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

class HelloWorld extends Employee{
    HelloWorld a=new HelloWorld();
    System.out.println(a.getName('aaa'));
}