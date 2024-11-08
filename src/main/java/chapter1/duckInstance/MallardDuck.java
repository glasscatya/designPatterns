package chapter1;

public class MallardDuck extends Duck {

    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("MallardDuck display!");
    }

    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        md.performFly();
        md.performQuack();

        md.swim();
    }
}
