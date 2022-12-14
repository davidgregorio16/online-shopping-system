
// 08/01/2022

package onlinestore;

import java.util.Scanner;

public class Home {
    
    public static final Scanner scan = new Scanner(System.in);
    
    static void show() {
        Main.linebreak(3);
        
        Main.tab(15, 2);
        Main.title("< HOME >");
        
        String [] itemOne = {
        "▒▒▒▒▒▒█▓▓█▒██▓▓▓██▒█▓▓█",
        "▒▒▒▒▒█▓▒▒▓█▓▓▓▓▓▓▓█▓▒▒▓█",
        "▒▒▒▒▒█▓▒▒▓▓▓▓▓▓▓▓▓▓▓▒▒▓█",
        "▒▒▒▒▒▒█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█",
        "▒▒▒▒▒▒▒█▓▓▓▓▓▓▓▓▓▓▓▓▓█",
        "▒▒▒▒▒▒▒█▓▓█▓▓▓▓▓▓█▓▓▓█",
        "▒▒▒▒▒▒▒█▓▓██▓▓▓▓▓██▓▓█",
        "▒▒▒▒▒▒█▓▓▓▓▒▒█▓█▒▒▓▓▓▓█",
        "▒▒▒▒▒█▓▓▒▒▓▒▒███▒▒▓▒▒▓▓█",
        "▒▒▒▒▒█▓▓▒▒▓▒▒▒█▒▒▒▓▒▒▓▓█",
        "▒▒▒▒▒█▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓█",
        "▒▒▒▒▒▒█▓▓▓▓▓▓███▓▓▓▓▓▓█",
        "▒▒▒▒▒▒▒█▓▓▓▓▓▓▓▓▓▓▓▓▓█",
        "▒▒▒▒▒▒█▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓█",
        "▒▒▒▒▒█▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓█",
        "▒▒▒▒█▓▓▓█▓▒▒▒▒▒▒▒▒▒▓█▓▓▓█",
        "▒▒██▓▓▓█▓▒▒▒██▒██▒▒▒▓█▓▓▓██",
        "▒█▓▓▓▓█▓▒▒▒▒█▓█▓█▒▒▒▓█▓▓▓▓█",
        "█▓██▓▓█▓▒▒▒▒█▒▓▒█▒▒▒▒▓█▓▓██▓█",
        "█▓▓▓▓█▓▓▒▒▒▒█▓▒▓█▒▒▒▒▓▓█▓▓▓▓█",
        "▒█▓▓▓█▓▓▒▒▒▒▒█▒█▒▒▒▒▒▓▓█▓▓▓█",
        "▒▒████▓▓▒▒▒▒▒▒█▒▒▒▒▒▒▓▓████",
        "▒▒▒▒▒█▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓█",
        "▒▒▒▒▒▒█▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓█",
        "▒▒▒▒▒▒█▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓█",
        "▒▒▒▒▒▒▒█▓▓▓▓▓█▓█▓▓▓▓▓█",
        "▒▒▒▒▒▒▒▒█▓▓▓▓▓█▓▓▓▓▓█",
        "▒▒▒▒▒████▓▓▓▓▓█▓▓▓▓▓████",
        "▒▒▒▒█▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓█",
        "",
        "⬆⬆⬆ Php. 100.00 (SALE! 50% OFF) ⬆⬆⬆" // Index 30 (31 lines)
        };
        for (int i = 0; i < itemOne.length; i++) {
            if (i == 30) {
                Main.tab(8, 2);
                System.out.println(itemOne[i]);
                continue;
            }
            Main.tab(4, 2);
            System.out.println(itemOne[i]);
        }
        
        Main.nextline(1);
        
        String [] itemTwo = {
            "████████████████████████████████████████",
            "██████▓███████████████████████████████▓▓",
            "████▓─██████████████████████████▓▒▒─▒▒▓█",
            "███▓─▓█████████████████████▓▒────▒▓█████",
            "██▓──▓██████████████▓▓▒──────▒▓█████████",
            "█▓────████████▓▒▒────────▒██████████████",
            "█────────────────────▓██████████████████",
            "█───────────────▒▓██████████████████████",
            "█▓──────────▒▓██████████████████████████",
            "███▓▒▒▒▓▓███████████████████████████████"
        };
        for (int i = 0; i < itemTwo.length; i++) {
            //Main.tab(1, 0);
            System.out.println(itemTwo[i]);
        }
        
        Main.linebreak(3);
        back();
    }
    
    static void back() {
        Main.tab(13, 0);
        System.out.println("(1 - Back | 2 - Exit)");
        
        Main.selector();
        byte choice = scan.nextByte();
        switch (choice) {
            case 1:
                MainMenu.show();
                break;
            case 2:
                System.exit(0);
            default:
                Main.error(0);
                show();
                back();
        }
    }
    
}
