package exemplo2.aplication;
import exemplo2.entites.product;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        product product = new product();
        System.out.println( "name");
        product.name = sc.nextLine();
        System.out.println("price");
        product.price = sc.nextDouble();
        System.out.println( "quantidade no estoque");
        product.quantity =  sc.nextInt();
        System.out.println();
        System.out.println("product data: "+product);

        System.out.println("quantidade a ser adicionada no estoque: ");
        int quantity = sc.nextInt();
        product.adProduct(quantity);
         System.out.println();
        System.out.println("quantidade comprada: "+product);
        int saida=sc.nextInt();
        product.removeProducts(saida);
        System.out.println("quantidade vendida: "+product);
    sc.close();
    }
    }
    
