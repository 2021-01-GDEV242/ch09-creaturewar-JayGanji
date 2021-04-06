
/**
 * Base class for more specific demons
 *
 * @author Jay Ganji
 * @version 2021-4 v1.0
 */
public class Demon extends Creature
{
    public Demon (int str, int hp) {
       super(str,hp);
    }
    
    /**
     * Allows an demon to determine how much damage it is causing in this round of battle
     * 5% chance to deal 50 bonus damage on attack
     * @return a damage value 
     */
    public int attack(){
        if (Randomizer.nextInt(20)==1){
            return super.attack()+50;
        }
        else
            return super.attack();
    }
}
