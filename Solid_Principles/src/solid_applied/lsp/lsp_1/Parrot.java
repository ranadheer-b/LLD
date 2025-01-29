package solid_applied.lsp.lsp_1;


public class Parrot extends Bird implements FlyableBird {

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        System.out.printf(" chirp chrp ");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
