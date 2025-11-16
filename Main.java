import java.util.Scanner;

public class Main {

   public static void main(String[] args ){
      Scanner dogo = new Scanner(System.in);

    int numDogs = 5;
    String nameOfUser = "Billy Bob Johnson 67 ";
    double rectWidth = 6.67;
    double rectHeight = 7.66667;
    char firstLetter = 'B';
    Boolean doorIsOpen = false; 

    System.out.println(rectHeight);

    String isThisInterresting; 
    boolean answer = false;
    
    do {
    System.out.print("Hello, do you find this interresting?: (Yes Or No) ");
    isThisInterresting = dogo.nextLine();

    switch(isThisInterresting.toUpperCase()){
      case "YES" -> {System.out.println("im glad that you find this interresting"); 
      answer = true;}
      case "YE" -> {System.out.println("im glad that you find this interresting");
      answer = true;}
      case "Y" -> {System.out.println("im glad that you find this interresting");
      answer = true;}
      case "NO" -> {System.out.println("Im sorry that you don't find this interresting");
      answer = true;}
      case "N" -> {System.out.println("Im sorry that you don't find this interresting");
      answer = true;}
      default -> System.out.println("Im sorry you did not give an answer, type Yes or No: ");

    }
   }while (answer == false);


    dogo.close();

  

   }
  

}
