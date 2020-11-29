import java.util.Random;
import java.util.Scanner;

public class CoinFlip {

    public static final String HEADS = "heads";
    public static final String TAILS = "tails";

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        boolean playingGame = true;

        while(playingGame){
            System.out.print("Choose heads or tails ?\n >  ");
            String userInput = myScanner.next();

            // coin flip
            System.out.println("flipping coin.....");
            Random generator = new Random();
            int randomInt = generator.nextInt(2);

            // make coin flip heads or tails
            String coinFlip;
            if(randomInt == 0){
                coinFlip = HEADS;
            }else{
                coinFlip = TAILS;
            }
            System.out.println("It's " + coinFlip + "!" );

            // check if user wins
            if(userInput.equals(coinFlip)){
                playingGame = false;
                System.out.println("You won!");
            }else{
                System.out.println("Oh no you lost :( Try again");
            }
        }
    }
}
