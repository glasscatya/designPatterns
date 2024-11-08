package chapter1.behaviorImp;

import chapter1.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("无法发出声音.");
    }
}
