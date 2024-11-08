package chapter1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.display();
        model.swim();

        //给模型鸭设置飞行能力。
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}