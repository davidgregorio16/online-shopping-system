
// 08/02/2022

package onlinestore;

//import java.util.Arrays;
import java.util.Scanner;
import onlinestore.CategoryMenNewArrivals;

public class Payment {
    
    public static final Scanner scan = new Scanner(System.in);
    
    static void enter(int j) {
        Main.linebreak(3);
        
        System.out.println(" \tPayment method is currently under maintenance.");
        System.out.println("\tPlease try again later.");
        
        Main.linebreak(3);
        back();
        
        //System.out.print("\tPlease enter your payment: Php. ");
        //float payment = scan.nextFloat();
        
        /* NEED SOURCE LEVEL 1.8 OR ABOVE
            Currently working in Java N-IDE Mobile App
            
        String [] temporary = {CategoryMenNewArrivals.items[j][k]};
        int [] price = Arrays.stream(temporary)
            .mapToInt(Integer::parseInt)
            .toArray();
        System.out.println(price[0]);
        
        */
    }
    
    // Temporary method
    static void back() {
        Main.tab(13, 0);
        System.out.println("(1 - Back | 2 - Exit)");
        
        Main.selector();
        byte choice = scan.nextByte();
        switch (choice) {
            case 1:
                CategoryMenNewArrivals.show();
                break;
            case 2:
                System.exit(0);
            default:
                Main.error(0);
                enter(1); // Update this if this method has been fixed
                back();
        }
    }
    
}
