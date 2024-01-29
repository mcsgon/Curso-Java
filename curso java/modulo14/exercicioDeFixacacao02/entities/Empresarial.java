package modulo14.exercicioDeFixacacao02.entities;

public class Empresarial extends Imposto {
    private Integer numeroDeEmpregados;

    
    public Empresarial(String name, Double anualIncome, Integer numeroDeEmpregados) {
        super(name, anualIncome);
        this.numeroDeEmpregados = numeroDeEmpregados;
    }


    @Override
    public Double tax() {
        if(numeroDeEmpregados>10){
            return getAnualIncome()*0.14;
        }else{
            return getAnualIncome()*0.16;
        }
    }


    public Integer getNumeroDeEmpregados() {
        return numeroDeEmpregados;
    }


    public void setNumeroDeEmpregados(Integer numeroDeEmpregados) {
        this.numeroDeEmpregados = numeroDeEmpregados;
    }
    
}
