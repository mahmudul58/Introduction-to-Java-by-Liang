/* Write a program that prompts the user to enter a monthly saving amount and dis-
plays the account value after the sixth month.*/

///Mahmudul Islam Amit(IT23008)

import java.util.Scanner;
public class ch2Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double amount;
        System.out.print("Enter the monthly saving amount : ");
        amount=input.nextDouble();
        double total=0;
        for(int i=1;i<=6;i++){
            total=(total+amount)*(1+0.00417);
            System.out.println(total);
        }
        System.out.println("After the sixth month, the account value is "+total);
    }
}
