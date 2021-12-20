//A Class to model The Sugar add-on
public class Sugar extends Decorator
{
    public Sugar(Drink newDrink) {
        super(newDrink);
    }
    public String getDescription()
    {
        return drink.getDescription()+ "plus Sugar ";
    }
    public double getCost()
    {
        return drink.getCost() + 0.05;
    }
}
