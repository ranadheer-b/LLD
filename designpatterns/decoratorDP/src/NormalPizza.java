public class NormalPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Normal Pizza";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
