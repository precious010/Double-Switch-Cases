import java.util.Scanner;
import java.io.*;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a valid integer");
    double num = input.nextDouble();

    switch(Double.toString(num)){
      case "1.0":
       System.out.println("Y");
       break;
       default:
       System.out.println("n");
    }

    
    
    
    System.out.println("Hello world!");
  }
}