
/**
 * Write a description of class Craps here.
 *
 * @author Richard White
 * @version 2021-02-08
 */
public class Craps
{
    public static void main(String[] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        
        
        int total = d1.roll() + d2.roll();
        if (total == 7 || total == 11)
        {
            // won the game!
        }
        else if (total == 2 || total == 3 || total == 12)
        {
            // lost the game!
        }
        else     // didn't win or lose, try to roll point
        {
            int point = total;
            
            while (total != 7 && total != point)
            {
                // haven't won or lost yet
                
                
            }
            // Give the right message
            if (total == point)
            {
                // won the game!
            }
            else
            {
                // lost the game!
            }
        }
    }
}
