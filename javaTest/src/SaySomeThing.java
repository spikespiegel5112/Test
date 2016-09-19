import java.awt.*;


public class SaySomeThing {
    public static void main(String args[]) {
        //println test
        System.out.println("Hello World");
        //variable test
        String myName = "spike";
        //instantiation test
        Employee employee_1 = new Employee();
        //method test
        employee_1.getName(myName);
        employee_1.getFood("egg");
        //porperty test
        System.out.println(employee_1.name);
        System.out.println(employee_1.food);
        employee_1.getName("ccc");
        System.out.println(employee_1.name);
        //inheritent test
        Say say=new Say();
        say.say("Hello World");
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

    String getName(String name) {
        this.name = name;
        return name;
    }

    void printName(String name) {
        System.out.println(name);
    }

    void getFood(String paraFood) {
        food = paraFood;
    }
}

class Say extends Employee {
    void say(String word) {
        Say a = new Say();
        String aaa = a.getName("aaa");
        a.printName(word);
    }
}

