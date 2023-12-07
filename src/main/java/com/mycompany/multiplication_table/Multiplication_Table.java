package com.mycompany.multiplication_table;
// importing scanner libary file
import java.util.Scanner;
// project has been uploaded to github
// this is the 1st project of the multiplication  in
// 

public class Multiplication_Table {

    public static void main(String[] args) {
        // importing scanner class
        Scanner input = new Scanner(System.in);
        
        System.out.println("Note - this program will be showing from 1 - 12 only");
        System.out.println("Stay tuned for an upgraded version");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Hi welcome !!! ");
        System.out.print("Please enter which multiplication number you need :");
        int mul =input.nextInt();
        
        for(int i=1;i<=12;i++)
        {
            System.out.println(""+mul+" x "+i+" = "+(mul*i));
        
        }
        System.out.println("Thank you for using the service");
        
       
        
    }
}
