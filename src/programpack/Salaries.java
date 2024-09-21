package programpack;

import java.util.Scanner;

public class Salaries {
    Scanner input = new Scanner(System.in);
    int members, index, spec;
        
    String[] name = new String[100];
    double[] rate = new double[100], gross = new double[100], deduct = new double[100], net_pay = new double[100];
    int[] hours = new int[100], id = new int[100];
    
    public void addSal(){
        System.out.printf("Enter no. of accounts: ");
        members = input.nextInt();
        
        for(index = 0; index < members; index++){
            System.out.printf("Enter details of employee " + index + ":\nID: ");
            id[index] = input.nextInt();
            // VALIDATION HERE
            
            System.out.printf("Name: ");
            name[index] = input.next();
            // VALIDATION HERE
            
            System.out.printf("Rate (Hourly): ");
            rate[index] = input.nextDouble();
            // VALIDATION HERE
            
            System.out.printf("Hours Worked: ");
            hours[index] = input.nextInt();
            // VALIDATION HERE
            
            gross[index] = hours[index] * rate[index];
            
            System.out.printf("Deduction: ");
            deduct[index] = input.nextDouble();
            // VALIDATION HERE
            
            net_pay[index] = gross[index] - deduct[index];
            
            
        }
    }
    
    public void viewSal(){
        for(index = 0; index < members; index++){
            if(members == 0){
            System.out.println("No accounts to display.");
            }
            else{
                System.out.printf("%-5s %-15s %-10s %-10s %-10s %-15s %-10s%n", "ID", "Name", "Rate", "Hours", "Gross", "Deduction", "Net Pay");
                System.out.println("---------------------------------------------------------------");
                for(index = 0; index < members; index++){
                    System.out.printf("%-5d %-15s %-10.2f %-10d %-10.2f %-15.2f %-10.2f%n", id[index], name[index], rate[index], hours[index], gross[index], deduct[index], net_pay[index]);
                }
            }
        }
    }
    
    public void upSal(){
        System.out.printf("Enter ID to update: ");
        int updateID = input.nextInt();
        
        for(index = 0; index < members; index++){           
            if(id[index] == updateID){
                
                //Prompt
                System.out.println("\nChoose field to update:");
                System.out.println("1. Name");
                System.out.println("2. Rate");
                System.out.println("3. Hours");
                System.out.println("4. Deduction");
                
                System.out.printf("\nEnter choice: ");
                int choice = input.nextInt();
                    
                switch(choice){
                    case 1:
                        System.out.printf("Enter new name: ");
                        name[index] = input.next();
                        System.out.println("Success!");
                        break;
                            
                    case 2: 
                        System.out.printf("Enter new rate (hourly): ");
                        rate[index] = input.nextDouble();
                        System.out.println("Success!");
                        break;
                        
                    case 3: 
                        System.out.printf("Enter new hours: ");
                        hours[index] = input.nextInt();
                        System.out.println("Success!");
                        break;
                    case 4: 
                        System.out.printf("Enter new deduction: ");
                        deduct[index] = input.nextDouble();
                        System.out.println("Success!");
                        break;
                            
                    default:
                        System.out.println("Invalid choice, no changes made.");
                        break;
                }
                gross[index] = hours[index] * rate[index];
                net_pay[index] = gross[index] - deduct[index];
            }
        }
    }
    
    public void deSal(){
        System.out.println("Enter ID to delete:");
        int deleteID = input.nextInt();
        
        for(index = 0; index < members; index++){
            if(id[index] == deleteID){
                for(spec = index; index < members - 1; index++){
                    id[spec] = id[spec + 1];
                    name[spec] = name[spec + 1];
                    rate[spec] = rate[spec + 1];
                    hours[spec] = hours[spec + 1];
                    deduct[spec] = deduct[spec + 1];
                    
                    gross[index] = hours[index] * rate[index];
                    net_pay[index] = gross[index] - deduct[index];
                }
                members--;
                
                System.out.println("Account deleted successfully!");
            }
        }
    }
}
