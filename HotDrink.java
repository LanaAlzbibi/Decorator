//An abstract super class which provides the subclasses Coffee and Tea with some attributes and a references to the interface
abstract class HotDrink implements Drink
{
    @Override
    public String getDescription()
    {
        return "You ordered hot drink \n";
    }
}
