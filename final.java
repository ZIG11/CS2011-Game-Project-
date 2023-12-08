//Try To Escape Highschool, from Team 1
// Team Member 1:Siggifreddo Aguilar
// Team Member 2:Chiemela Eziechelle - Nwoke
// Team Member 3:Sebastian Garcia

import java.util.Scanner;
public class AwesomestGame{
  static final String ANSI_CLEAR="\u001B[2J";
  static final String ANSI_REPOSITION="\u001B[H";
  static final String ANSI_RESET="\u001B[0m";
  static final String ANSI_BLACK="\u001B[30m";
  static final String ANSI_BLACK_BKGRND="\u001B[40m";
  static final String ANSI_RED="\u001B[31m";
  static final String ANSI_RED_BKGRND="\u001B[41m";
  static final String ANSI_GREEN="\u001B[32m";
  static final String ANSI_GREEN_BKGRND="\u001B[42m";
  static final String ANSI_YELLOW="\u001B[33m";
  static final String ANSI_YELLOW_BKGRND="\u001B[43m";
  static final String ANSI_BLUE="\u001B[34m";
  static final String ANSI_BLUE_BKGRND="\u001B[44m";
  static final String ANSI_PURPLE="\u001B[35m";
  static final String ANSI_PURPLE_BKGRND="\u001B[45m";
  static final String ANSI_CYAN="\u001B[36m";
  static final String ANSI_CYAN_BKGRND="\u001B[46m";
  static final String ANSI_WHITE="\u001B[37m";
  static final String ANSI_WHITE_BKGRND="\u001B[47m";
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    //Each and every sperate array for questions and answers. And seperated through Subjects.
    String[] mathQ = {"What is 12*12?","What is 256-432?","What is 369/3?","Convert 2 pi radians into degrees?","The Pythagorean theorem is a^2 + b^2 equals __?","What is the strongest known shape to exist?","How many sides does a square have?","How do you find slope?","If you multiply a negative number with a negative number, will you get a negative or a positive number?","If John has 25 apples and he ate 2, gave away 4, and ate 3 more. How many apples does he have left?"};
    String[] mathA = {"144","-176","123","360","c^2","Triangle","4","rise over run","Positive number","16"};

    String[] englishQ ={"What is the symbol called that is used to end a statement?","What is the first paragraph of your essay known as?","Copying someone else's work and making it your own is known as?","True or False: A paragraph can be as many sentences as you want it to be.","What is the symbol we use to end a question?","What are terms with the same pronunciation but different spelling and meaning called?","What is a rhetorical device used to compare two things using the words 'like' and 'as'?","In order to convey excitement and exclamation with a statement, we use what symbol?","The statement 'The food tasted awfully good' is an example of what figure of speech?"};
    String[] englishA ={"Period","Introduction","Plagiarism","True","?","Homophones","Simile","!","Oxymoron"};

    String[] scienceQ = {"True or False Males have 2 X chromosomes.","True or False An octopus has the ability to camoflauge.","What are 8 legged arachnids called?","What is the the process by which plants use sunlight, water, and carbon dioxide to create oxygen and energy in the form of sugar?","What is the powerhouse of a cell?","Who is the creator of the atomic bomb?","Who created the law of gravity?","What is the center of the earth known as?","What does Au on the periodic table represent?","Are homosapieans mammals or reptiles?","What is the theory which the entire space, universe and everything that exist today was created by a giant explosion?"};
    String[] scienceA = {"False","True","Spiders","Photosynthesis","Mitochondria","J. Robert Oppenheimer","Isaac Newton","Core","Gold","Mammals","Big bang theory"};

    String[] historyQ = {"Who was the first president of the United States?","Who was the fifth president of the United States?","What is the mass genocide of 6 million Jewish people known as?","True or False World War 2 ended in 1945?","How many wives did King Henry the 8th have?","Who is the first-ever person to land on the Moon?","Who was able to wield lightning by tying a key to a kite?","Who created the light bulb?","What is the name of the prominent leader in the civil rights movement that created the 'I have a dream' speech?","True or False Cesar Chavez was not a labor leader and civil rights activist César that brought about better conditions for agricultural workers."};
    String[] historyA = {"George Washington","Abraham Lincoln","Holocaust","True","Six Wives","Neil Armstrong","Benjamin Franklin","Thomas Edison","Martin Luther King Jr.","False"};

    String[] peQ = {"How many calories make a pound?","How many calories can you burn running 1 mile?","True or False: Vegetables are a part of the food pyramid.","True or False: Fruits and vegetables are unhealthy for you.","Is cheese a part of dairy or grains in the food pyramid?","How many cups of water are recommended to drink a day?","An apple a day keeps the ___ away?","True or False: Cheeseburgers are really good for your health.","How many players in total are present in a basketball game?","How many strikes do you need to strikeout in baseball?"};
    String[] peA = {"3500","100","True","False","Dairy","8","Doctor","False","10","3"};

    String[] electiveQ = {"What number does indexing start on?","A set of instructions that are associated with an object","True or False: A code editor is a form of programming language.","A set of instructions or procedures to perform a specific task.","Any element of a computer that's physical.","People call it the brain of the computer","A collection of items stored at memory locations","A procedure or formula used for solving a problem.","What programming language was this made in?","A value that can change depending on the conditions & information in the program"};
    String[] electiveA = {"0","method","False","function","hardware","CPU","array","algorithm","java","variable"};

    System.out.println("Would you like to play game:");
    System.out.println("Press[1] to play");
    System.out.println("Press[2] to view instructions");
    System.out.println("Press[3] to quit");
    int myInt=input.nextInt();

     if(myInt==1){
    // Questions For each question will pop up and a score in Precentages will be issuedin the end of each subject quiz
    int numberOfQuestions=5;
    int totalClasses=6;

    System.out.print(ANSI_CLEAR+ANSI_REPOSITION);

    System.out.println("Hello, welcome to THE SCHOOL. Yes, I said it, THEEEE Schooool, like Shakespeare, you know. Anyways, it seems you're new around here. Let me introduce you to the basics. You'll be going around classes and answering some seriously intense questions. I hope you read the instruction menu because that's all the help you're gonna get. Well, back to what I'm saying. You can graduate from this school in a day. Yes, you heard me, a DAY. Just make sure to pass each class by answering all the teachers' questions correctly. And don't be afraid to get any answers wrong. As long as you pass a class with a GPA of 2.5 or above, you are free from this wild learning experience forever. Obviously, if you decide to play again, you're back to this living hellhole. But have fun. Make it fun. You'll be starting with six different courses. First up is MATH, ooooh, Numbers... NEXT is ENGLISH... snoozefest in my opinion... SCIENCE, I LOVE SCIENCE... HISTORY, oh yeah, that's the good stuff... PE, GET YOUR HEALTH ON... AND FINALLY, LAST BUT NOT LEAST, PROGRAMMING. You're gonna have so much fun with these bosses. Wait, I mean teachers. Totally not evil teachers that might kill you if you get under a 2.5. Anyways, get going. SEE YA!");

    System.out.println();

    System.out.println("Welcome to Math. I have you answer all my questions.\n"+"HAAAVE FUUUUN. BWA HA HA HA... Prepare yourself for the mind-bending world of numbers!\n"+"I'm your crazy math teacher, and I'm OBSESSED with math! If you need help, just ask—although..JUST KIDDING IDIOT I'M EVIL.\n"+"Imma enjoy seeing you squirm and cry trying to solve my questions. Now, let the mathematical madness begin! Mwahahaha...");
    System.out.println();
    int mathScore = askQuestions(mathQ, mathA, numberOfQuestions);
    double mathPercentage = calculatePercentageScore(mathScore, numberOfQuestions, "math");
    System.out.println("You have scored a total of "+mathPercentage+"% in math");
    System.out.println();

    System.out.println("Press Enter to continue:");
    String random2=input.nextLine();

    System.out.print(ANSI_CLEAR+ANSI_REPOSITION);

    System.out.println("YAAWWWWN. Oh, welcome to English, where everything is English and nothing but English.\n"+"Hurry up and get on with the questions. I'm a tired, lazy teacher who just wants to leave and get this over with.\n"+"Let's make it quick, shall we? I hate my life.");
    System.out.println();
    int englishScore = askQuestions(englishQ, englishA, numberOfQuestions);
    double englishPercentage = calculatePercentageScore(englishScore, numberOfQuestions, "english");
    System.out.println("You have scored a total of "+englishPercentage+"% in english");
    System.out.println();

    System.out.println("Press Enter to continue:");
    String random3=input.nextLine();

    System.out.print(ANSI_CLEAR+ANSI_REPOSITION);

    System.out.println("WELCOME TO SCIENCE. OOOH, WE GET TO DO ALL SORTS OF COOL EXPERIMENTS ABOUT THE HUMAN BODY AND THEIR ORGANS AND BLOOD... SO MUCH BLOOD...\n"+"cough... Oh, sorry, off track. HA HA. Get ready for some thrilling experiments! Science is about to get wild! \n"+"But today we'll focus on those questions first.");
    System.out.println();
    int scienceScore = askQuestions(scienceQ, scienceA, numberOfQuestions);
    double sciencePercentage = calculatePercentageScore(scienceScore, numberOfQuestions, "science");
    System.out.println("You have scored a total of "+sciencePercentage+"% in science");
    System.out.println();

    System.out.println("Press Enter to continue:");
    String enter4=input.nextLine();

    System.out.print(ANSI_CLEAR+ANSI_REPOSITION);
    System.out.println("OOOOH, WELCOME WORTHY TRAVELER! \n"+"Partake in my history test, and trust me, you will have a blast! Now, let's journey through the annals of time.\n"+"Ah, don't forget to add the word 'Wives' to the Henry the 8th question if you get there, okay?\n"+"Prepare yourself for a delightful adventure through the pages of history. Shall we commence our quest?");
    System.out.println();
    int historyScore = askQuestions(historyQ, historyA, numberOfQuestions);
    double historyPercentage = calculatePercentageScore(historyScore, numberOfQuestions, "history");
    System.out.println("You have scored a total of "+historyPercentage+"% in history");
    System.out.println();

    System.out.println("Press Enter to continue:");
    String enter5=input.nextLine();

    System.out.print(ANSI_CLEAR+ANSI_REPOSITION);

    System.out.println("HUT 2 3 4, HUT 2 3 4! WELCOME TO PE, kid!\n"+"We're gonna put you through tough training to get you prepped for this intense class.\n"+"NOW GET DOWN AND GIVE ME 5, MAGGOT! You think you can handle the rigorous training of physical education? We'll see about that.\n"+"Now, DROP AND GIVE ME THOSE PUSH-UPS");
    System.out.println();
    int peScore = askQuestions(peQ, peA, numberOfQuestions);
    double pePercentage = calculatePercentageScore(peScore, numberOfQuestions, "PE");
    System.out.println("You have scored a total of "+pePercentage+"% in PE");
    System.out.println();

    System.out.println("Press Enter to continue:");
    String enter2=input.nextLine();

    System.out.print(ANSI_CLEAR+ANSI_REPOSITION);

    System.out.println("Just get started on the programming test.\n"+"It ends in 5 minutes, by the way. Don't procrastinate, homie. Let's keep it chill and down to earth. \n"+"No need to stress – we got this!");
    System.out.println();
    int electiveScore = askQuestions(electiveQ, electiveA, numberOfQuestions);
    double electivePercentage = calculatePercentageScore(electiveScore, numberOfQuestions, "Programming");
    System.out.println("You have scored a total of "+electivePercentage+"% in Programming");
    System.out.println();
    System.out.print(ANSI_CLEAR+ANSI_REPOSITION);
    // receieve the total gpa with all scores and credits added up together
    //Completely changed the GPA system cause my method wasnt working correctly
    double mathgpa=calculateGPA(mathScore, numberOfQuestions, "math");
    double englishgpa=calculateGPA(englishScore, numberOfQuestions, "english");
    double historygpa=calculateGPA(historyScore, numberOfQuestions, "history");
    double sciencegpa=calculateGPA(scienceScore, numberOfQuestions, "science");
    double pegpa=calculateGPA(peScore, numberOfQuestions, "PE");
    double electivegpa=calculateGPA(electiveScore, numberOfQuestions, "Elective");

    double sumGPA=mathgpa+englishgpa+historygpa+sciencegpa+pegpa+electivegpa;
    double gpa=sumGPA/(double)totalClasses;

    //If GPA is not enough you die
    System.out.println("Your overall GPA is: "+gpa);
    if(gpa<2.5){
      System.out.println("You Died");
      } else{
      System.out.println("YOU WON AND GOT YOURSELF A DIPLOMA!!!!");
      }
      System.out.println("Game Over");
  }else if(myInt==2){
  System.out.print(ANSI_CLEAR+ANSI_REPOSITION);
  System.out.println("- Please answer the following questions thoroughly.\n"+"- Pay attention to spelling and capitalization, as they are crucial for correct answers.\n"+"- For questions that require a numerical response, provide only the number.\n" +"- When answering with a name, include both the first and last names, unless the question specifies otherwise.\n"+"- For example, in the case of Oppenheimer, abbreviate the first name and capitalize both the middle and last names.\n"+ "- Always capitalize the first word of your answer, and make sure to include spaces where necessary.\n"+"= These questions are meticulous, so accuracy is key.");
  System.out.println("Would youlike to contine? Press[1] to play game, Press[3] to quit");
  while (true) {
      int userInput = input.nextInt();

      if (userInput == 1 || userInput == 3) {
          if (userInput == 1) {
              // Start the game
          } else if (userInput == 3) {
              System.exit(0);
          }
          break;
      } else {
          System.out.println("Invalid input. Please enter 1 or 3.");
      }
    }
} else if(myInt==3){
 System.exit(0);
} else {
   System.out.print(ANSI_CLEAR+ANSI_REPOSITION);
   System.out.println("Oh no, you seem to not know how to follow simple instructions. Please enter the following: Press[1] to play, Press[2] for instructions, press[3] to quit");

   // Keep prompting until a valid input is provided
   while (true) {
       int userInput = input.nextInt();

       if (userInput == 1 || userInput == 2 || userInput == 3) {
           if (userInput == 1) {
               // Start the game
           } else if (userInput == 2) {
               // Display instructions
           } else if (userInput == 3) {
               System.exit(0);
           }
           break;
       } else {
           System.out.println("Invalid input. Please enter 1, 2, or 3.");
       }
}

  }
}

  // Creating a method soley to incorpate and ask questions and allow user to answer questions.
  static int askQuestions(String[] questions, String[] answers, int numberOfQuestions){
    Scanner input=new Scanner(System.in);
    int score=0;

    //using for loop to repeat 5 random question out of the listed arrays
    for (int i=0; i<numberOfQuestions;i++){
      int randomIndexNum=(int)(Math.random()*questions.length);
      System.out.print(questions[randomIndexNum]+" ");
      String usersAnswer=input.nextLine();


      //answers have the same exact number as questions so each answer is correlated to the right question
      if (usersAnswer.equals(answers[randomIndexNum])) {
        System.out.println("You are correct");
        score++;
      } else{
        System.out.println("You are incorrect");
        }
    }
    //keep track of score
    return score;
  }
  //Creating another method specificaly to caculate each score from each different subject
  static double calculatePercentageScore(int score, int totalQuestions, String subject){
    return (score/(double)totalQuestions)*100;
  }
  //To gather the total GPA we want to recieve the score after each Test. We convert the test scores into credit and divde the credits by the number of subjects
  static double calculateGPA(int score, int totalQuestions, String subject){
    double overallPercentage=(score/(double)totalQuestions)*100;

    if (overallPercentage>=90){
      return 4.0;
    } else if(overallPercentage>=80){
      return 3.0;
    } else if(overallPercentage>=60){
      return 2.0;
    } else if(overallPercentage>=40){
      return 1.0;
    } else{
      return 0.0;
    }
  }
}
