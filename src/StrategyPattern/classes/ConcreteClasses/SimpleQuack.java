package StrategyPattern.classes.ConcreteClasses;

import StrategyPattern.interfaces.IQuackBehavior;

public class SimpleQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Simple Quack");
    }
}
