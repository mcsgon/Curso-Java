package Modulo17.exemploAula;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        //instanciando o objeto File
        File file = new File("‪C:\\Users\\maira\\OneDrive\\Área de Trabalho\\curso java\\Módulo13.tx");
        Scanner sc =null;
        try{
            sc=new Scanner(file);
            while(sc.hasNextLine()){
            System.err.println(sc.nextLine());
        }
        }
        catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
        finally{
            if (sc!=null){
                sc.close();
            }
        }
    }
}