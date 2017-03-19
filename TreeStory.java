//Use command clear && javac TreeStory.java && java TreeStory
import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
         
      //__Name__is a __ adjective__ __noun__. They are always __adverb__ __verb__.
     String ageAsString = console.readLine("How old are you?  ");
      int age = Integer.parseInt(ageAsString);
    //Ask age. gtfo if under 13
      if (age < 13) {
       //Exit code
        console.printf("Sorry you must be at least 13 to use this program.\n");
        System.exit(0);
      }
      //Ask the questions & do while loop
      String name = console.readLine("Enter a name:  ");
String adjective = console.readLine("Enter an adjective:  ");
      String noun;
      boolean isInvalididWord;
      do {
   noun = console.readLine("Enter a noun:  ");
        isInvalididWord = (noun.equalsIgnoreCase("dork") ||
                                   noun.equalsIgnoreCase("jerk") ||
                                   noun.equalsIgnoreCase("nerd"));
        if (isInvalididWord){
          console.printf("That language is not allowed. Try again. \n\n");
        }
      } while(isInvalididWord);
String adverb = console.readLine("Enter an adverb:  ");
String verb = console.readLine("Enter a verb ending with -ing:  ");
      //The story
      console.printf("Your TreeStory: \n---------------------\n");
      console.printf("%s is a %s %s. ",name, adjective, noun);   
      console.printf("They are always %s %s. \n", adverb, verb); 
      
    }
    
}
