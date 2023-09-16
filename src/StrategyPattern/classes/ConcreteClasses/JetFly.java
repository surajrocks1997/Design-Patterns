package StrategyPattern.classes.ConcreteClasses;

import StrategyPattern.interfaces.IFlyBehavior;

public class JetFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Jet Fly");
    }
}
