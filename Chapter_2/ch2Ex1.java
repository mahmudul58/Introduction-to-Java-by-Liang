/* (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
double value from the console, then converts it to Fahrenheit, and displays the
result*/
///Mahmudul Islam Amit(IT23008)
import java.util.Scanner;
public class ch2Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        System.out.print("Enter Temperature in celsius : ");
        celsius=input.nextDouble();
        double fer=(9.0/5)*celsius+32;
        System.out.println("Temperature in Fahrenheit is : "+fer);
    }
}
