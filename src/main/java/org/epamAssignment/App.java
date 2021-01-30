package org.epamAssignment;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1=sc.nextInt();
        System.out.println("Enter number 2:");
        int num2=sc.nextInt();
        System.out.println("****************************CALCULATOR MENU*****************************");
        System.out.println("press 0 to exit\npress 1 to add\npress 2 to subtract\npress 3 to multiply\npress 4 to divide\npress 5 to display result\n");
        boolean exit=false;
        int choice;
        functions a=new functions();
        int ans=-999;
        do{
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 5:
                    System.out.println("Result is: "+ans);
                    ans=0;
                    break;
                case 1:
                ans= a.add(num1,num2);
                 break;
                case 2:
                   ans= a.subtract(num1,num2);
                    break;
                case 3:
                  ans=  a.multiply(num1,num2);
                    break;
                case 4:
                   ans= a.divide(num1,num2);
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Enter correct choice!");
            }
        }while(exit!=true);
        System.out.println("Program ended!");
    }
}
