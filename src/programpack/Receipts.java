package programpack;

import java.util.Scanner;
import java.util.stream.*;

public class Receipts {
    Scanner input = new Scanner(System.in);
    int members, index, spec, totalSold;
    double profit;
    
    int[] sold = new int[100], id = new int[100];
    String[] name = new String[100];
    double[] price = new double[100], sales = new double[100];
    
    
    
    public void addRec(){
        System.out.printf("Enter no. of products: ");
        members = input.nextInt();
        // VALIDATION HERE
        
        for(index = 0; index < members; index++){
            System.out.println("\nProduct Details:");
            System.out.printf("\tID: ");
            id[index] = input.nextInt();
            // VALIDATION HERE
            
            System.out.printf("\tProduct Name: ");
            name[index] = input.next();
            // VALIDATION HERE
            
            System.out.printf("\tPrice: ");
            price[index] = input.nextDouble();
            // VALIDATION HERE
            
            System.out.printf("\tSold: ");
            sold[index] = input.nextInt();
            // VALIDATION HERE
            
            sales[index] = price[index] * sold[index];
            totalSold = IntStream.of(sold).sum();
            profit = DoubleStream.of(sales).sum();
            
            System.out.println("");
        }
    }
    
    public void viewRec(){
        System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "ID", "Name", "Price", "Sold", "Sales");
        System.out.println("---------------------------------------------------------------");

        for(index = 0; index < members; index++){
            System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", id[index], name[index], price[index], sold[index], sales[index]);
        }
        System.out.println("---------------------------------------------------------------");
        
        System.out.printf("No. of Item Sold: %d", totalSold);
        System.out.printf("Total Profit: %.2f", profit);
        System.out.printf("Product Count: %d", members);
    }
    
    public void upRec(){
        System.out.printf("Enter ID to update: ");
        int updateID = input.nextInt();
        
        for(index = 0; index < members; index++){           
            if(id[index] == updateID){
                
                //Prompt
                System.out.println("\nChoose field to update:");
                System.out.println("1. Name");
                System.out.println("2. Price");
                System.out.println("3. Sold");
                
                System.out.printf("\nEnter choice: ");
                int choice = input.nextInt();
                    
                switch(choice){
                    case 1:
                        System.out.printf("Enter new name: ");
                        name[index] = input.next();
                        System.out.println("Success!");
                        break;
                            
                    case 2: 
                        System.out.printf("Enter new price: ");
                        price[index] = input.nextDouble();
                        System.out.println("Success!");
                        break;
                        
                    case 3: 
                        System.out.printf("Enter new sold: ");
                        sold[index] = input.nextInt();
                        System.out.println("Success!");
                        break;
                            
                    default:
                        System.out.println("Invalid choice, no changes made.");
                        break;
                }
                sales[index] = price[index] * sold[index];
                totalSold = IntStream.of(sold).sum();
                profit = DoubleStream.of(sales).sum();
            }
        }
    }
    
    public void deRec(){
        System.out.println("Enter ID to delete:");
        int deleteID = input.nextInt();
        
        for(index = 0; index < members; index++){
            if(id[index] == deleteID){
                for(spec = index; index < members - 1; index++){
                    id[spec] = id[spec + 1];
                    name[spec] = name[spec + 1];
                    price[spec] = price[spec + 1];
                    sold[spec] = sold[spec + 1];
                    
                    sales[index] = price[index] * sold[index];
                    totalSold = IntStream.of(sold).sum();
                    profit = DoubleStream.of(sales).sum();
                }
                members--;
                
                System.out.println("Account deleted successfully!");
            }
        }
    }
}
