

/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * 
 * @author Jay Ganji
 * @version 2021-4 v1.0
 */
public class Elf extends Creature
{
    //
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for a Elf and the elf class is responsible for
     * return a elf object with values in the appropriate range
     * 
     */
    public Elf()
    {
        
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
          
    }
    
    
    /**
     * Allows an elf to determine how much damage it is causing in this round of battle
     * 10% chance to deal magical damage (double damage)
     * @return a damage value 
     */
    public int attack(){
        if (Randomizer.nextInt(10)==1){
            return 2*super.attack();
        }
        else
            return super.attack();
    }
    // takeDamage(int) - not overridden

    
}