package WithStrategy;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(800.0,new ElectronicDevices());
        System.out.println(mobile.getDiscount());
        Laptop laptop = new Laptop(1000.0,new ElectronicDevices());
        System.out.println(laptop.getDiscount());
        Shoe shoe = new Shoe(150.0,new NonElectronicDevice());
        System.out.println(shoe.getDiscount());
        Crocs crocs = new Crocs(50.0,new NonElectronicDevice());
        System.out.println(crocs.getDiscount());
    }
}