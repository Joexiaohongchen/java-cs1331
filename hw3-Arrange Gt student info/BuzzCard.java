/**
 * It could get all the students' informations.
 * @author xchen671
 * @version 13.31
 */
public class BuzzCard {
    private int mealSwipes;
    private double diningDollars;
    private double buzzFunds;
/**
 * Creates an BuzzCard with all required parameters.
 * @param diningDollars is a double that represents
 * the amount of dining dollars left.
 * @param buzzFunds is a double that represents the amount of buzzfunds left.
 * @param mealSwipes is an int that represents the number of meal swipes left.
 */
    public BuzzCard(double diningDollars,
                double buzzFunds, int mealSwipes) {
        this.mealSwipes = mealSwipes;
        this.diningDollars = diningDollars;
        this.buzzFunds = buzzFunds;
    }
/**
 * Getter method for the Dining Dollars required to buy an item.
 * @return dining Dollarss cost of item.
 */
    public double getDiningDollars() {
        return this.diningDollars;
    }
/**
 * Getter method for the Buzz Funds required to buy an item.
 * @return buzz Funds cost of item.
 */
    public double getBuzzFunds() {
        return this.buzzFunds;
    }
/**
 * Getter method for the Meal Swipes required to buy an item.
 * @return meal Swipes cost of item.
 */
    public int getMealSwipes() {
        return this.mealSwipes;
    }
/**
 * Creates an setDiningDollars with required parameter.
 *
 * @param diningDollars refers to the local variable
 * and it means reset the amount of dining Dollars
 */
    public void setDiningDollars(double diningDollars) {
        this.diningDollars = diningDollars;
    }
/**
 * Creates an setBuzzFunds with required parameter.
 *
 * @param buzzFunds refers to the local variable
 * and it means reset the amount of buzz Funds
 */
    public void setBuzzFunds(double buzzFunds) {
        this.buzzFunds = buzzFunds;
    }
/**
 * Creates an setMealSwipes with required parameter.
 *
 * @param mealSwipes refers to the local variable
 * and it means reset the amount of meal Swipes
 */
    public void setMealSwipes(int mealSwipes) {
        this.mealSwipes = mealSwipes;
    }
/**
 * toString method string the BuzzCard balance with
 * Dining Dollars, Buzz Funds and Meal Swipes.
 * @return BuzzCard balance with
 * Dining Dollars, Buzz Funds and Meal Swipes.
 */
    public String toString() {
        return "Buzzcard balance with Dining Dollars: "
                + diningDollars + " Buzz Funds: "
                + buzzFunds + " Meal Swipes: " + mealSwipes;
    }
}