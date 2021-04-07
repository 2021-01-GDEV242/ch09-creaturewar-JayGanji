import java.util.ArrayList;

/**
 * Write a description of class BattleSim here.
 *
 * @author Jay Ganji
 * @version 2021-4-5 v1.0
 */
public class BattleSim
{
    //Create armies
    private ArrayList<Creature> army1 = new ArrayList<>();
    private ArrayList<Creature> army2 = new ArrayList<>();
    
    //Populate armies
    public void populateArmies()
    {
        int i=0;
        while (i<100){
            if ((Randomizer.nextInt(10)+1) < 7)
                army1.add(new Human());
            else
                army1.add(new Elf());
            i++;
        }
        
        int j=0;
        while (j<40){
            if ((Randomizer.nextInt(25)+1) < 19)
                army2.add(new Human());
            else if((Randomizer.nextInt(25)+1) < 25)
                army2.add(new CyberDemon());
            else
                army2.add(new Balrog());    
            j++;
        }
    }
    
    //FIGHT
    public void doBattle()
    {
        while (army1.size()>0 && army2.size()>0)
        {
            //turn 1
            army2.get(0).takeDamage(army1.get(0).attack());
            if (army2.get(0).isKnockedOut())
                army2.remove(0);
            //turn 2
            if (!(army2.size() == 0)){
                army1.get(0).takeDamage(army2.get(0).attack());
                if (army1.get(0).isKnockedOut())
                    army1.remove(0);
            }
            
            //repeat
        }
        
        if (army1.size() > army2.size())
            System.out.println("The humans and elves are victorious");
        else
            System.out.println("The Demons are victorious");
    }
}
