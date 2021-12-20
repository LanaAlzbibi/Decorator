//An abstract class to serve as adaptor between the drink and its toppings
abstract class Decorator implements Drink
{
    protected Drink drink;
    public Decorator(Drink newDrink)
    {
        drink = newDrink;
    }
    public String getDescription()
    {
        return drink.getDescription();
    }
    public double getCost()
    {
        return drink.getCost();
    }
}
