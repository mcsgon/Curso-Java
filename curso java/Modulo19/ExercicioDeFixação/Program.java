package ExercicioDeFixação;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in); 
    
        Set<Integer> r=new HashSet<>();
        System.out.println( "Digite a quantidade de cursos: ");
        int curso=sc.nextInt();

        for (int i=1; i<=curso; i++){
            System.out.print( "Quantos alunos do curso" + i +"?");
            int aluno=sc.nextInt();
            for (int e=0; e<aluno; e++){
                int n = sc.nextInt();
                r.add(n);
            }
          
        }
        Set<Integer> total=new HashSet<>(r);
        total.addAll(r);
        System.out.println("Total students: " + total.size());

        sc.close();


    }

}
