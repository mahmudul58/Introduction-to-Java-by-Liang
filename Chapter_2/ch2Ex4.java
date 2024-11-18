/* (Convert pounds into kilograms) Write a program that converts pounds into ki-
lograms. The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilogram.*/

///Mahmudul Islam Amit(IT23008)

import java.util.Scanner;
public class ch2Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p;
        System.out.print("Enter a value for pounds : ");
        p=input.nextDouble();
        double kg=p*0.454;
        System.out.println(p+" pounds is "+kg+" kilograms");
    }
}
