public class CheeseDecorator extends AddOnDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" with Cheese Decorator";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 3;
    }
}
