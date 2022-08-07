
// 08/01/2022

package onlinestore;

import java.util.Scanner;
import onlinestore.CategoryMenNewArrivals;

public class Main {
    
    public static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String [] message = {
            "",
            "█░█░█ █▀▀ █░░ █▀▀ █▀█ █▀▄▀█ █▀▀",
            "▀▄▀▄▀ ██▄ █▄▄ █▄▄ █▄█ █░▀░█ ██▄",
        };
        
        for (int i = 0; i < message.length; i++) {
            tab(2, 1);
                System.out.println(message[i]);
        }
        
        MainMenu.show();
        
    }
    
    static void title(String title) {
        System.out.println(title + "\n");
    }
    
    static void selector() {
        System.out.print("\t> ");
    }
    
    static void nextline(int nextlineNumber) {
        String nextline = new String(new char[nextlineNumber]).replace("\0", "\n");
        System.out.print(nextline);
    }
    
    static void tab(int tabNumber, int whitespaceNumber) {
        String tab = new String(new char[tabNumber]).replace("\0", "\t");
        String whitespace = new String(new char[whitespaceNumber]).replace("\0", " ");
        System.out.print(tab + whitespace);
    }
    
    static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    static void linebreak(int option) {
        String equalSign = new String(new char[79]).replace("\0", "=");
        switch (option) {
            case 0:
                System.out.print(equalSign);
                break;
            case 1:
                System.out.print("\n" + equalSign);
                break;
            case 2:
                System.out.print(equalSign + "\n\n");
                break;
            case 3:
                System.out.print("\n" + equalSign + "\n\n");
                break;
        }
    }
    
    static void error(int option) {
        String error = "I'm sorry. Available options are listed below.";
        switch (option) {
            case 0:
                tab(6, 2);
                System.out.println(error);
                break;
            case 1:
                tab(6, 2);
                System.out.println("\n" + error);
                break;
            case 2:
                tab(6, 2);
                System.out.println(error + "\n");
                break;
            case 3:
                tab(6, 2);
                System.out.println("\n" + error + "\n");
                break;
        }
    }
    
    static void search(String [] i, int j) {
        // Search "brands[(choice - 1)]" on the internet
        
        // Remove this if search method has been added
        linebreak(3);
        
        System.out.println("\tSorry, this feature isn't available right now.");
        System.out.println("\tPlease try again later.");
        
        linebreak(3);
        
        tab(13, 0);
        System.out.println("(1 - Back | 2 - Exit)");
    }
    
    static void buy(String [][] i, int j) {
        linebreak(3);
        
        
        String [] message = {
        "Price: Php. " + i[j][0],
        "Name: " + i[j][1],
        "Description: " + i[j][2],
        "Are you sure?",
        "Do you want to purchase \"" + CategoryMenNewArrivals.newArrivalItems[j][1] + "\"?"
        };
        
        for (int k = 0; k < message.length; k++) {
            if (k == 3) {
                System.out.println("\n\t" + message[k]);
                continue;
            }
            System.out.println("\t" + message[k]);
        }
        
        linebreak(3);
        
        tab(13, 2);
        System.out.println("(1 - Yes | 2 - No)");
        
        selector();
        byte choice = scan.nextByte();
        switch (choice) {
            case 1:
                Payment.enter(j);
                break;
            case 2:
                CategoryMenNewArrivals.show();
                break;
            default:
                error(0);
                buy(i, j);
        }
    }
    
}
