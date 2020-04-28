package example;
/*
* 如果只有一个ConcreteComponent类而没有抽象的Component类,
*  那么Decorator类可以是ConcreteComponent的一个子类.
* 同理, 如果只有一个ConcreteDecorator类, 那么就没有必要建立一个单独的Decorator类,
*  而可以把Decorator和ConcreteDecorator的责任合并成一个类.
* */
public class Person { // 相当于ConcreteComponent(没有抽象的Component类)
    public Person(){}

    private String name;
    public Person(String name){
        this.name = name;
    }

    public void Show(){
        System.out.println("装扮的" + name);
    }
}
