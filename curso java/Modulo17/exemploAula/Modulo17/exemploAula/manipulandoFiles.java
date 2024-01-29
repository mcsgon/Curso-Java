package Modulo17.exemploAula;

import java.io.File;
import java.util.Scanner;

public class manipulandoFiles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a path");
        String strPath=sc.nextLine();

        File path =new File(strPath);
//manipulando subpastas
File[] folders=path.listFiles(File::isDirectory);
System.out.println("FOLDERS");
    for (File folder: folders){
        System.out.println(folder);
    }
//Listando arquivos dentro de uma pasta
File[] files=path.listFiles(File::isFile);
System.out.println("FILES");
for (File file:files){
    System.out.println(file);
}
boolean sucess=new File(strPath+"\\subdir").mkdir();
System.out.println(" Directory created"+sucess);
sc.close();
    }
}
