package exercicioExemplo2.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exercicioExemplo2.entities.Comment;
import exercicioExemplo2.entities.Post;

public class Program {
    public static void main(String[] args) throws ParseException {
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
Comment c1 = new Comment("Have a nice trip!");
Comment c2 = new Comment("Wow that's awesome!");
Post p1 = new Post
(sdf.parse("22/04/2022 14:30:42"), 
"Traveling to NewZeland", 
"I'm going to visit this contry",
 12
 );
 p1.addComment(c1);
p1.addComment(c2);

System.out.println(p1);
 

       
    }
}
