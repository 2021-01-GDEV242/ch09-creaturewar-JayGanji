/**
 * The Cyberdemon class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [100/25]
 * 
 * @author Jay Ganji
 * @version 2021-4 v1.0
 */
public class CyberDemon extends Demon
{
    //
    private static final int MAX_CYDEM_HP = 100;
    private static final int MIN_CYDEM_HP = 25;
    private static final int MAX_CYDEM_STR = 40;
    private static final int MIN_CYDEM_STR = 20;

    /**
     * Constructor for objects of class Cyberdemon -
     * 
     * The instantiating class asks for a Cyberdemon and the cyberdemon class is responsible for
     * return a cyberdemon object with values in the appropriate range
     * 
     */
    public CyberDemon()
    {
        
        super(
            Randomizer.nextInt(MAX_CYDEM_HP-MIN_CYDEM_HP)+MIN_CYDEM_HP,    
            Randomizer.nextInt(MAX_CYDEM_STR-MIN_CYDEM_STR)+MIN_CYDEM_STR
        );
          
    }
    
}
