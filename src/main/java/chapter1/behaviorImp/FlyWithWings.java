package chapter1.behaviorImp;

import chapter1.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("正在用翅膀飞行.");
    }
}
