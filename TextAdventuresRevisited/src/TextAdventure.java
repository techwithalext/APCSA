import java.util.*;
import java.util.concurrent.TimeUnit;

public class TextAdventure {
  //Instance variables of a class can also be objects
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;
  int moneyLost = (int)(Math.random() * 1000) + 100;

  public TextAdventure() {
    //This creates the UI console that the user
    //can type in
    console = new FancyConsole("Great Text Adventure!", 1000, 1000);
    inScanner = new Scanner(System.in);

    //feel free to change the player's starting values
    //depending on your story
    ourHero = new Player("Bob", 100000);
  }

  public void play() {
    String input;
    //Start of adventure. You can change this if you like
    //You can also import your own images!
    console.setImage("distantcity.jpg");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
    // ADD CODE HERE
    ourHero.changeName(input);
    serverDesktop();
  }
  public void serverDesktop() {
    String input;
    console.setImage("bsod.jpg");
    // describe the starting situation. Feel free to change this as well
    System.out.println("\n" + ourHero.getName() + " wakes up with $" + ourHero.getMoney() + " to a broken Windows installation due to an automatic update.");
    System.out.println("You are extremely frustrated because you just lost all of your work for the day, which caused you to loose $" + moneyLost + ".");
    System.out.println("This frustration caused you to switch to Linux because you are sick of Windows, and you want more control.");
    System.out.println("Lets ask a few questions to find the best distro for you.");
    System.out.println("Is this for desktop or server use?");
    System.out.println("\n - 1). Desktop \n - 2). Server\n(1/2): ");

    //taking away the money you lost
    ourHero.setMoney(ourHero.getMoney() - moneyLost);

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    input = inScanner.nextLine();
    input = input.toLowerCase();
    if (input.equals("1")) desktopExperience();
    else if (input.equals("2")) serverExperience();
    else serverDesktop();
  }

  private void desktopExperience() {
    String input;
    // change image
    console.setImage("desktopExperience.jpg");
    // describe the area/situation to the user.
    // Give them options for choices.
    System.out.println("\n" + ourHero.getName() + ", what is your experience level with Linux and computers?");
    System.out.println("\n - 1). Newbie \n - 2). Moderate\n - 3). Expert\n(1/2/3): ");

    input = inScanner.nextLine();
    input = input.toLowerCase();

    // Take action or go to another zone based on their choice
    if (input.equals("1")) desktopNewbie();
    else if (input.equals("2")) desktopModerate();
    else if (input.equals("3")) desktopExpert();
    else desktopExperience();
  }

  private void serverExperience() {
    String input;
    // change image
    console.setImage("serverExperience.jpg");
    // describe the area/situation to the user.
    // Give them options for choices.
    System.out.println("\n" + ourHero.getName() + ", what is your experience level with Linux servers?");
    System.out.println("\n - 1). Newbie \n - 2). Moderate\n - 3). Expert\n(1/2/3): ");

    input = inScanner.nextLine();
    input = input.toLowerCase();

    // Take action or go to another zone based on their choice
    if (input.equals("1")) serverNewbie();
    else if (input.equals("2")) serverModerate();
    else if (input.equals("3")) serverExpert();
    else serverExperience();


  }

  private void desktopNewbie() {
    String input;
    // change image
    console.setImage("desktopNewbie.jpg");
    // describe the area/situation to the user.
    // Give them options for choices.
    System.out.println("\n" + ourHero.getName() + ", do you prefer desktop environments similar to MacOS or Windows?");
    System.out.println("\n - 1). MacOS \n - 2). Windows\n(1/2): ");


    input = inScanner.nextLine();
    input = input.toLowerCase();

    // Take action or go to another zone based on their choice
    if (input.equals("1")) macDE();
    else if (input.equals("2")) windowsDE();
    else desktopNewbie();

  }

  private void desktopModerate() {
    String input;
    // change image
    console.setImage("desktopModerate.png");
    // describe the area/situation to the user.
    // Give them options for choices.
    System.out.println("\n" + ourHero.getName() + ", what is the intended use case?");
    System.out.println("\n - 1). Typical usage \n - 2). Multimedia production\n  - 3). Media center\n - 4). Cloud OS\n - 5). Security/hacking\n - 6). Development\n(1/2/3/4/5/6): ");

    input = inScanner.nextLine();
    input = input.toLowerCase();

    // Take action or go to another zone based on their choice
    if (input.equals("1")) typicalUsage();
    else if (input.equals("2")) multimediaProduction();
    else if (input.equals("3")) mediaCenter();
    else if (input.equals("4")) cloudOS();
    else if (input.equals("5")) securityHacking();
    else if (input.equals("6")) development();
    else desktopModerate();
  }

  private void desktopExpert() {
    String input;
    // change image
    console.setImage("desktopExpert.png");
    // describe the area/situation to the user.
    // Give them options for choices.
    System.out.println("\n" + ourHero.getName() + ", what is the intended use case?");
    System.out.println("\n - 1). Bleeding Edge \n - 2). Stable\n(1/2): ");

    input = inScanner.nextLine();
    input = input.toLowerCase();

    // Take action or go to another zone based on their choice
    if (input.equals("1")) bleedingEdge();
    else if (input.equals("2")) stable();
    else desktopExpert();
  }

  private void serverNewbie() {
    // change image
    console.setImage("serverNewbie.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Raspbian Lite\nb). Ubuntu Server\nc).Debian");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void serverModerate() {
    String input;
    // change image
    console.setImage("serverModerate.jpg");
    // describe the area/situation to the user.
    // Give them options for choices.
    System.out.println("\n" + ourHero.getName() + ", free or paid?");
    System.out.println("\n - 1). Free\n - 2). Paid\n(1/2): ");

    input = inScanner.nextLine();
    input = input.toLowerCase();

    // Take action or go to another zone based on their choice
    if (input.equals("1")) serverFree();
    else if (input.equals("2")) serverPaid();
    else serverModerate();
  }
  private void serverExpert() {
    String input;
    // change image
    console.setImage("serverExpert.jpg");
    // describe the area/situation to the user.
    // Give them options for choices.
    System.out.println("\n" + ourHero.getName() + ", SMB or Enterprise?");
    System.out.println("\n - 1). SMB\n - 2). Enterprise\n(1/2): ");

    input = inScanner.nextLine();
    input = input.toLowerCase();

    // Take action or go to another zone based on their choice
    if (input.equals("1")) serverSMB();
    else if (input.equals("2")) serverEnterprise();
    else serverExpert();
  }
  private void macDE() {
    // change image
    console.setImage("macDE.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Pop_OS!\nb). Ubuntu\nc). Fedora Workstation");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }

  private void windowsDE() {
    // change image
    console.setImage("windowsDE.jpg");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Kubuntu\nb). Linux Mint\nc). Fedora KDE\nd). Raspbian\ne). Xubuntu");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }

  private void typicalUsage() {
    // change image
    console.setImage("typicalUsage.jpg");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Fedora Workstation\nb). Manjaro\nc). Pop_OS!\nd). Ubuntu");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void multimediaProduction() {
    // change image
    console.setImage("multimediaProduction.jpg");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Ubuntu Studio\nb). AV Linux\nc). Dream Studio\n");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void mediaCenter() {
    // change image
    console.setImage("mediaCenter.jpg");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Ubuntu\nb). OSMC\nc). OpenELEC\nd). RetroPie");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void cloudOS() {
    // change image
    console.setImage("cloudOS.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Chromium OS\n");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void securityHacking() {
    // change image
    console.setImage("securityHacking.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Kali Linux\nb). Tails\n");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void development() {
    // change image
    console.setImage("development.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Arch Linux\nb). Manjaro\nc). Fedora Workstation\nd). Pop_OS!\n");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void bleedingEdge() {
    // change image
    console.setImage("bleedingEdge.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Arch Linux\nb). Manjaro\nc). Gentoo (if you hate yourself)\n");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void stable() {
    // change image
    console.setImage("stable.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Manjaro (stable release)\nb). Fedora Workstation\nc). Debian\n");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void serverFree() {
    // change image
    console.setImage("serverFree.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Ubuntu Server\nb). Fedora Server\nc). Debian\nd). Alpine Linux\n");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void serverPaid() {
    // change image
    console.setImage("serverPaid.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Red Hat Enterprise Linux\n");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void serverSMB() {
    // change image
    console.setImage("serverSMB.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Ubuntu Server\nb). Debian\n");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void serverEnterprise() {
    // change image
    console.setImage("serverEnterprise.png");
    System.out.println("\nThese distros seem like a great choice for you!");
    System.out.println("a). Red Hat Enterprise Linux\nb). Ubuntu Server\nc). Fedora Server\nd). openSUSE\n");
    //brings you to the zone for the end of the game, because this is the final result of the distro selection
    gameEnd();
  }
  private void gameEnd() {
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    String input;
    console.setImage("gameEnd.jpg");
    System.out.println("\nThanks for playing! Would you like to play again?");
    System.out.println("\n - 1). Yes (restart)\n - 2). No (quit)\n - 3). Gamble\n(y/n/g): ");
    input = inScanner.nextLine();
    input = input.toLowerCase();

    // Take action or go to another zone based on their choice
    if (input.equals("yes") || input.equals("y") || input.equals("1")) play();
    else if (input.equals("no") || input.equals("n") || input.equals("2")) quit();
    else if (input.equals("gamble") || input.equals("g") || input.equals("3")) casino();
    else gameEnd();
    inScanner.close();
  }
  private void casino() {
    String input;
    console.setImage("gamble.jpg");
    System.out.println("Welcome to the Linux Casino!\n Would you like to gamble?");
    System.out.println("\n - 1). Yes\n - 2). No\n(y/n): ");
    input = inScanner.nextLine();
    input = input.toLowerCase();
    if (input.equals("yes") || input.equals("y") || input.equals("1")) gamble();
    else if (input.equals("no") || input.equals("n") || input.equals("2")) gameEnd();
    else casino();
  }
  private void gamble() {
    //if you didn't lose the minimum amount of money at the start, you gamble the normal amount
    if (ourHero.getMoney() != ourHero.getMoney() - 100) {

      // generates the amount of money "on the line"
      int moneyGambled = (int)(Math.random() * (5000 - 0 + 1) + 0);

      // "flips a coin" to decide if you should win or loose money
      int loseOrGain = (int)(Math.random() * (1 - 0 + 1) + 0);

      //if you win money, it gives you the money and prints how much you won
      if (loseOrGain == 0) {
        ourHero.setMoney(ourHero.getMoney() + moneyGambled);
        System.out.println("You won $" + moneyGambled + "!");
      }

      //if you loose money, it takes the money and prints how much you lost
      if (loseOrGain != 0) {
        ourHero.setMoney(ourHero.getMoney() - moneyGambled);
        System.out.println("You lost $" + moneyGambled + ". :(");
      }
    }
    //if you lost the minimum amount of money at the start you lose all of your money because you were too lucky
    else if (ourHero.getMoney() == ourHero.getMoney() - 100) {
      ourHero.setMoney(ourHero.getMoney() / 2);
      System.out.println("You lost half of your money, because you were too lucky and lost the minimum amount of money at the start.");
    }

    //prints how much money you have left after the gambling fiasco
    System.out.println("You now have $" + ourHero.getMoney());

    //returns to the gameEnd zone
    gameEnd();
  }
  private void quit() {
    //quits the program
    System.exit(0);
  }
}