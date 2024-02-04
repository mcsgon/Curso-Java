package ExercicioProposto;

import java.io.BufferedReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.FileReader;
import java.io.IOException;


public class Program {
    public static void main(String[] args) {
      
        try (BufferedReader br=new BufferedReader( new FileReader("\"C:\\Users\\maira\\OneDrive\\Documentos\\curso java\\Modulo19\\ProblemaExemplo1\\exemplo.txt\""))){
              Map <String, Integer> map = new LinkedHashMap<>();
              String line= br.readLine();
              while (line!=null) {
                //comparando
                String [] voto= line.split(",");
                String name = voto[0];
                int quantidade = Integer.parseInt(voto[1]);
                if (map.containsKey (name)){
                    int votesSoFar = map.get(name);
					map.put(name, quantidade + votesSoFar);
				}
				else {
					map.put(name, quantidade);
				}
				
				line = br.readLine();
			}
			
			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}

			

        } catch (IOException e) {
            System.out.println(" erro: "+ e.getMessage());
        }
    }
}

