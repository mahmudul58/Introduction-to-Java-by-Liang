/* 
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume
*/
///Mahmudul Islam Amit(IT23008)
import java.util.Scanner;
public class ch2Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rad,len;
        System.out.print("Enter the radius and length of a cylinder: ");
        rad=input.nextDouble();
        len = input.nextDouble();
        double area=3.1416*rad*rad;
        double vol=area+len;
        System.out.println("The area is : "+area);
        System.out.println("The volume is : "+vol);
    }
}
