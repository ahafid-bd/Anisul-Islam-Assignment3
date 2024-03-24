package assignment3;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int id;
        String title;
        String price;
        String description;
        String catagory;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID :");
        id = input.nextInt();
        System.out.println("Id : "+id);
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter title :");
        title = input1.nextLine();
        System.out.println("title : "+title);
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter price :");
        price = input3.nextLine();
        System.out.println("price : "+price);
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter description :");
        description = input4.nextLine();
        System.out.println("description : "+description);
        Scanner input5 = new Scanner(System.in);
        System.out.print("Enter catagory :");
        catagory = input5.nextLine();
        System.out.println("catagory : "+catagory);
        
        
    }
    
}
