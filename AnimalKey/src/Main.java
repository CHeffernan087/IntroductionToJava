import java.util.Random;
import java.util.Scanner;

public class Main {

    public static boolean parseUserInput(String userInput){
        if(userInput.toLowerCase().charAt(0) == 'y'){
            return true;
        }else{
            return  false;
        }
    }
    public static void main(String[] args){
        boolean isWarmBlooded;
        boolean hasFins;
        boolean hasScales;
        boolean hasFeathers;
        // ask user questions
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Does the animal have warm blood?\n >  ");
        isWarmBlooded = parseUserInput(myScanner.next());
        System.out.print("Does the animal have fins?\n >  ");
        hasFins = parseUserInput(myScanner.next());
        System.out.print("Does the animal have Scales?\n >  ");
        hasScales = parseUserInput(myScanner.next());
        System.out.print("Does the animal have Feathers?\n >  ");
        hasFeathers = parseUserInput(myScanner.next());

        // determine animal class using key
        String animalClass;
        if(isWarmBlooded == true){
            if(hasFeathers == true){
                animalClass = "bird";
            }else{
                animalClass = "mammal";
            }
        }else{
            if(hasScales == true){
                if(hasFins){
                    animalClass = "fish";
                }else{
                    animalClass = "reptile";
                }
            }else{
                animalClass= "amphibian";
            }
        }
        String pronoun = animalClass.equals("amphibian")?"an":"a";
        System.out.println("The animal is "+ pronoun+ " "+animalClass );
    }
}
