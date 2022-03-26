package Store.ui;

import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);

    public static String getSelectionHomeScreen(){

        System.out.println();
        System.out.println("      What would you like to do today?      ");
        System.out.println("--------------------------------------------");
        System.out.println("            (1) Make Selection              ");
        System.out.println("            (2) Purchase                    ");
        System.out.println("            (3) Leave                       ");

        return input.nextLine();
    }

}
