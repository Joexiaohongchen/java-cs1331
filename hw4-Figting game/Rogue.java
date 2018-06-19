/**
 * Rogue extends Character class.
 * and implement all of its abstract methods.
 * @author Xiaohong chen
 * @version 1
 */
public class Rogue extends Character {
/**
 * Creates an Rogue with all required parameters.
 * @param seed is a Random object to generate the other stats
 * @param name is the local variable refer to the Rogue's name
 */
    public Rogue(String name, int seed) {
        super(name, seed);
    }
/**
 * Creates an Rogue with all required parameters.
 * @param name is the local variable refer to the Rogue's name
 * @param level is the local variable refer to the Rogue's leavel
 * @param strength is the local variable refer to the Rogue's strength
 * @param dexterity is the local variable refer to the Rogue's dexterity
 * @param intelligence is the local variable refer to the Rogue's intelligence
 * @param wisdom is the local variable refer to the Rogue's wisdom
 */
    public Rogue(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }
    @Override
    public void levelUp() {
        setLevel(1);
        setHealth(5 * getLevel());
        setStrength(2);
        setDexterity(3);
        setIntelligence(2);
        setWisdom(2);
    }
    @Override
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (6 + this.getDexterity()));
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