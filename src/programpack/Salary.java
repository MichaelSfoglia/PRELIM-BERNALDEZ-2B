package programpack;

import java.util.Scanner;
import static programpack.Main.in;

public class Salary {
    Scanner input = new Scanner(System.in);
    
    public void salInit(){
        Salaries sal = new Salaries();
        
        int option;

        do{ 
            System.out.println("1. ADD \n2. VIEW \n3. UPDATE \n4. DELETE \n5. EXIT \n");
        
            System.out.printf("Enter command: ");
            option = in.nextInt();

            switch(option){
                case 1:
                    sal.addSal();
                    break;
                    
                case 2:
                    sal.viewSal();
                    break;
                    
                case 3:
                    sal.upSal();
                    break;
                    
                case 4:
                    sal.deSal();
                    break;
                    
                case 5:
                    System.out.println("Salary exited.\n");
                    break;
                    
                default:
                    System.out.println("No program found.\n");
            }
        } while(option != 5);
    }
}
