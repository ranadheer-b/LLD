package solid_violation.lsp.lsp_1;

public class Parrot extends Bird{

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
