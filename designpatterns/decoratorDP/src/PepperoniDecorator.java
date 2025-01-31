public class PepperoniDecorator extends AddOnDecorator{
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" with Pepperoni ";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+5;
    }
}
