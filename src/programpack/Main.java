package programpack;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static int option;
    
    public static void main(String[] args) {
        Account acc = new Account();
        
        do{
            System.out.println("1. ACCOUNTS \n2. SALARIES \n3. RECEIPT \n4. EXIT");
        
            System.out.printf("Enter program: (1-3): ");
            option = in.nextInt();

            switch(option){
                case 1:
                    acc.accInit();
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                default:
                    System.out.println("No program found.");
            }
        } while(option != 4);
    }
}
