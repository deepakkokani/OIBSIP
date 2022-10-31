//Developed By Deepak Kokani
//ATM Interface

import java.util.*;

class createaccount
{
  String name,dob,userid,password,phoneno;
  
  void create()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n******************Create Account******************");
    System.out.print("Enter Your Full Name : ");
    name = sc.nextLine();
    System.out.print("Enter Your Mobile No : ");
    phoneno = sc.nextLine();
    System.out.print("Enter Your DOB (DD-MM-YYYY) : ");
    dob = sc.nextLine();
    System.out.print("Generate User id     : ");
    userid = sc.nextLine();
    System.out.print("Generate Pin         : ");
    password = sc.nextLine();
    System.out.println("\n**************************************************");
    System.out.println("\nFor log in Enter Choice : 2");
  }
}

class Login extends createaccount
{
  String id,pin;
  double balance=50000;
  void login()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n**********************Log In**********************");
    System.out.print("Enter User Id  : ");
    id = sc.nextLine();
    System.out.print("Enter Pin      : ");
    pin = sc.nextLine();
    System.out.println("\n**************************************************");
    
    if(pin.equals(password) && id.equals(userid))
    {
      System.out.print("Welcome to ATM !!!\n");
      System.out.println("\nFor Deposit Amount   Enter Choice : 3");
      System.out.println("For Withdraw Amount  Enter Choice : 4");
      System.out.println("For Transfer Amount  Enter Choice : 5");
      System.out.println("For Exit             Enter Choice : 6");
    }
    else
    {
      System.out.print("No user found!! Try again\n");
      
    }
  }
}

class deposit extends Login
{
  double deposit_amt;
 
  void deposit()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n******************Deposit Amount******************");
    System.out.print("\nEnter Amount you want to deposit : ");
    deposit_amt = sc.nextDouble();
    balance = balance + deposit_amt;
    System.out.println("Your Money has been successfully deposited");  
    System.out.println("Your Current Balance : "+balance);
    System.out.println("\n**************************************************");
    System.out.println("\nFor Deposit Amount  Enter Choice : 3");
    System.out.println("For Withdraw Amount Enter Choice : 4");
    System.out.println("For Transfer Amount Enter Choice : 5");
    System.out.println("For Exit            Enter Choice : 6");
  }
}

class withdraw extends deposit
{
  double withdraw_amt;
  
  void withdraw()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n*******************Withdraw Amount******************");
    System.out.print("\nEnter Amount you want to withdraw : ");
    withdraw_amt = sc.nextDouble();
    if(withdraw_amt<balance)
    {
      balance = balance - withdraw_amt;
      System.out.println("Your Money has been succeesfully Withdrawn");
      System.out.println("Your Current Balance : "+balance);
      System.out.println("\n**************************************************");
      System.out.println("\nFor Deposit Amount Enter Choice : 3");
      System.out.println("For Withdraw Amount Enter Choice : 4");
      System.out.println("For Transfer Amount Enter Choice : 5");
      System.out.println("For Exit            Enter Choice : 6");
    }
    else
    {
      System.out.println("Insufficient balance");
    }
    
  }
}

class transfer extends withdraw
{
  String acno;
  double moneytransfer;
  
  void transfer()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n*******************Transfer Amount******************");
    System.out.print("Enter account number on which you want to transfer money : ");
    acno = sc.nextLine();
    System.out.print("Enter account you want to transfer money                 : ");
    moneytransfer = sc.nextDouble();
    if(moneytransfer<balance)
    {
      balance = balance - moneytransfer;
      System.out.println("Your Current Balance is "+balance);
      System.out.println("\n**************************************************");
      System.out.println("\nFor Deposit Amount   Enter Choice : 3");
      System.out.println("For Withdraw Amount  Enter Choice : 4");
      System.out.println("For Transfer Amount  Enter Choice : 5");
      System.out.println("For Exit             Enter Choice : 6");
    }
    else
    {
      System.out.println("Insufficient Balance!!!");
    }
  }
}

class AtmInterface
{
  public static void main(String args[])
  {
    int ch = 6;
    Scanner sc = new Scanner(System.in);
    transfer c1 = new transfer();
    System.out.println("\n**********!!! Welcome to ATM Machine! !!**********");
    System.out.println("\n1)Create Account\n2)Log in\n3)Deposit\n4)Withdraw\n5)Transfer\n6)Exit");
    System.out.println("\n**************************************************");
    while(true)
    {
      System.out.print("\nEnter Choice : ");
      ch = sc.nextInt();
      
      switch(ch)
      {
        case 1 : c1.create();
                 break;
        case 2 : c1.login();
                 break;
        case 3 : c1.deposit();
                 break;
        case 4 : c1.withdraw();
                 break;
        case 5 : c1.transfer();
                 break;
        case 6 : System.out.println("\nThank you for using Atm Machine");
                 return;
        default : System.out.println("Wrong Choice!!!");
      }
    }
  }
}
