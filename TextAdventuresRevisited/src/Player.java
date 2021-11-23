import java.util.*;

public class Player
{
  //these are just examples of instance variables
  //you can change these if you want to
  String name;
  int money;

  public Player(String playerName, int starting)
  {
    name = playerName;
    money = starting;
  }

  public String getName()
  {
    return name;
  }

  public void changeName(String newName)
  {
    name = newName;
  }


  public int getMoney()
  {
    return money;
  }

  public void setMoney(int newAmount)
  {
    money = newAmount;
  }
}