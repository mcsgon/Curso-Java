package exercicioExemplo1.entities;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
//ATRIBUTOS BÁSICOS
public class Worker {
private String name;
private Level level;
private Double basesalary;


//ASSOCIAÇÕES


private Departamento departamento;
private List<Contrato> contracts = new ArrayList<>();//instanciando as listas


//CONSTRUTORES (NÃO INCLUIR LISTAS)

public Worker(){

}



public Worker(String name, Level level, Double basesalary, Departamento departamento) {
    this.name = name;
    this.level = level;
    this.basesalary = basesalary;
    this.departamento = departamento;
}



//geters e seters
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Level getLevel() {
    return level;
}
public void setLevel(Level level) {
    this.level = level;
}
public Double getBasesalary() {
    return basesalary;
}
public void setBasesalary(Double basesalary) {
    this.basesalary = basesalary;
}
public Departamento getDepartamento() {
    return departamento;
}
public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
}
public List<Contrato> getContracts() { //sem set para proteger a lista original. se tiver o set a lista inteira será trocada
    return contracts;
}
public void addContrato(Contrato contract){
contracts.add(contract);
}
public void removeContrato(Contrato contract){
    contracts.remove(contract);
}
public double income(int year, int month){
double sum =basesalary;
Calendar cal =Calendar.getInstance();
for(Contrato c: contracts){
    int c_year=cal.get(Calendar.YEAR);
    int c_month=1+cal.get(Calendar.MONTH);
    if(year==c_year && month ==c_month){
        sum+= c.totalValue();

    }
}
return sum;
}
}

