
package magical.guess;

public class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    
    void collectNumberFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNumber(); 
    }
    void collectNumberFromPlayers()
    {
      Player p1=new Player();
     numFromPlayer1= p1.playerGuess1();
     
     Player p2=new Player();
     numFromPlayer2=p2.playerGuess2();
     
     Player p3=new Player();
      numFromPlayer3=p3.playerGuess3();
    } 
         void decidewinningPlayer()
    {
       if(numFromGuesser== numFromPlayer1) 
       {
           if(numFromGuesser== numFromPlayer2 && numFromGuesser== numFromPlayer3)
           {
           System.out.println("Player1 win Congratulations");
           System.out.println("Player2 win Congratulations");
           System.out.println("Player3 win Congratulations");
           }
           else if(numFromGuesser== numFromPlayer2)
           {
               System.out.println("Player1 win Congratulations");
           System.out.println("Player2 win Congratulations");
            }
           else if(numFromGuesser== numFromPlayer3)
           {
               System.out.println("Player3 win Congratulations");
           }

        }
       
       else  if(numFromGuesser== numFromPlayer2) 
       {
          if(numFromGuesser== numFromPlayer2 &&  numFromGuesser== numFromPlayer3)
          {
             System.out.println("Player2 win Congratulations");
           System.out.println("Player3 win Congratulations"); 
          }
          }
           
      else  if(numFromGuesser== numFromPlayer3) 
       {
           System.out.println("Player3 win Congratulations");
       }
          
       }
    
}
