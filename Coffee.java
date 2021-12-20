//A Class to model a cup of coffee
public class Coffee extends HotDrink
{
    @Override
    public String getDescription()
    {
        return super.getDescription()+ "Coffee ";
    }

    @Override
    public double getCost()
    {
        return 0.60;
    }
}
