package ProblemaExemplo1.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import ProblemaExemplo1.entites.Usuario;

public class Program {
    public static void main(String[] args) {
   //Lendo o arquivo .txt
    try (BufferedReader br=new BufferedReader (new FileReader("C:\\Users\\maira\\OneDrive\\Documentos\\curso java\\Modulo19\\ProblemaExemplo1\\exemplo.txt"))) {
      
        Set <Usuario> set=new HashSet<>();
        String line= br.readLine();
        while (line!=null) {
            //comparando
            String [] fields= line.split(" ");
            String usuario = fields [0];
            Date moment = Date.from(Instant.parse(fields [1]));
            set.add(new Usuario(usuario, moment));
            line= br.readLine();
        }
        System.out.println("Total users: " + set.size());

    } 
    catch (IOException e) {
      System.out.println(" Error: " + e.getMessage());
    }
    }
}
