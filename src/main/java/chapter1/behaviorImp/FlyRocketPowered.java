package chapter1;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我正在借助火箭飞行.");
    }
}
