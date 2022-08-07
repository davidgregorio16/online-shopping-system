
// 08/03/2022

package onlinestore;

import java.util.Scanner;

public class CategoryMenBrands {
    
    public static final Scanner scan = new Scanner(System.in);
    
    public static String [] brands = {
            "Abrecrombie & Fitch",
            "Academie",
            "ACCEL",
            "Ace",
            "Acefree",
            "Acqua Di Parma",
            "ADIDAS",
            "Aeropostale",
            "Aesop",
            "A Fish Named Fred",
            "Agadir Argan Oil",
            "agnès b.",
            "Agrado",
            "Ahava",
            "Aigle",
            "ALADDIN",
            "ALBA PHILIPPINES",
            "ALBERTO",
            "ALDO",
            "AlfaParf",
            "Alfred Dunhill",
            "Alfredulla",
            "Allstar",
            "American Crew",
            "American Eagle",
            "American Tourister",
            "Anello",
            "ANOMEO"
        };
    
    static void show() {
        Main.linebreak(3);
        
        Main.tab(15, 0);
        Main.title("< BRANDS >");
        
        for (int i = 0; i < brands.length; i++) {
            System.out.println("\t" + (i + 1) + " - " + brands[i]);
        }
        
        Main.linebreak(3);
        
        backOption();
        
        Main.selector();
        int choice = scan.nextInt();
        if (choice == (brands.length + 1)) {
            CategoryMen.show();
        } else if (choice == (brands.length + 2)) {
            System.exit(0);
        }
        for (int i = 1; i <= brands.length; i++) {
            if (i == choice) {
                Main.search(brands, (i - 1));
                // Remove this if search method has been added
                error();
            }
        }
        Main.error(0);
        show();
    }
    
    static void backOption() {
        Main.tab(12, 1);
        System.out.println("(" + (brands.length + 1) + " - Back | " + (brands.length + 2) + " - Exit)");
    }
    
    // Delete this if search has been fixed
    static void error() {
        Main.selector();
        byte choice = scan.nextByte();
        switch (choice) {
            case 1:
                show();
            case 2:
                System.exit(0);
            default:
                Main.error(2);
                Main.tab(13, 0);
                System.out.println("(1 - Back | 2 - Exit)");
                error();
        }
    }
    
}
