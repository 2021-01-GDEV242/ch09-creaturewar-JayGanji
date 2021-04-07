/**
 * The Balrog class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [100/50]
 * Implements a maximum/minimum hitpoint total for the creature type [200/80]
 * 
 * @author Jay Ganji
 * @version 2021-4 v1.0
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
          
    }

    /**
     * Allows an balrog to determine how much damage it is causing in this round of battle
     * Balrogs attack twice each round
     * @return a damage value 
     */
    public int attack(){
        return 2 * super.attack();
    }
}
