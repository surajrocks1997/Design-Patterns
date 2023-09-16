package StrategyPattern.classes.ConcreteClasses;

import StrategyPattern.interfaces.IDisplayBehavior;

public class TextDisplay implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("Text Display");
    }
}
