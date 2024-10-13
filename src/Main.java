import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAffil = "";

        System.out.print("Enter your party affiliation (D, R, I, or Other): ");

        while(in.hasNextInt() || in.hasNextDouble()) {
            in.nextLine();
            System.out.print("Please enter a valid letter (D, R, I, or Other): ");
        }
        if(!(in.hasNextInt() || in.hasNextDouble())){
            partyAffil = in.nextLine();
        }

        if(Objects.equals(partyAffil, "R") || Objects.equals(partyAffil, "r")){
            System.out.println("You got a Republican Rhino!");
        }
        else if (Objects.equals(partyAffil, "D") || Objects.equals(partyAffil, "d")){
            System.out.println("You got a Democratic Donkey!");
        }
        else if (Objects.equals(partyAffil, "I") || Objects.equals(partyAffil, "i")){
            System.out.println("You got an Independent Humanoid!");
        }
        else{
            System.out.println("Who do you think you are? What is " + partyAffil + "?");
        }
    }
}