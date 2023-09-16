package StrategyPattern;

import StrategyPattern.classes.ConcreteClasses.GraphicDisplay;
import StrategyPattern.classes.ConcreteClasses.JetFly;
import StrategyPattern.classes.ConcreteClasses.SimpleQuack;
import StrategyPattern.classes.Duck;
import StrategyPattern.interfaces.IDisplayBehavior;
import StrategyPattern.interfaces.IFlyBehavior;
import StrategyPattern.interfaces.IQuackBehavior;

public class Main {
    public static void main(String[] args) {
        IDisplayBehavior display = new GraphicDisplay();
        IQuackBehavior quack = new SimpleQuack();
        IFlyBehavior fly = new JetFly();

        Duck duck = new Duck(fly, quack, display);

        duck.fly();
        duck.quack();
        duck.display();
    }
}
