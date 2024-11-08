package chapter1.behaviorImp;

import chapter1.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack的叫");
    }
}
