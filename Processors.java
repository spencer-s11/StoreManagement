import java.util.Scanner;
public class Processors {

public String model;
public int cores;
public int threads;
public String socket;
public String clockSpeed;
public boolean includedCooler;
public double price;
public int stock;


  public static int introContinue() {
  Scanner scanToContinue = new Scanner(System.in); 
    System.out.println("Press 1 to Continue: ");

    int is1 = scanToContinue.nextInt();  
    return is1; 
  }


  public static int menuChoice() {
    Scanner choice = new Scanner(System.in);
    int num = choice.nextInt();
    return num;
  }


  public static int actionChoice() {
    Scanner scanActionChoice = new Scanner(System.in);
      int actionChoiceInt = scanActionChoice.nextInt();
    return actionChoiceInt;
  }


  public double getPrice() {
    return price;
  }

 public static int getNumberChoice() {
   Scanner numberChoiceGetter = new Scanner(System.in);
   int numberChosen = numberChoiceGetter.nextInt();
   return numberChosen;
 }



}