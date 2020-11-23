import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       System.out.println("The programme has started");
       // take user input in here
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type your name: \n>");
        String userInput = myScanner.next();
        // print something out using the user input
        System.out.println("Hello " + userInput + ". It is nice to meet you!");
        // print message at the end of the programme
        System.out.println("The programme has come to an end");
    }
}
