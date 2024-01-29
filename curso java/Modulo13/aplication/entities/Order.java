package aplication.entities;
import java.util.Date;
public class Order {
private Integer Id;
private Date moment;
private orderStatus status;
public Order (){
}
    public Order (Integer id, Date moment, orderStatus status){

        Id = id;
        this.moment = moment;
        this.status = status;
    }
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public orderStatus getStatus() {
        return status;
    }
    public void setStatus(orderStatus status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Order [Id=" + Id + ", moment=" + moment + ", status=" + status + "]";
    }
    
}
