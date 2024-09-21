package programpack;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static int option;
    
    public static void main(String[] args) {
        Account acc = new Account();
        Receipt rec = new Receipt();
        Salary sal = new Salary();
        
        do{
            System.out.println("1. ACCOUNTS \n2. SALARIES \n3. RECEIPT \n4. EXIT \n");
        
            System.out.printf("Enter program: ");
            option = in.nextInt();

            switch(option){
                case 1:
                    acc.accInit();
                    break;
                    
                case 2:
                    sal.salInit();
                    break;
                    
                case 3:
                    rec.recInit();
                    break;
                    
                case 4:
                    System.out.println("Program exited.\n");
                    break;
                    
                default:
                    System.out.println("No program found.\n");
            }
        } while(option != 4);
    }
}
