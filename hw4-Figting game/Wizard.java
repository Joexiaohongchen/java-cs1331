/**
 * Wizard extends Character class.
 * and implement all of its abstract methods.
 * @author Xiaohong chen
 * @version 1
 */
public class Wizard extends Character {
/**
 * Creates an Wizard with all required parameters.
 * @param seed is a Random object to generate the other stats
 * @param name is the local variable refer to the Wizard's name
 */
    public Wizard(String name, int seed) {
        super(name, seed);
    }
/**
 * Creates an Wizard with all required parameters.
 * @param name is the local variable refer to the Wizard's name
 * @param level is the local variable refer to the Wizard's leavel
 * @param strength is the local variable refer to the Wizard's strength
 * @param dexterity is the local variable refer to the Wizard's dexterity
 * @param intelligence is the local variable refer to the Wizard's intelligence
 * @param wisdom is the local variable refer to the Wizard's wisdom
 */
    public Wizard(String name, int level,
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
        setIntelligence(2);
        setWisdom(1);
    }
    @Override
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (4 + this.getWisdom()));
        }
    }
/**
* multiAttack method is to decreases each character in the parameter’s health by
* @param c is the object of Character's class.
*/
    public void multiAttack(Character ... c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i].getIsDead()) {
                System.out.println("Cannot attack a dead character");
            } else {
                c[i].setHealth(c[i].getHealth() - (2 + this.getWisdom()));
            }

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