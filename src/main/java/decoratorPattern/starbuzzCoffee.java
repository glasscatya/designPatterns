package decoratorPattern;

import decoratorPattern.beverage.Beverage;
import decoratorPattern.beverageImp.Espresso;
import decoratorPattern.beverageImp.HouseBlend;
import decoratorPattern.decorator.Mocha;
import decoratorPattern.decorator.Soy;
import decoratorPattern.decorator.Whip;

public class starbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

    }
}
