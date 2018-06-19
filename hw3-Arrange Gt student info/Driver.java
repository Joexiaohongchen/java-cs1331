/**
 * create a simulation to test of all the
 * methods would be the best course of action
 * @author xchen671
 * @version 13.31
 */
public class Driver {
/**
 * test of all the methods
 *@param args has no parameters here.
 */
    public static void main(String[] args) {
        BuzzCard card = new BuzzCard(20, 20, 20);
        card.setBuzzFunds(300);
        card.setDiningDollars(300);
        card.setMealSwipes(10);
        Student joe = new Student(card, "Joe", 903392332);
        System.out.print("Here is the original ");
        System.out.print("BrittainItem BUFFET situation.");
        System.out.println(joe);
        System.out.println(" ");
        System.out.println(" ");
        joe.buyBrittainMealSwipes(BrittainItem.BUFFET);
        System.out.print("Here is the decreasing ");
        System.out.print("BrittainItem BUFFET situation.");
        System.out.println(joe);
        System.out.println(" ");
        System.out.println(" ");
        joe.buyBurdellsBuzzFunds(BurdellsItem.HEADPHONES);
        System.out.print("Here is the decreasing ");
        System.out.print("BurdellsItem HEADPHONE situation.");
        System.out.println(joe);
        System.out.println(" ");
        System.out.println(" ");
        joe.buyBurdellsBuzzFunds(BurdellsItem.HOODIE);
        System.out.print("Here is the decreasing ");
        System.out.print("BurdellsItem HOODIE situation.");
        System.out.println(joe);
        System.out.println(" ");
        System.out.println(" ");
        joe.buyBurdellsBuzzFunds(BurdellsItem.GUM);
        System.out.print("Here is the decreasing ");
        System.out.println("BurdellsItem GUM situation.");
        System.out.println(joe);
        System.out.println(" ");
        System.out.println(" ");
        joe.buySubwayDiningDollars(SubwayItem.FOOTLONG);
        System.out.print("Here is the decreasing ");
        System.out.println("SubwayItem FOOTLONG situation.");
        System.out.println(joe);
        System.out.println(" ");
        System.out.println(" ");
        joe.buySubwayDiningDollars(SubwayItem.SIX_INCH);
        System.out.print("Here is the decreasing ");
        System.out.println("SubwayItem SIX_INCH situation.");
        System.out.println(joe);
        System.out.println(" ");
        System.out.println(" ");
        joe.buySubwayDiningDollars(SubwayItem.CHIPS);
        System.out.print("Here is the decreasing ");
        System.out.println("SubwayItem CHIPS situation.");
        System.out.println(joe);
        System.out.println(" ");
        System.out.println(" ");
        joe.buySubwayDiningDollars(SubwayItem.DRINK);
        System.out.print("Here is the decreasing ");
        System.out.println("SubwayItem DRINK situation.");
        System.out.println(joe);
        System.out.println(" ");
        System.out.println(" ");
    }
}