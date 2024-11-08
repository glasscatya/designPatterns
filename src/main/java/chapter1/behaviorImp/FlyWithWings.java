package chapter1;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("正在用翅膀飞行.");
    }
}
