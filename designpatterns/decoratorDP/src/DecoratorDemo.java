public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza1 = new PepperoniDecorator(new MargharetiPizza());
        System.out.println(pizza1.getDescription()+" "+pizza1.getPrice());
        Pizza pizza2 = new CheeseDecorator(new PepperoniDecorator(new NormalPizza()));
        System.out.println(pizza2.getDescription()+" "+pizza2.getPrice());
    }
}

/*

The Decorator design pattern is a structural pattern used in object-oriented programming to add new functionality
to objects dynamically without altering their structure. In Java, this pattern is often employed to extend the behavior
of objects in a flexible and reusable way.
 */