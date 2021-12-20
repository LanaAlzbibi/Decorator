// Simple main class to create and print drinks name and the total prices.
public class DrinkMaker
{
    public static void main(String[] args)
    {
        Coffee coffee = new Coffee();
        System.out.println("Coffee Pure -----> price: "+ coffee.getCost());
        Tea tea = new Tea();
        System.out.println("Tea Pure -----> price: "+ tea.getCost());

        //Adding sugar to the Coffee
        Sugar sugar  = new Sugar(coffee);
        //Adding cream after the sugar
        Cream cream  = new Cream(sugar);
        //Adding sugar again
        Sugar sugar2 = new Sugar(cream);
        //Adding cream again
        Cream cream2 = new Cream(sugar2);
        //Adding more cream
        Cream cream3 = new Cream(cream2);
        //Ready to be served
        Drink hotCoffee = cream3 ;


        System.out.println(hotCoffee.getDescription());
        System.out.println("Price: "+ hotCoffee.getCost());

        //Tea is ready to be served
        Drink hotTea =new Cream(new Sugar(tea));

        System.out.println(hotTea.getDescription());
        System.out.println("Price: "+hotTea.getCost());

    }
}
