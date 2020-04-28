package example;

public class Finery extends Person{ // 相当于Decorator
    protected Person component;

    public void Decorate(Person component){
        this.component = component;
    }

    @Override
    public void Show() {
        if(component != null)
            component.Show();
    }
}
