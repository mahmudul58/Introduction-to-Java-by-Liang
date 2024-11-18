/* (Sum the digits in an integer) Write a program that reads an integer between 0
and 1000 and adds all the digits in the integer. For example, if an integer is 932,
the sum of all its digits is 14.*/

///Mahmudul Islam Amit(IT23008)

import java.util.Scanner;
public class ch2Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num;
        System.out.print("Enter a number between 0 and 1000 : ");
        num=input.next();
        int sum=0;
        for(int i=0;i<num.length();i++){
            sum+=num.charAt(i)-'0';  
        }
        System.out.println("The sum of the digits is "+sum);
    }
}
