package exercicioExemplo1.entities;
import java.util.Date;

public class Contrato {
private Date date;
private Double valorPorHora;
private Integer hora;

public Contrato(Date date, Double valorPorHora, Integer hora) {
    this.date = date;
    this.valorPorHora = valorPorHora;
    this.hora = hora;
}

public Date getDate() {
    return date;
}

public void setDate(Date date) {
    this.date = date;
}

public Double getValorPorHora() {
    return valorPorHora;
}

public void setValorPorHora(Double valorPorHora) {
    this.valorPorHora = valorPorHora;
}

public Integer getHora() {
    return hora;
}

public void setHora(Integer hora) {
    this.hora = hora;
}
public double totalValue(){
    return valorPorHora*hora;
}

}
