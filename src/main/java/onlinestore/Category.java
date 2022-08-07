
// 08/01/2022

package onlinestore;

import java.util.Scanner;

public class Category {
    
    public static final Scanner scan = new Scanner(System.in);
    
    static void show() {
        Main.linebreak(3);
        
        Main.tab(14, 2);
        Main.title("< CATEGORY >");
        
        String[] options = {
            "1 - Men",
            "2 - Women",
            "3 - Sports",
            "4 - Luxury",
            "5 - Kids",
            "6 - Beauty",
            "7 - Home & Lifestyle",
            "8 - Back",
            "9 - Exit",
        };
        
        for (int i = 0; i < options.length; i++) {
            System.out.println("\t" + options[i]);
        }
        
        Main.linebreak(3);
        
        Main.selector();
        byte choice = scan.nextByte();
        switch (choice) {
            case 1:
                CategoryMen.show();
                break;
            case 2:
                //CategoryWomen.show();
                break;
            case 3:
                //CategorySports.show();
                break;
            case 4:
                //CategoryLuxury.show();
                break;
            case 5:
                //CategoryKids.show();
                break;
            case 6:
                //CategoryBeauty.show();
                break;
            case 7:
                //CategoryHomeAndLifestyle.show();
                break;
            case 8:
                MainMenu.show();
                break;
            case 9:
                System.exit(0);
            default:
                Main.error(0);
                show();
        }
    }
    
}
