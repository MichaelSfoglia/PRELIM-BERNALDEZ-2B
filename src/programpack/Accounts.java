package programpack;

import java.util.Scanner;

public class Accounts{
    Scanner input = new Scanner(System.in);
    int members, index, spec;
    
    int[] id = new int[100];
    String[] name = new String[100], email = new String[100], pass = new String[100];
    
    public void addAcc(){
        System.out.printf("Enter no. of accounts: ");
        members = input.nextInt();
        // VALIDATION HERE
        
        for(index = 0; index < members; index++){
            System.out.printf("Enter ID: ");
            id[index] = input.nextInt();
            // VALIDATION HERE
            
            System.out.printf("Enter Name: ");
            name[index] = input.next();
            // VALIDATION HERE
            
            System.out.printf("Enter Email: ");
            email[index] = input.next();
            // VALIDATION HERE
            
            System.out.printf("Enter Pass: ");
            pass[index] = input.next();
            // VALIDATION HERE
            
            System.out.println("");
        }
    }
    
    public void viewAcc(){
        if(members == 0){
            System.out.println("No accounts to display.");
        }
        else{
            System.out.printf("%-5s %-15s %-25s %-15s%n", "ID", "Name", "Email", "Password");
            System.out.println("---------------------------------------------------------------");
            for(index = 0; index < members; index++){
                System.out.printf("%-5s %-15s %-25s %-15s%n\n", id[index], name[index], email[index], pass[index]);
            }
        }
    }
    
    public void upAcc(){
        System.out.printf("Enter ID to update: ");
        int updateID = input.nextInt();
        
        for(index = 0; index < members; index++){           
            if(id[index] == updateID){
                
                //Prompt
                System.out.println("\nChoose field to update:");
                System.out.println("1. Name");
                System.out.println("2. Email");
                System.out.println("3. Password");
                
                System.out.printf("\nEnter choice: ");
                int choice = input.nextInt();
                    
                switch(choice){
                    case 1:
                        System.out.printf("Enter new name: ");
                        name[index] = input.next();
                        System.out.println("Success!");
                        break;
                            
                    case 2: 
                        System.out.printf("Enter new email: ");
                        email[index] = input.next();
                        System.out.println("Success!");
                        break;
                            
                    case 3:
                        System.out.printf("Enter new password: ");
                        String newPass = input.next();
                        
                        System.out.printf("Confirm new password: ");
                        String confirmPass = input.next();
                        
                        if(newPass.equals(confirmPass)){
                            pass[index] = newPass;
                            System.out.println("Password updated successfully!");
                        }
                        else{
                            System.out.println("Passwords do not match, try again.");
                        }
                        break;
                            
                    default:
                        System.out.println("Invalid choice, no changes made.");
                        break;
                }
            }
        }
    }
    
    public void deAcc(){
        System.out.println("Enter ID to delete:");
        int deleteID = input.nextInt();
        
        for(index = 0; index < members; index++){
            if(id[index] == deleteID){
                for(spec = index; index < members - 1; index++){
                    id[spec] = id[spec + 1];
                    name[spec] = name[spec + 1];
                    email[spec] = email[spec + 1];
                    pass[spec] = pass[spec + 1];
                }
                members--;
                
                System.out.println("Account deleted successfully!");
            }
        }
    }
}
