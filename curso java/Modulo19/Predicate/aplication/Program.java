package Predicate.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Predicate.entities.Employee;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try  (BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\maira\\OneDrive\\Documentos\\curso java\\Modulo20\\Employee.txt"))){
            List <Employee> employee = new ArrayList<>();
            String line= br.readLine();
           
            while (line!=null){
                String [] fields = line.split(";");
                employee.add (new Employee(fields [0], fields [1], Double.parseDouble(fields [2])));
                line=br.readLine();
              
            }
        
        System.out.print("enter whith salary: ");
        double salary=sc.nextDouble();
        
        List <String> email=employee.stream().filter(x->x.getSalary()>salary).map(x->x.getEmail()).sorted().collect(Collectors.toList());
        System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			email.forEach(System.out::println);
			 Double sum = employee.stream().filter(x->x.getName().charAt(0)=='M').map(x->x.getSalary()).reduce(0.0, (x, y)-> x+y);
             System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
        }
         catch (IOException e) {
            System.out.println( "error: "+ e.getMessage());
        }
        


        sc.close();
    }
}
