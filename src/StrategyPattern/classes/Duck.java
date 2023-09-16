package StrategyPattern.classes;

import StrategyPattern.interfaces.IDisplayBehavior;
import StrategyPattern.interfaces.IFlyBehavior;
import StrategyPattern.interfaces.IQuackBehavior;

public class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    IDisplayBehavior displayBehavior;

    public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior, IDisplayBehavior displayBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.displayBehavior = displayBehavior;
    }

    public void fly(){
        this.flyBehavior.fly();
    }

    public void quack(){
        this.quackBehavior.quack();
    }

    public void display(){
        this.displayBehavior.display();
    }
}
