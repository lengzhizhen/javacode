import javafx.application.Application;
import javafx.stage.Stage;

public class Homework08 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //对象的实例化
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        //给每个属性赋值
        cat1.name = "小花";
        cat1.age = 10;
        cat1.price = 1000;
        cat1.weight = 42.5;
        cat2.name = "小红";
        cat2.age = 5;
        cat2.price = 2000;
        cat2.weight = 45.2;
        System.out.println("第一只猫的信息：");
        System.out.println("姓名： "+cat1.age+"年龄： "+cat1.age+"价格： "+cat1.price+"体重： "+cat1.weight);
        System.out.println("第二只猫的信息：");
        System.out.println("姓名： "+cat2.age+"年龄： "+cat2.age+"价格： "+cat2.price+"体重： "+cat2.weight);
        Car car = new Car();
        System.out.println("车辆信息：");
        System.out.println("名字： "+car.name+"价格： "+car.price+"颜色："+car.color+"是否通过检查"+car.pass);
        //把car属性赋值给car1
        Car car1 = car;
        //改变car的属性
        car.name = "劳斯莱斯";
        //car1的属性会发生变化
        System.out.println(car1.name);

    }
}

class Cat{
    String name;
    int age;
    double price;
    double weight;
}

class Car{
    String name;
    double price;
    String color;
    boolean pass;
}
