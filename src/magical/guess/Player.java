
package magical.guess;
import java.util.*;
public class Player {
    int PlayerGuess1;
    int playerGuess2;
    int playerGuess3;
   int playerGuess1()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hey!  Guess The Number in inclusive range of 0 to 9! Good Luck!");
        PlayerGuess1=scan.nextInt();
        return PlayerGuess1;
    }  
   int playerGuess2()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hey!  Guess The Number in inclusive range of 0 to 9! Good Luck!");
         playerGuess2=scan.nextInt();
        return  playerGuess2;
    }  
   int playerGuess3()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hey!  Guess The Number in inclusive range of 0 to 9! Good Luck!");
        playerGuess3=scan.nextInt();
        return playerGuess3;
    }  

    
}
