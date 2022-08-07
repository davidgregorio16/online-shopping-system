
// 08/01/2022

package onlinestore;

import java.util.Scanner;

public class CategoryMen {
    
    public static final Scanner scan = new Scanner(System.in);
    
    static void show() {
        Main.linebreak(3);
        
        Main.tab(15, 3);
        Main.title("< MEN >");
        
        String [] options = {
            "1 - New Arrivals",
            "2 - Brands",
            "3 - Clothing",
            "4 - Shoes",
            "5 - Accessories",
            "6 - Bags",
            "7 - Sports",
            "8 - Grooming",
            "9 - Modest Wear",
            "10 - Premium",
            "11 - Back",
            "12 - Exit",
        };
        
        for (int i = 0; i < options.length; i++) {
            System.out.println("\t" + options[i]);
        };
        
        Main.linebreak(3);
        
        Main.selector();
        byte choice = scan.nextByte();
        switch (choice) {
            case 1:
                CategoryMenNewArrivals.show();
                break;
            case 2:
                CategoryMenBrands.show();
                break;
            case 3:
                //CategoryMenClothing.show();
                break;
            case 4:
                //CategoryMenShoes.show();
                break;
            case 5:
                //CategoryMenAccessories.show();
                break;
            case 6:
                //CategoryMenBags.show();
                break;
            case 7:
                //CategoryMenSports.show();
                break;
            case 8:
                //CategoryMenGrooming.show();
                break;
            case 9:
                //CategoryMenModestWear.show();
                break;
            case 10:
                //CategoryMenPremium.show();
                break;
            case 11:
                Category.show();
                break;
            case 12:
                System.exit(0);
            default:
                Main.error(0);
                show();
        }
    }
    
}
