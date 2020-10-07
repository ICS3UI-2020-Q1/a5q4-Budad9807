import java.util.Scanner;
/**
 *A program that will ask the user how much they want to invest with a interest rate
 * @author David
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a variable that means there balance
    double bal = 900.50;
    double rate = 0.10;
    int years = 5;
    // Now from there balance,rate and how many years they want to invest
    for(int i = 1;i <= 5; i= i+1 ){
     // you have now find the interest
     double interest = bal * rate;
     // from here you have to find the final balance
     bal = bal + interest;
    }
    // now you have add the final balance + bal
    System.out.println("Your final balance" + bal);
  }

    
  }

