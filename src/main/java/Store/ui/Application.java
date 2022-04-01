package Store.ui;

import Store.Selection;
import Store.ui.UserInput;
import Store.ui.UserOutput;

import java.nio.channels.Selector;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Application application = new Application();
        UserInput.getSelectionHomeScreen();
    }

    //drink, candy, chips ------names and prices
    //menu to sho options
    public void run(){
        UserOutput.welcomeDisplay();

        while(true){
            String userOption = UserInput.getSelectionHomeScreen();

            if(userOption.equalsIgnoreCase("1")){
                Selection selection = new Selection();
            } else if (userOption.equalsIgnoreCase("2")){
                //ring them up
            } else if(userOption.equalsIgnoreCase("3")){
                break;
            }
        }
    }
}
