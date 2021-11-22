import java.util.*;

public class TextAdventure 
{
  //Instance variables of a class can also be objects
  FancyConsole console;
  Scanner inScanner;
  Player ourHero; 

  public TextAdventure()
  {
    //This creates the UI console that the user
    //can type in
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    //feel free to change the player's starting values
    //depending on your story
    ourHero = new Player("Bob", 100, 0);
  }

  public void play()
  {
    String input;
    //Start of adventure. You can change this if you like
    //You can also import your own images!
    console.setImage("distantcity.jpg");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
    // ADD CODE HERE
    
    // describe the starting situation. Feel free to change this as well
    System.out.println("You wake up to find yourself with a broken Windows installation. \nThe latest update . \nWhat would you like to do? \ncity: go towards the city\nforest: turn around and re-enter the forest\nnap: go back to sleep\n" + ourHero.getName() + ": ");

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE

  }

  private void enterZone1()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  //You can also add other methods here if it 
  //serves your story to do so - it's up to you
  //how creative you want to get

  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}