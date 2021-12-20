//A Class to model The Cream add-on
public class Cream extends Decorator
{
    public Cream(Drink newDrink) {
        super(newDrink);
    }
    public String getDescription()
    {
        return drink.getDescription()+ "plus Cream ";
    }
    public double getCost()
    {
        return drink.getCost()+ 0.10;
    }
}
