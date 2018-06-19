/**
 * Fighter extends Character class.
 * and implement all of its abstract methods.
 * @author Xiaohong chen
 * @version 1
 */
public class Fighter extends Character {

/**
 * Creates an Fighter with all required parameters.
 * @param seed is a Random object to generate the other stats
 * @param name is the local variable refer to the Fighter's name
 */
    public Fighter(String name, int seed) {
        super(name, seed);
    }
/**
 * Creates an Fighter with all required parameters.
 * @param name is the local variable refer to the Fighter's name
 * @param level is the local variable refer to the Fighter's leavel
 * @param strength is the local variable refer to the Fighter's strength
 * @param dexterity is the local variable refer to the Fighter's dexterity
 * @param intelligence is the local variable refer to the Fighter's intelligence
 * @param wisdom is the local variable refer to the Fighter's wisdom
 */
    public Fighter(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }
    @Override
    public void levelUp() {
        setLevel(1);
        setHealth(5 * getLevel());
        setStrength(2);
        setDexterity(1);
        setIntelligence(1);
        setWisdom(1);
    }
    @Override
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (10 + this.getStrength()));
        }

    }
    @Override
    public String toString() {
        return "Level " + getLevel() + " fighter named " + getName()
                + " with " + getStrength() + " strength, "
                + getDexterity() + " dexterity, " + getIntelligence()
                + " intelligence, and " + getWisdom() + " wisdom.";
    }

}