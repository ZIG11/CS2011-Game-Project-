import java.util.Scanner;
import java.lang.Math;

class gameExample{

//Changing the dimmensions of x_vars and y_vars will affect the sizing of:
// Map, borders, random# generator
public static int x_vars = 40; // Up/down walls 40
public static int y_vars = 80; // bottom/top 80
public static int random_num_gen = 7000; //High, as repeating values wont cause an issue
public static char walls = (char)35;

public static void initializeMap(char[][] grid) {
  for (int i=0; i<101; i++) {
    for (int j=0; j<101; j++) {
      grid[i][j]=walls; // ASCII Using # as the walls
    }
  }
}

public static void displayMap(char[][] grid) {
  for (int k=0; k<random_num_gen; k++) {
    int rnd1 = Math.abs((int)(Math.random() * x_vars) - 1);
    int rnd2 = Math.abs((int)(Math.random() * y_vars) - 1);
    grid[rnd1][rnd2] = ' '; // This will get delete parts of map
  }
// Border left and right
  for (int n=0; n<x_vars; n++) {
    grid[n][0] = walls;
    grid[n][y_vars] = walls;
  }
// Border top and bottom
  for (int y=0; y<y_vars; y++) {
  grid[0][y] = walls;
  grid[x_vars][y] = walls;
  }
//Prints the map after deleting with random # generator & setting walls
boolean location = false;
  do{
    for (int i=0; i<y_vars; i++) {
        if((grid[1][i] == ' ') && (grid[0][i] == ' ')){
          grid[0][i] = '@';
          location = true;
        }
  }
}while(location != true);

  for (int i=0; i<x_vars; i++) {
    for (int j=0; j<y_vars; j++) {
      System.out.print(grid[i][j]);
    }
    System.out.println();
  }
}

public static void main(String[] args) {
  boolean quit=false;
  char[][] map=new char[500][500];

// initialize map
  initializeMap(map);
  displayMap(map);
  System.out.println(map.length);
// input loop
//do {
// display map
// getInput
//} while (!quit);
// end game
}
}
