package Modulo20.exemplo.aplication;

import java.util.Comparator;
import Modulo20.exemplo.entities.Product;


public class mycompare implements Comparator<Product> {

    @Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
    
}
