package WithoutStrategy;

public class Main {
    public static void main(String[] args) {
       Mobile mobile = new Mobile("Iphone 16",1,800.0);
       System.out.println(mobile.getDiscount());
       Laptop laptop = new Laptop("Laptop LG",2,1000.0);
       System.out.println(laptop.getDiscount());
       Shoe shoe = new Shoe("Air max",3,150.0);
       System.out.println(shoe.getDiscount());
       Crocs crocs = new Crocs("Crocs Air",4,50.0);
       System.out.println(crocs.getDiscount());
    }
}


/*
The Strategy Design Pattern is used when you need to define a family of algorithms,encapsulate each one, and make them interchangeable.
This allows the algorithm to vary independently from clients that use it.
Helps in code reusability by making strategies. If multiple child classes have the same implementation of code, there will be duplicate code.
By using strategies, one can remove the code duplication.
 */