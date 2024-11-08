package chapter1;

public class ModelDuck extends Duck{
    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("这是一只模型鸭子");
    }
}
