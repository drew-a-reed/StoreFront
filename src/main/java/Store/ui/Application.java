package Store.ui;

import Store.ui.UserInput;
import Store.ui.UserOutput;

public class Application {

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

//        private void showSelection(){
//            this
//        }
    }
}