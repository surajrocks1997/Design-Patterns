package StrategyPattern.classes.ConcreteClasses;

import StrategyPattern.interfaces.IQuackBehavior;

public class NoQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("No Quack");
    }
}
