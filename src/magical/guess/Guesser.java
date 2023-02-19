
package magical.guess;
import java.util.*;
public class Guesser {
    int guessnumber;
   int guessNumber()
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("Guesser Do your Job : Guess a number in inclusive range of 0 to 9");
    guessnumber=scan.nextInt();
    if(guessnumber>9 &&guessnumber<0)
    {
        System.out.println("Wrong Input Mr. Guessor! Please Follow Given Instruction");
    }
    return guessnumber;
    }
    
}
