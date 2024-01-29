package Modulo17.exemploAula;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class aula3 {

    public static void main(String[] args) {

String [] lines=new String[]{"Good morning","Good afternoon","Good Nigth"};
String pach ="C:\\Users\\maira\\OneDrive\\Área de Trabalho\\curso java\\teste.txt";

try (BufferedWriter bw=new BufferedWriter(new FileWriter(pach,true))) { //sem o true o arq é destruido/criado; com o true o arq é atualizado
    for (String line: lines){
        bw.write(line); //Escrevendo no arquivo
        bw.newLine();//quebra de linha

    }
} catch (IOException e) {
    e.printStackTrace();
}

    }
}
        