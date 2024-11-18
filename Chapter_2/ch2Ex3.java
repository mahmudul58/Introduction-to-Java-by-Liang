/* (Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter.*/

///Mahmudul Islam Amit(IT23008)

import java.util.Scanner;
public class ch2Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet;
        System.out.print("Enter a value for feet : ");
        feet=input.nextDouble();
        double met=feet*0.305;
        System.out.println(feet+" feet is "+met+" meters");
    }
}
