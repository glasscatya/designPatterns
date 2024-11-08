package chapter1.duckAbs;

import chapter1.behavior.FlyBehavior;
import chapter1.behavior.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract void display();
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " swim!");
    }
}
