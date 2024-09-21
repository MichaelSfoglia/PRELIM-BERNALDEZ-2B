package programpack;

import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    
    public void accInit() {
        Accounts acc = new Accounts();
        int option;

        do{ 
            System.out.println("1. ADD \n2. VIEW \n3. UPDATE \n4. DELETE \n5. EXIT \n");
        
            System.out.printf("Enter command: ");
            option = input.nextInt();

            switch(option){
                case 1:
                    acc.addAcc();
                    break;
                    
                case 2:
                    acc.viewAcc();
                    break;
                    
                case 3:
                    acc.upAcc();
                    break;
                    
                case 4:
                    acc.deAcc();
                    break;
                    
                case 5:
                    System.out.println("Account exited.\n");
                    break;
                    
                default:
                    System.out.println("No program found.\n");
            }
        } while(option != 5);
    }
}
