package modulo14.exercicioDeFixacacao02.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modulo14.exercicioDeFixacacao02.entities.Empresarial;
import modulo14.exercicioDeFixacacao02.entities.Imposto;
import modulo14.exercicioDeFixacacao02.entities.Individual;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Imposto>list=new ArrayList<>();
        System.out.print("Qual o número de contribuintes:  ");
        int n=sc.nextInt();
       for (int i=1;i<=n;i++){
             System.out.println("Tax payer #" + i + " data:");
		    System.out.print("Individual or company (i/c)? ");
		    char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
       
                if (type == 'i') {
				    System.out.print("Health expenditures: ");
				    double gastosComSaude = sc.nextDouble();
				    list.add(new Individual(name,income,gastosComSaude));
                } else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Empresarial(name, income, numberOfEmployees));
            }
       }
        
       double sum = 0.0;
       System.out.println();
       System.out.println("TAXES PAID:");
       for (Imposto tp : list) {
           double tax = tp.tax();
           System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
           sum += tax;
       }
       
       System.out.println();
       System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
       
        sc.close();
    }

}
