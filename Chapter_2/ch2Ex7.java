/* (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the maximum number of years and remain-
ing days for the minutes. For simplicity, assume that a year has 365 days.*/

///Mahmudul Islam Amit(IT23008)

import java.util.Scanner;
public class ch2Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min;
        System.out.print("Enter the number of minutes : ");
        min=input.nextInt();
        int year=min/(365*24*60);
        int day=(min-year*365*24*60)/(24*60);
        System.out.println(min+"minutes is approximately "+year+" years and "+day+" days");
    }
}
