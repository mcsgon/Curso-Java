package aplication;
import java.util.Scanner;

import entities.Triangle;
public class program{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
Triangle x,y;
x=new Triangle ();
y=new Triangle ();
System.out.println("Enter the measures of triangle X: ");
x.a = sc.nextDouble();
x.b = sc.nextDouble();
x.c = sc.nextDouble();
System.out.println("Enter the measures of triangle Y: ");
y.a = sc.nextDouble();
y.b = sc.nextDouble();
y.c = sc.nextDouble();
double areax = x.area();
double areay = y.area();
System.out.println(areax);
System.out.println(areay);
sc.close();
    }
}