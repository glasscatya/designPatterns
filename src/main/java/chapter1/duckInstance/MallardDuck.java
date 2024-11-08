package chapter1.duckInstance;

import chapter1.behaviorImp.FlyWithWings;
import chapter1.behaviorImp.MuteQuack;
import chapter1.duckAbs.Duck;

public class MallardDuck extends Duck {

    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck display!");
    }

    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        md.performFly();
        md.performQuack();

        md.swim();
    }
}
