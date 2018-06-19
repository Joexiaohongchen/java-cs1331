import java.util.Random;
/**
 * Cleric extends Character class.
 * and implement all of its abstract methods.
 * @author Xiaohong chen
 * @version 1
 */
public class Cleric extends Character {

/**
 * Creates an Cleric with all required parameters.
 * @param seed is a Random object to generate the other stats
 * @param name is the local variable refer to the Cleric's name
 */
    public Cleric(String name, int seed) {
        super(name, seed);
    }
/**
 * Creates an Cleric with all required parameters.
 * @param name is the local variable refer to the Cleric's name
 * @param level is the local variable refer to the Cleric's leavel
 * @param strength is the local variable refer to the Cleric's strength
 * @param dexterity is the local variable refer to the Cleric's dexterity
 * @param intelligence is the local variable refer to the Cleric's intelligence
 * @param wisdom is the local variable refer to the Cleric's wisdom
 */
    public Cleric(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }
    @Override
    public void levelUp() {
        setLevel(1);
        setHealth(5 * getLevel());
        setStrength(1);
        setDexterity(1);
        setIntelligence(1);
        setWisdom(2);
    }
    @Override
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (6 + this.getWisdom()));
        }
    }

/**
* heal method is to increases the parameter characters health by
* @param c is the object of Character's class.
*/
    public void heal(Character c) {
        Random increaseHealth = new Random();
        int getBlood = increaseHealth.nextInt(6) + 1;

        if (c.getIsDead()) {
            System.out.println("Cannot heal a dead character");
        }

        if ((c.getHealth() + getBlood) > (c.getLevel() * 5)) {
            c.setHealth(c.getLevel() * 5);
        } else {
            c.setHealth(c.getHealth() + getBlood);
        }
    }

    @Override
    public String toString() {
        return "Level " + getLevel() + " fighter named "
                + getName() + " with " + getStrength() + " strength, "
                + getDexterity() + " dexterity, " + getIntelligence()
                + " intelligence, and " + getWisdom() + " wisdom.";
    }
}