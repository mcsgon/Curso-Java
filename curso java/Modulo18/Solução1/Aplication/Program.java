package Modulo18.Solução1.Aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Modulo18.Solução1.Model.Entities.CarRental;
import Modulo18.Solução1.Model.Entities.Vehicle;
import Modulo18.Solução1.Model.Services.BrazilTaxService;
import Modulo18.Solução1.Model.Services.RentalService;

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel=sc.nextLine();
        System.err.println("retirada (dd/mm/yyy hh/mm): ");
        LocalDateTime start=LocalDateTime.parse(sc.nextLine(),fmt);
        System.err.println("Retorno (dd/mm/yyy hh/mm): ");
        LocalDateTime finish=LocalDateTime.parse(sc.nextLine(),fmt);

        CarRental cr = new CarRental (start, finish, new Vehicle(carModel));

        System.out.println("Preço por hora: ");
        double pricePerHour=sc.nextDouble();
        System.out.println("Preço por dia: ");
        double pricePerDay=sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour,pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("Fatura: ");
        System.out.println("pagamento básico"+ cr.getInvoice().getBasicPayment());
        System.out.println("imposto: "+cr.getInvoice().getTax());
        System.out.println("Pagamento total: "+cr.getInvoice().getTotalPayment());
        sc.close();
    }
}
