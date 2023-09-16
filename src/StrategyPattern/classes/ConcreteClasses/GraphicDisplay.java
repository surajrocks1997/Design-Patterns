package StrategyPattern.classes.ConcreteClasses;

import StrategyPattern.interfaces.IDisplayBehavior;

public class GraphicDisplay implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("Graphic Display");
    }
}
