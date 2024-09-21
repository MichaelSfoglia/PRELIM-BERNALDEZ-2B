package programpack;

import java.util.Scanner;

public class Receipt {
    Scanner input = new Scanner(System.in);
    
    public void recInit(){
        Receipts rec = new Receipts();
        int option;

        do{ 
            System.out.println("1. ADD \n2. VIEW \n3. UPDATE \n4. DELETE \n5. EXIT \n");
        
            System.out.printf("Enter command: ");
            option = input.nextInt();

            switch(option){
                case 1:
                    rec.addRec();
                    break;
                    
                case 2:
                    rec.viewRec();
                    break;
                    
                case 3:
                    rec.upRec();
                    break;
                    
                case 4:
                    rec.deRec();
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
