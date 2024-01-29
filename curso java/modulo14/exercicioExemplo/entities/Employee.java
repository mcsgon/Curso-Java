package modulo14.exercicioExemplo.entities;

public class Employee {
private String name;
private Integer hours;
private Double valuePreHour;

public Employee (){

}
public Employee(String name, Integer hours, Double valuePreHour) {
    this.name = name;
    this.hours = hours;
    this.valuePreHour = valuePreHour;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Integer getHours() {
    return hours;
}
public void setHours(Integer hours) {
    this.hours = hours;
}
public Double getValuePreHour() {
    return valuePreHour;
}
public void setValuePreHour(Double valuePreHour) {
    this.valuePreHour = valuePreHour;
}

public double payment(){
    return hours*valuePreHour;
}

}
