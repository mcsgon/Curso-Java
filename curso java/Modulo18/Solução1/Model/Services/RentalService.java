package Modulo18.Solução1.Model.Services;

import java.time.Duration;

import Modulo18.Solução1.Model.Entities.CarRental;
import Modulo18.Solução1.Model.Entities.Invoice;

public class RentalService {
    private Double  pricePerHour;
    private Double PricePerDay;
    private TaxService taxService;
    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        PricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental ){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60.0;
        double basicPayment;


        if(hours<=12){
            basicPayment=pricePerHour*Math.ceil(hours); 
        }
        else{
            basicPayment=PricePerDay*Math.ceil(hours/24);
        }
        double tax =taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));

       

    }


}
