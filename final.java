<<<<<<< HEAD
// Project, push testtttttt
=======
hello there!
Discard these changes!
>>>>>>> 92c312ef293226a753815eaf344b9a29fe394955

import java.util.Scanner;
public class TestGame{
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

    // Questions For each question will pop up and a score in Precentages will be issuedin the end of each subject quiz
    int numberOfQuestions=5;
    int mathScore = askQuestions(mathQ, mathA, numberOfQuestions);
    double mathPercentage = calculatePercentageScore(mathScore, numberOfQuestions, "math");
    System.out.println("You have scored a total of "+mathPercentage+"% in math");
    int mathCredits=4;
    System.out.println();

    int englishScore = askQuestions(englishQ, englishA, numberOfQuestions);
    double englishPercentage = calculatePercentageScore(englishScore, numberOfQuestions, "english");
    System.out.println("You have scored a total of "+englishPercentage+"% in english");
    int englishCredits=4;
    System.out.println();

    int scienceScore = askQuestions(scienceQ, scienceA, numberOfQuestions);
    double sciencePercentage = calculatePercentageScore(scienceScore, numberOfQuestions, "science");
    System.out.println("You have scored a total of "+sciencePercentage+"% in science");
    int scienceCredits=4;
    System.out.println();

    int historyScore = askQuestions(historyQ, historyA, numberOfQuestions);
    double historyPercentage = calculatePercentageScore(historyScore, numberOfQuestions, "history");
    System.out.println("You have scored a total of "+historyPercentage+"% in history");
    int historyCredits=4;
    System.out.println();

    int peScore = askQuestions(peQ, peA, numberOfQuestions);
    double pePercentage = calculatePercentageScore(peScore, numberOfQuestions, "PE");
    System.out.println("You have scored a total of "+pePercentage+"% in PE");
    int peCredits=4;
    System.out.println();

    // receieve the total gpa with all scores and credits added up together
    double gpa=calculateGPA(mathScore, mathCredits, englishScore, englishCredits, scienceScore, scienceCredits, historyScore, historyCredits, peScore, peCredits);
    //If GPA is not enough you die
    System.out.println("Your overall GPA is: "+gpa);
    if(gpa<2.5){
      System.out.println("You Died");
    } else{
      System.out.println("YOU WON AND GOT YOURSELF A DIPLOMA!!!!");
    }
    System.out.println("Game Over");
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
      Sting lowerAnswer=usersAnswer.toLowercase();

      //answers have the same exact number as questions so each answer is correlated to the right question
      if (lowerAnswer.equals(answers[randomIndexNum])) {
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
  static double calculateGPA(int mathScore,int mathCredits, int englishScore, int englishCredits, int scienceScore, int scienceCredits, int historyScore, int historyCredits, int peScore, int peCredits){
    int totalScore=mathScore+englishScore+scienceScore+historyScore+peScore;
    int totalCredits=mathCredits+englishCredits+scienceCredits+historyCredits+peCredits;

    double overallPercentage=(totalScore/(double)totalCredits)*100;

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
