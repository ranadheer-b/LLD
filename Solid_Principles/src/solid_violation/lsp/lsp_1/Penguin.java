package solid_violation.lsp.lsp_1;

public class Penguin extends Bird{

    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("This bird cannot fly.");
    }
}


/*
The Liskov Substitution Principle (LSP) states that subtypes must be substitutable for their base types
without altering the correctness of the program. In simpler terms, if a class B is a subclass of A,
then objects of A should be replaceable with objects of B without breaking the application.
*/