import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemaMotivador{
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite quantas impressões: ");
        int n=sc.nextInt();

        List <Integer> list = new ArrayList<>(n);

            for (int i=1; i<=n; i++) {
                System.out.println(" digite o valor" +i+":");
                int x=sc.nextInt();
                list.add(x);
    }
    System.out.print("First:"+list.getFirst());

    sc.close();
}

}