package membrosEstaticos.entities;

public class Calculator {
    public static final double PI=3.14;
    public static double circumference (Double raio){
        return 2*PI*raio;
    }
    public static double volume(Double raio){
        return 4*PI*raio*raio*raio/3;
    }

}
