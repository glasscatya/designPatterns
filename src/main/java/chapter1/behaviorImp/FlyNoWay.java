package chapter1.behaviorImp;

import chapter1.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不能飞行.");
    }
}
