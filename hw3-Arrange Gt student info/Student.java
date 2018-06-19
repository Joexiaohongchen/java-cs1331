/**
 * This class has the following private field
 * and associated getter methods for them
 * @author xchen671
 * @version 13.31
 */
public class Student {
    private BuzzCard card;
    private String name;
    private int id;
/**
 * Creates an Student with all required parameters.
 * @param card is the local variable refer to the student’s BuzzCard
 * @param name is the local variable refer to the student’s name
 * @param id is the local variable refer to the student’s is
 */
    public Student(BuzzCard card, String name, int id) {
        this.card = card;
        this.name = name;
        this.id = id;
    }
/**
 * Getter method for BuzzCard object that
 * represents the student’s BuzzCard.
 * @return the object of the buzzcard.
 */
    public BuzzCard getCard() {
        return this.card;
    }
/**
 * Getter method for String that represents
 * the name of the student.
 * @return the name of the field.
 */
    public String getName() {
        return this.name;
    }
/**
 * Getter method for int that represents
 * the gtID of the student.
 * @return the id of the field.
 */
    public  int getID() {
        return this.id;
    }
/**
 * Creates an buyBrittainMealSwipes with required parameter.
 *
 * @param item refers to the Meal Swipes of the
 * BrittainItem enum class.
 */
    public void buyBrittainMealSwipes(BrittainItem item) {
        if (card.getMealSwipes() >= item.getMealSwipes()) {
            card.setMealSwipes(card.getMealSwipes() - item.getMealSwipes());
        } else {
            System.out.print("You do not have ");
            System.out.print("the amount to buy this item :");
        }
    }
/**
 * Creates an buyBrittainBuzzFunds with required parameter.
 *
 * @param item refers to the Buzz Funds of the
 * BrittainItem enum class.
 */
    public void buyBrittainBuzzFunds(BrittainItem item) {
        if (card.getBuzzFunds() >= item.getBuzzFunds()) {
            card.setBuzzFunds(card.getBuzzFunds() - item.getBuzzFunds());
        } else {
            System.out.print("You do not have ");
            System.out.print("the amount to buy this item :");
        }
    }
/**
 * Creates an buyBurdellsBuzzFunds with required parameter.
 *
 * @param item refers to the Buzz Funds of the
 * BurdellsItem enum class.
 */
    public void buyBurdellsBuzzFunds(BurdellsItem item) {
        if (card.getBuzzFunds() >= item.getBuzzFunds()) {
            card.setBuzzFunds(card.getBuzzFunds() - item.getBuzzFunds());
        } else {
            System.out.print("You do not have ");
            System.out.print("the amount to buy this item :");
        }
    }
/**
 * Creates an buySubwayDiningDollars with required parameter.
 *
 * @param item refers to the Dining Dollars of the
 * SubwayItem enum class.
 */
    public void buySubwayDiningDollars(SubwayItem item) {
        if (card.getDiningDollars() >= item.getDiningDollars()) {
            card.setDiningDollars(card.getDiningDollars()
                - item.getDiningDollars());
        } else {
            System.out.print("You do not have ");
            System.out.print("the amount to buy this item :");
        }
    }
/**
 * Creates an buySubwayBuzzFund with required parameter.
 *
 * @param item refers to the Buzz Funds of the
 * SubwayItem enum class.
 */
    public void buySubwayBuzzFunds(SubwayItem item) {
        if (card.getBuzzFunds() >= item.getBuzzFunds()) {
            card.setBuzzFunds(card.getBuzzFunds() - item.getBuzzFunds());
        } else {
            System.out.print("You do not have ");
            System.out.print("the amount to buy this item :");
        }
    }
/**
 * toString method string the student's name
 * student's id and the informations about the buzzcard.
 * @return student's name and student's id and
 * the informations about the buzzcard.
 */
    public String toString() {
        return "Student " + name + " with ID: " + id + " " + card.toString();
    }
}