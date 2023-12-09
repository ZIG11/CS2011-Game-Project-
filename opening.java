// Project

import java.util.Scanner; // so I can ask for input from the user!
public class opening {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in); // Preparing the code for input
    System.out.println("Wow... Intresting seeing you stumble upon here... Are you ready to learn or die?\n\n 1. Play\n 2. Instructions\n 3. Help"); // Game Welcoming

    int answer=input.nextInt();

    if (answer==2) {

    System.out.println("You are in an education dungeon and the goal is to get out alive. Manuever through the map to fight various bosses. Each boss is a teacher with their own subject related questions. Answer them correctly to improve your GPA. Or die.\n\n W - Move Forward\n A - Move Left\n S - Move Backwards\n D - Move Right");
    int instructionsanswer=input.nextInt();
    System.out.println("Press 0 to Return to the Main Menu");


    if (instructionsanswer==0) {

    }

    else if (answer==3) {
      System.out.println("We don't give help over here! Begone!");

    }

    else if (answer==1) {

    }

    else {
      System.out.println("Please enter a valid input");
      
    }
  }

  }

}
