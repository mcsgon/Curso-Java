package exercicioExemplo2.entities;



public class Comment {
public String text;

public Comment(String text) {
    this.text = text;
}

public String getText() {
    return text;
}

public void setText(String text) {
    this.text = text;
}

@Override
public String toString() {
    return "Comment [text=" + text + "]";
}


}
