package chapter1.duckInstance;

import chapter1.behaviorImp.FlyNoWay;
import chapter1.behaviorImp.MuteQuack;
import chapter1.duckAbs.Duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("这是一只模型鸭子");
    }
}
