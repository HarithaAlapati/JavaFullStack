package com.airline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        TicketService ticketService = (TicketService) ((AbstractApplicationContext) context).getBean("ticketService");

        System.out.println(ticketService.confirmBooking("FL123", "USER456")); // Booking confirmed
        System.out.println(ticketService.confirmBooking("FL123", "USER789")); // Booking confirmed
        System.out.println(ticketService.confirmBooking("FL123", "USER999")); // Flight full
    }
}
