package Modulo18.Solução1.Model.Services;

public class BrazilTaxService implements TaxService  {
    
    public double tax(double amount){
        if (amount<=100.00){
            return amount * 2.0;
        }
        else{
            return amount *0.15;
        }
    }
}
