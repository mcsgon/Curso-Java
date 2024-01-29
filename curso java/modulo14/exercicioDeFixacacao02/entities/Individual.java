package modulo14.exercicioDeFixacacao02.entities;

public class Individual extends Imposto {
private double gastosComSaude;


    public Individual(String name, Double anualIncome, double gastosComSaude) {
    super(name, anualIncome);
    this.gastosComSaude = gastosComSaude;
}



    @Override
    public Double tax() {
        if (getAnualIncome()<20000.00){
            return getAnualIncome()*0.15-gastosComSaude*0.5;
        } else {
            return getAnualIncome()*0.25-gastosComSaude*0.5;
        }
    }



    public double getGastosComSaude() {
        return gastosComSaude;
    }



    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }
    
}
