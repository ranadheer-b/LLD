package solid_applied.lsp.lsp_1;

public abstract class Bird {
    String name;
    String color;

    public Bird(String name,String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void makeSound();
}
