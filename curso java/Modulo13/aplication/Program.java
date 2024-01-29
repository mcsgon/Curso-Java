package aplication;

import aplication.entities.Order;
import aplication.entities.orderStatus;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Order order=new Order(1800, new Date(), orderStatus.PENDING_PAYMENT);
        System.out.println(order);
        orderStatus os1 = orderStatus.DELIVERED;
        orderStatus os2 = orderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}