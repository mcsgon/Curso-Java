package membrosEstaticos.aplication;

import java.util.Scanner;

import membrosEstaticos.entities.Calculator;

public class Program {
    public static final double PI=3.14159;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("qual o raio?");

        double raio = sc.nextDouble();
        double circulo = Calculator.circumference(raio);
        double vol=Calculator.volume(raio);
        System.out.printf("circunferencia: %.2f%n ",circulo);
        System.out.printf("volume: %.2f%n ",vol);
        

        sc.close();
    }
   
    }
    
