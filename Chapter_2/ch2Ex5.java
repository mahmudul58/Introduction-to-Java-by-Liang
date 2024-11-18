/* (Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.*/

///Mahmudul Islam Amit(IT23008)

import java.util.Scanner;
public class ch2Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sub,gr;
        System.out.print("Enter the subtotal and a gratuity rate : ");
        sub=input.nextDouble();
        gr = input.nextDouble();
        double grat=sub*gr/100.0;
        double total=sub+grat;
        System.out.println("The gratuity is $"+grat+" and total is $"+total);
    }
}
