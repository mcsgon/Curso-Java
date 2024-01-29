package exercicioExemplo1.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import exercicioExemplo1.entities.Departamento;
import exercicioExemplo1.entities.Contrato;
import exercicioExemplo1.entities.Worker;
import exercicioExemplo1.entities.Level;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
System.out.print(" entre com o nome do departamento ");
String departamento=sc.nextLine();
System.out.print("Enter work data: ");
System.out.print("name: ");
String workerName=sc.nextLine();
System.out.print("level: ");
String workLevel=sc.nextLine();
System.out.print("salário-base: ");
double baseSalary=sc.nextDouble();
Worker worker= new Worker (workerName,Level.valueOf(workLevel),baseSalary,new Departamento(departamento) );

System.out.print("Quantos contratos esse trabalhador tem?");
int n =sc.nextInt();
for (int i=1; i<=n; i++){
//lendo os dados do contrato
System.out.println("Data do contrato#:"+i+" ");
System.out.print("Date (DD/MM/YYYY): ");
Date contracDate = sdf.parse(sc.next());
System.out.print("Valor pago por hora: ");
double valuePerHouer = sc.nextDouble();
int horas= sc.nextInt();
Contrato contract=new Contrato(contracDate, valuePerHouer, horas);
worker.addContrato(contract);
}
System.out.println();
System.out.print("Enter month and year to calculate income (MM/YYYY): ");
String monthAndYear=sc.nextLine();
int moth=  Integer.parseInt(monthAndYear.substring(0, 2));
int year=Integer.parseInt(monthAndYear.substring(3));

System.out.println("name: "+ worker.getName());
System.out.println("Departament: "+worker.getDepartamento().getName());
System.out.println("ganho: "+monthAndYear+": "+String.format("%.2f",worker.income(year, moth)));


sc.close();
    }
  }
