package com.DecoratorPattern;

class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void AddedBehavior(){
        // 本类独有方法, 以区别于ConcreteDecoratorA
        System.out.println("具体装饰对象B增加额外的功能");
    }
}
