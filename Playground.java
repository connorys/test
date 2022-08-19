import java.util.Random;
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

//instructions
    System.out.println("\n\nAnswer these questions and we will come up with a name for your pet. Please only type \"0\", \"1\", or \"2\" \"3\".");

//question 1
    System.out.println("\nQuestion 1. What kind of animal is your pet? \n1) Dog \n2) Cat \n3) Bird");
    
//create a scanner object    
    Scanner scanner = new Scanner(System.in);  

//saving user input in a variable
    String userAnswer1 = scanner.nextLine();  
    int userAnswer1int = Integer.parseInt(userAnswer1);
//question 2
    System.out.println("\nWhat color is your pet? \n1) White \n2) Black \n3) Gray \n4) Tan");
    
//saving user input in a variable
    String userAnswer2 = scanner.nextLine();
    int userAnswer2int = Integer.parseInt(userAnswer2);
    scanner.close();//turns off user input  

//---------------------------------------------------------------------  
    String[][][] matrix = {
            new String[][] { //Dog Types
                new String[] {"Snowball", "Fred", "Marshmallow", "Cloud", "Powder"},
                new String[] {"Tar"},
                new String[] {"gray"},
                new String[] {"brown dog"}
            },
            new String[][] { //Cat Types
                new String[] {"Snowball", "Fred", "Marshmallow", "Cloud", "Powder"},
                new String[] {"Tar", "Midnight"},
                new String[] {"gray"},
                new String[] {"brown cat"}
            },
            new String[][] { //Bird Types
                new String[] {"Snowball", "Fred", "Marshmallow", "Cloud", "Powder"},
                new String[] {"Tar"},
                new String[] {"gray"},
                new String[] {"brown bird"}
            }
        };
    
        Random rand = new Random();
        String[] options = matrix[userAnswer1int-1][userAnswer2int-1];
        String finalOption = options[rand.nextInt(options.length)];
        System.out.println("\n You should name your pet " + finalOption + ".");
//--------------------------------------------------------------------
    }
  static void turtle()
  {
    System.out.println("turtle");
  }
}
//new comment