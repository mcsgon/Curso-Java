package Modulo15.Model.entities;
import Modulo15.Model.exception.DomainException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;
    public static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
    
    public Reservation(){
        
    }
    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        if (!checkout.after(checkin)){
            throw new DomainException ("check-out date must be after chek-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Date getCheckin() {
        return checkin;
    }
   
    
    public Date getCheckout() {
        return checkout;
    }
    
	public long duration(){
        long diff=checkout.getTime()-checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates (Date checkin, Date checkout){
        Date now=new Date();
        if(checkin.before(now) || checkout.before(now)){
            throw new DomainException (" Reservations dates for update must be future dates");
        }
        if(checkout.after(checkin)){
            throw new DomainException ("check-out date must be after check-in date");
        }
        this.checkin=checkin;
        this.checkout=checkout;
    }
    @Override
    public String toString() {
        return "Reservation [roomNumber=" + roomNumber + ", checkin=" + checkin + ", checkout=" + checkout + "]";
    }
    
    
}
