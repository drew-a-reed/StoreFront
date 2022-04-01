package Store;

import Store.candy.Candy;
import Store.chips.Chips;
import Store.drinks.Drinks;

import java.util.Locale;
import java.util.Scanner;

public class Selection {
    private static Scanner input = new Scanner(System.in);

    private static String selectionScreen(){
            System.out.print("What are you in the mood for? ");
            System.out.print("1) Drinks ");
            System.out.print("2) Candy ");
            System.out.print("3) Chips ");
            System.out.print("4) Back ");
        return input.nextLine().trim().toLowerCase();
    }

    public static Scanner getInput() {
        return input;
    }
    public static void setInput(Scanner input) {
        Selection.input = input;
    }

    public static void showChoices(String userChoice){
          while(!userChoice.equals("4")){

              switch (userChoice){
                  case "1":
                  case "drinks":
                  case "d":
                      Drinks.createDrinksList();
                      break;
                  case "2":
                  case "candy":
                  case "c":
                      Candy.createCandyList();
                      break;
                  case "3":
                  case "chips":
                      Chips.createChipsList();
                      break;
                  case "4":
                  case "back":
                  case "b":
                      break;
          }
      }
}


}
