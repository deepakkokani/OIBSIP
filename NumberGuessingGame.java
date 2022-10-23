//Developed By - Deepak Kokani

import java.util.Random;
import java.util.*;

class Game
{
  int number;

  void PlayGame()
  {
    int userinput,count=0,life=5,lives=5,s=20;
    Random rand = new Random();
    number = rand.nextInt(100);
    Scanner sc = new Scanner(System.in);
   
    for(int i=1;i<=life;i++)
    {
      System.out.print("\nEnter any number between 1 and 100 : ");
      userinput = sc.nextInt();
      count++;
      
      if(userinput>100)
      {
        System.out.println("Number is not between 1 and 100");
        System.out.println("Again start the game");
        System.out.println("\nDo you want to play game again ? If Yes then Enter Choice : 1");
        System.out.println("DO you want to see the rules ?   If Yes then Enter Choice : 2");
        System.out.println("Do you want to Exit the Game ?   If Yes then Enter Choice : 3");
        break;
      }
      else if(userinput==number)
      {
        s = s * count;
        System.out.println("\n******************************************");
        System.out.println("* Result :                               *");
        System.out.println("* Congratulations!! You Win!! Hurrehhh!! *");
        System.out.println("* Your Try Count : "+count+"                     *");
        System.out.println("* Your Score : "+s+" %                      *");
        System.out.println("******************************************");
        System.out.println("\nDo you want to play game again ? If Yes then Enter Choice : 1");
        System.out.println("DO you want to see the rules ?   If Yes then Enter Choice : 2");
        System.out.println("Do you want to Exit the Game ?   If Yes then Enter Choice : 3");
        break;
      }
      else if(userinput>number)
      {
        System.out.println("The number you guess is higher. Guess Again");
        lives = lives-1;
        System.out.println("Lives Remaining : "+lives);
      }
      else if(userinput<number)
      {
        System.out.println("The number you guess is smaller. Guess Again");
        lives = lives-1;
        System.out.println("Lives Remaining : "+lives);
      }
      if(i==life && userinput!=number)
      {
        System.out.println("\nYour 5 attempts are Over");
        System.out.println("\n*******************************");
        System.out.println("* Result :                    *");
        System.out.println("* You Lose!!                  *");
        System.out.println("* Your Score : "+"00 %           *");
        System.out.println("* The number was " +number+"           *");
        System.out.println("*******************************");
        System.out.println("\nDo you want to play game again ? If Yes then Enter Choice : 1");
        System.out.println("DO you want to see the rules ?   If Yes then Enter Choice : 2");
        System.out.println("Do you want to Exit the Game ?   If Yes then Enter Choice : 3");
      }
    }
  }
  
  void Rules()
  {
    System.out.println("\nRules : ");
    System.out.println("1) The number should be between given range.");
    System.out.println("2) The Game will end afters 5 attempts.");
    System.out.println("3) If Player Failed to guess a number then he/she loose the game.");
    System.out.println("4) There is 20 points for per count");
    System.out.println("\nDo you want to play game ?       If Yes then Enter Choice : 1");
    System.out.println("Do you want to Exit the Game ?   If Yes then Enter Choice : 3");
  } 
}

class NumberGuessingGame
{
  public static void main(String args[])
  {
    int ch=4;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n********************Number Guessing Game********************");
    System.out.println("1.Play Game\n2.View Rules\n3.Exit");
    System.out.println("************************************************************");
    Game g1 = new Game();
    
    while(true)
    {
      System.out.print("\nEnter Choice : ");
      ch = sc.nextInt();
      switch(ch)
      {
        case 1 : g1.PlayGame();
                 break;
        case 2 : g1.Rules();
                 break;
        case 3 : System.out.println("\nThank You for Playing Game. Hoped you liked it...");
                 System.out.println("************************************************************");
                 return;
        default : System.out.println("Invalid Choice!!!"); 
      }
    }
  }
}