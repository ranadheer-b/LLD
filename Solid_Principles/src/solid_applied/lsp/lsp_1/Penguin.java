package solid_applied.lsp.lsp_1;


public class Penguin extends Bird {

    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        System.out.printf("Penguins sound");
    }

}
