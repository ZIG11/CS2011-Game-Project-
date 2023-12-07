import java.util.Scanner;
import java.util.Scanner;
import java.lang.Math;

public class Test{

//Changing the dimmensions of x_vars and y_vars will affect the sizing of:
// Map, borders, random# generator
public static int MaxHeight = 40;
public static int MaxLength = 80;
public static int StartPoint = 0;
public static int random_num_gen = 7000; //High, as repeating values wont cause an issue
public static char walls = (char)35;

public static int len_min_one = MaxHeight-2; //1st row after bottom ##########
public static int len_min_two = MaxHeight-3; //2nd row after bottom ##########

public static void initializeMap(char[][] grid) {
  for (int i=0; i<101; i++) {
    for (int j=0; j<101; j++) {
      grid[i][j]=walls; // ASCII Using # as the walls
    }
  }
}

public static void displayMap(char[][] grid) {
  for (int k=0; k<random_num_gen; k++) {
    int rnd1 = Math.abs((int)(Math.random() * MaxHeight) - 1);
    int rnd2 = Math.abs((int)(Math.random() * MaxLength) - 1);
    grid[rnd1][rnd2] = ' '; // This will get delete parts of map
  }
// Border left and right
  for (int n=0; n<MaxHeight; n++) {
    grid[n][StartPoint] = walls; //Placing defined walls along left wall
    grid[n][MaxLength] = walls;
  }
// Border top and bottom
  for (int y=0; y<MaxLength; y++) {
    grid[StartPoint][y] = walls; // Bottom map wall
    grid[MaxHeight][y] = walls; // Top map wall
  }


for (int m=0; m<MaxLength; m++) {
  if((grid[len_min_one][m]== ' ') && (grid[len_min_two][m]== ' ')){
    grid[(len_min_one)][m] = 'A';
    m=MaxLength;
 }
}
  for (int i=0; i<MaxHeight; i++) {
    for (int j=0; j<MaxLength; j++) {
      System.out.print(grid[i][j]);
    }
    System.out.println();
  }
}

public static void UserInput(int coordinate , char NextMove,char[][] grid){
  char[][] PlayerLocation =new char[500][500];
  int loc = grid[0];
  int orig_loc = grid[1];
  int up_down = 0;
  int old = 0;
  int Wcount = 0;

  if(NextMove == 'W'){
    if(Wcount == 0){
      loc = len_min_one-Wcount;
    }
    Wcount = Wcount +1;
    for (int m=0; m<MaxLength; m++) {
      if(grid[loc][m]== 'A'){
        orig_loc = m;
        m = MaxLength;
      }
    }
     up_down= Wcount+ 1;
      if(grid[loc - Wcount][orig_loc]== ' '){


      loc = loc-Wcount;
       grid[loc][orig_loc] = 'A';
       old=loc+Wcount;
       grid[old][orig_loc] = ' ';

     }
      else if(grid[len_min_one-up_down][orig_loc]== '#'){
        grid[len_min_one][orig_loc] = 'A';
    }
}


System.out.println("Loc:"+loc);
System.out.println("Wcount:"+Wcount);
System.out.println("orig_loc:"+orig_loc);


return ;
}



public static void UpdatedMap(char[][] grid){
  for (int i=0; i<MaxHeight; i++) {
    for (int j=0; j<MaxLength; j++) {
      System.out.print(grid[i][j]);
    }
    System.out.println();
  }


}




public static void main(String[] args) {
  boolean quit=false;
  char[][] map=new char[500][500];
  Scanner input=new Scanner(System.in);
  int coordinate = {0,0};

// initialize map
  initializeMap(map);
  displayMap(map);

// input loop
do {
  System.out.println("Which Direction would you like to go?");
  char Input=input.nextLine().charAt(0);
  char NextMove = Character.toUpperCase(Input);
  if(NextMove == 'Q'){
    quit = true;
  }
  UserInput(coordinate,NextMove,map);
  UpdatedMap(map);
} while (!quit);
// end game
}
}
