package Store.ui;

import Store.ui.UserInput;
import Store.ui.UserOutput;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Application application = new Application();

    }

    //drink, candy, chips ------names and prices
    //menu to sho options
    public void run(){
        UserOutput.welcomeDisplay();

        while(true){
            String userOption = UserInput.getSelectionHomeScreen();

            if(userOption.equalsIgnoreCase("1")){
                //showSelection();
            } else if (userOption.equalsIgnoreCase("2")){
                //ring them up
            } else if(userOption.equalsIgnoreCase("3")){
                break;
            }
        }

         /* private void showSelection(){
            while(true) {
                System.out.print("What are you in the mood for? ");
                System.out.print("1) Drinks ");
                System.out.print("2) Candy ");
                System.out.print("3) Chips ");
                System.out.print("4) Back ");
                String choice = ;
            }
            return
          }*/
    }
}
