
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.Scanner;

public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Start with one game of Craps
        System.out.println("Let's play Craps!");
        System.out.print("Press [Enter] to roll the dice...");
        in.nextLine();
        Die die1 = new Die();
        Die die2 = new Die();
        System.out.println("You rolled a " + die1.getRoll() + " and a " + die2.getRoll());
        int total = die1.rollDie() + die2.rollDie();
        if (total == 7 || total == 11)
        {
            System.out.println("You win!");
        }
        else if (total == 2 || total == 3 || total == 12)
        {
            System.out.println("You lose. :(");
        }
        else
        {
            int point = total;
            System.out.println("Keep rolling to try to make your point, " + point);
            System.out.print("Press [Enter] to roll the dice...");
            in.nextLine();
            total = die1.rollDie() + die2.rollDie();
            System.out.println("You rolled a " + die1.getRoll() + " and a " + die2.getRoll());
            while (total != point && total != 7)
            {
                System.out.println("Keep rolling...");
                System.out.print("Press [Enter] to roll the dice...");
                in.nextLine();
                total = die1.rollDie() + die2.rollDie();
                System.out.println("You rolled a " + die1.getRoll() + " and a " + die2.getRoll());
            }
        }
        
        
    }
}
