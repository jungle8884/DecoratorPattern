package com.DecoratorPattern;
import example.*;

public class Main {

    public static void main(String[] args) {
        {
            ConcreteComponent c = new ConcreteComponent();
            ConcreteDecoratorA d1 = new ConcreteDecoratorA();
            ConcreteDecoratorB d2 = new ConcreteDecoratorB();

            d1.setComponent(c);
            d2.setComponent(d1);
            d2.operation();
        }
        System.out.println("\n---------------------");
        {
            Person xc = new Person("小蔡");
            System.out.println("\n第一种装扮: ");
            Sneakers pqx = new Sneakers();
            BigTrouser kk = new BigTrouser();
            TShirts dtx = new TShirts();

            pqx.Decorate(xc);
            kk.Decorate(pqx);
            dtx.Decorate(kk);
            dtx.Show();

            System.out.println("\n第二种装扮: ");
            LeatherShoes px = new LeatherShoes();
            Tie ld = new Tie();
            Suit xz = new Suit();

            px.Decorate(xc);
            ld.Decorate(px);
            xz.Decorate(ld);
            xz.Show();

            System.out.println("\n第三种装扮: ");
            Sneakers pqx2 = new Sneakers();
            LeatherShoes px2 = new LeatherShoes();
            BigTrouser kk2 = new BigTrouser();
            Tie ld2 = new Tie();

            pqx2.Decorate(xc);
            px2.Decorate(pqx2);
            kk2.Decorate(px2);
            ld2.Decorate(kk2);
            ld2.Show();
        }
    }
}
