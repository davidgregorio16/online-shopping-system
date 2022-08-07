
// 08/02/2022

package onlinestore;

import java.util.Scanner;
import onlinestore.CategoryMen;

public class CategoryMenNewArrivals {
    
    public static final Scanner scan = new Scanner(System.in);
    public static String [][] newArrivalItems = new String[MainItems.show.length][3];
    public static int numbering = 0; // For back option
    
    static void show() {
        Main.linebreak(3);
        
        Main.tab(13, 1);
        Main.title("< NEW ARRIVALS >");
        
        for (int i = 0; i < 10; i += 2) {
            MainItems.show[i][1][3] = "NewArrivals";
        }
        int index = 0;
        for (int i = 0; i < MainItems.show.length; i++) {
            if (MainItems.show[i][1][3].equals("NewArrivals")) {
                for (int j = 0; j < MainItems.show[i].length; j++) {
                    newArrivalItems[index][j] = MainItems.show[i][0][j];
                }
                ++index;
            }
        }
        
        int numberOf = 0;
        for (int i = 0; i < MainItems.show.length; i++) {
            if (MainItems.show[i][1][3].equals("NewArrivals")) {
                ++numberOf;
            }
        }
        System.out.println("\t " + numberOf + " Items found\n");
        
        for (int i = 0; i < MainItems.show.length; i++) {
            
            if (MainItems.show[i][1][3].equals("NewArrivals")) {
                ++numbering;
                System.out.print("\t" + numbering + " - Php. ");
                
                for (int j = 0; j < MainItems.show[i].length; j++) {
                    System.out.print(MainItems.show[i][0][j] + " ");
                }
                System.out.println("\n");
            }
        }
        
        Main.linebreak(2);
        
        backOption();
        
        Main.selector();
        int choice = scan.nextInt();
        if (choice == (numbering + 1)) {
            numbering = 0;
            CategoryMen.show();
        } else if (choice == (numbering + 2)) {
            System.exit(0);
        } else {
            for (int i = 0; i < numbering; i++) {
                if (i == (choice - 1)) {
                    numbering = 0;
                    Main.buy(newArrivalItems, i);
                }
            }
        }
        
        numbering = 0;
        Main.error(0);
        show();
    }
    
    static void backOption() {
        Main.tab(12, 2);
        System.out.println("(" + (numbering + 1) + " - Back | " + (numbering + 2) + " - Exit)");
    }
    
}
