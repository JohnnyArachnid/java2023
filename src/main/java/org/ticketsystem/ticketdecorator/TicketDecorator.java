package org.ticketsystem.ticketdecorator;

import org.ticketsystem.Ticket;

// TODO dokończ implementację dekoratora
public abstract class TicketDecorator implements Ticket {
    public Ticket ticket;

    public TicketDecorator(Ticket decoratedTicket) {
        this.ticket = decoratedTicket;
        // TODO zwraca udekorowany bilet
    }

    public String getDescription() {
        return ticket.getDescription();
        // TODO zwraca opis udekorowanego biletu
    }

    public double getPrice() {
        return ticket.getPrice();
        // TODO zwraca opis udekorowanego biletu
    }
}
