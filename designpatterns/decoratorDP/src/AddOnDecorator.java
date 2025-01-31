public abstract class AddOnDecorator implements Pizza {
    Pizza pizza;

    public AddOnDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public int getPrice() {
        return pizza.getPrice();
    }
}
