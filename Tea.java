//A Class to model a cup of Tea
public class Tea extends HotDrink
{
    @Override
    public String getDescription()
    {
        return super.getDescription()+ "Tea ";
    }

    @Override
    public double getCost()
    {
        return 0.50;
    }
}
