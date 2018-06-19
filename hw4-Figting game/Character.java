import java.util.Random;

/**
 * Abstract class representing the define the characters stats
 * Create the public get and set method, support the subclasses.
 * @author Xiaohong chen
 * @version 1
 */

public abstract class Character {
    private String name;
    private int level;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int health;
    private boolean isDead = false;
/**
 * Creates an Character with all required parameters.
 * @param seed is a Random object to generate the other stats
 * @param name is the local variable refer to the Character's name
 */
    public Character(String name, int seed) {
        this.name = name;
        setLevel(1);
        setHealth(5);
        Random pick = new Random(seed);
        setStrength(pick.nextInt(6) + 1);
        setDexterity(pick.nextInt(6) + 1);
        setIntelligence(pick.nextInt(6) + 1);
        setWisdom(pick.nextInt(6) + 1);
    }
/**
 * Creates an Character with all required parameters.
 * @param name is the local variable refer to the Character's name
 * @param level is the local variable refer to the Character's leavel
 * @param strength is the local variable refer to the Character's strength
 * @param dexterity is the local variable refer to the Character's dexterity
 * @param intelligence is the local variable refer totheCharacter's intelligence
 * @param wisdom is the local variable refer to the Character's wisdom
 */
    public Character(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        this.name = name;
        this.level = level;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        health = 5 * getLevel();
        if (getHealth() < 0) {
            isDead = true;
            setIsDead(isDead);
            setHealth(0);
        }
    }

/**
* Getter method for the name
* @return name.
*/
    public String getName() {
        return name;
    }

/**
* Getter method for the level
* @return level.
*/
    public int getLevel() {
        return level;
    }

/**
* Setter method for the name
* @param level passing the parameter to field level.
*/
    public void setLevel(int level) {
        this.level = level;
    }
/**
* Getter method for the strength
* @return strength.
*/
    public int getStrength() {
        return strength;
    }
/**
* Setter method for the strength
* @param strength passing the parameter to field strength
*/
    public void setStrength(int strength) {
        this.strength = strength;
    }

/**
* Getter method for the dexterity
* @return dexterity.
*/
    public int getDexterity() {
        return dexterity;
    }
/**
* Setter method for the dexterity
* @param dexterity passing the parameter to field dexterity
*/
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
/**
* Getter method for the intelligence
* @return intelligence.
*/
    public int getIntelligence() {
        return intelligence;
    }
/**
* Setter method for the intelligence
* @param intelligence passing the parameter to field intelligence
*/
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
/**
* Getter method for the wisdom
* @return wisdom.
*/
    public int getWisdom() {
        return wisdom;
    }
/**
* Setter method for the wisdom
* @param wisdom passing the parameter to field wisdom
*/
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
/**
* Getter method for the health
* @return health.
*/
    public int getHealth() {
        return health;
    }
/**
* Setter method for the health
* @param health passing the parameter to field health
*/
    public void setHealth(int health) {
        this.health = health;
    }
/**
* Getter method for the isDead
* @return false.
*/
    public boolean getIsDead() {
        return false;
    }
/**
* Setter method for the isDead
* @param isDead passing the parameter to field isDead
*/
    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }
/**
* levelUp method is to increase the character’s level by
*/
    public abstract void levelUp();
/**
* attack method decrement the health of the parameter character by
* @param c is the object of Character
*/
    public abstract void attack(Character c);
/**
* toString method for string
* @return string
*/
    public abstract String toString();

}
