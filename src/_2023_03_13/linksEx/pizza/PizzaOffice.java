package _2023_03_13.linksEx.pizza;

public class PizzaOffice {
    String phoneNumber;

    public Pizza getOrder(Order order) {
        Calculator.calculate();//------------
        return order.getPizza();
    }
}
