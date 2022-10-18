package FactoryMethod;

public class HtmlButton implements Button {
    public void render(){
        System.out.println("<button>Test ru.netology.FactoryMethod.Button</button>");
        onClick();
    }
    public void onClick(){
        System.out.println("Click! ru.netology.FactoryMethod.Button says - 'Hello World' ");
    }
}
