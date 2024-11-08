package chapter1.behaviorImp;

import chapter1.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我正在借助火箭飞行.");
    }
}
