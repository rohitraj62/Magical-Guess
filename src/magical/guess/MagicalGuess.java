
package magical.guess;

public class MagicalGuess {
 
    
    public static void main(String[] args) {
        System.out.println("Game Started!");
       Umpire U=new Umpire();
       U.collectNumberFromGuesser();
       U.collectNumberFromPlayers();
       U.decidewinningPlayer();
       
    }
    
}
