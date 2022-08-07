
// 08/01/2022

package onlinestore;

import java.util.Scanner;
    
public class MainMenu {
    
    public static final Scanner scan = new Scanner(System.in);
    
    static void show() {
        Main.linebreak(3);
        
        Main.tab(11, 1);
        Main.title("< UNDERWORLD TRENDS >");
        
        String [] options = {
            "1 - Home",
            "2 - Category",
            "3 - Cart",
            "4 - Wishlist",
            "5 - Account",
            "6 - Exit"
        };
        
        for (int i = 0; i < options.length; i++) {
            System.out.println("\t" + options[i]);
        }
        
        Main.linebreak(3);
        
        Main.selector();
        byte choice = scan.nextByte();
        switch (choice) {
            case 1:
                Main.clearConsole();
                home();
                break;
            case 2:
                category();
                break;
            case 3:
                //cart();
                break;
            case 4:
                //wishlist();
                break;
            case 5:
                //account();
                break;
            case 6:
                System.exit(0);
            default:
                Main.error(0);
                show();
        }
    }
    
    static void home() {
        Home.show();
    }
    
    static void category() {
        Category.show();
    }
    
//    static void cart() {
//        Cart.show();
//    }
    
//    static void wishlist() {
//        Wishlist.show();
//    }
    
//    static void account() {
//        Account.show();
//    }
     
}
