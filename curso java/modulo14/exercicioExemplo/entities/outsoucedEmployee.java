package modulo14.exercicioExemplo.entities;

public class outsoucedEmployee extends Employee{
    private Double additionalCharge;

    public outsoucedEmployee (){
        
    }

    public outsoucedEmployee(String name, Integer hours, Double valuePreHour, Double additionalCharge) {
        super(name, hours, valuePreHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment(){
        return super.payment()+additionalCharge*1.1;
    }
}
