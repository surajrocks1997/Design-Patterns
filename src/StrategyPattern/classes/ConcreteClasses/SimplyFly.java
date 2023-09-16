package StrategyPattern.classes.ConcreteClasses;

import StrategyPattern.interfaces.IFlyBehavior;

public class SimplyFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Simply Fly");
    }
}
