package com.DecoratorPattern;

class ConcreteDecoratorA extends Decorator{
    private String addedState; //本类独有功能,  以区别于ConcreteDecoratorB

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
