package Lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MainTest {
    @Test
    void okWorking() {
        Stile stile = new Stile();
        MoneyTicket moneyTicket = new MoneyTicket(50);
        TimeTicket timeTicket = new TimeTicket(true, Day.MONTH);
        QuantTicket quantTicket = new QuantTicket(true, Quant.TEN);

        Ticket ticket1 = TicketControl.regist(moneyTicket);
        Ticket ticket2 = TicketControl.regist(timeTicket);
        Ticket ticket3 = TicketControl.regist(quantTicket);

        stile.work(ticket1);
        stile.work(ticket2);
        stile.work(ticket3);


        List<Ticket> expected = new ArrayList<>();
        expected.add(moneyTicket);
        expected.add(timeTicket);
        expected.add(quantTicket);
        Assertions.assertEquals(expected, TicketControl.successful);
    }

    @Test
    void errorWorking() {
        Stile stile = new Stile();
        MoneyTicket moneyTicket = new MoneyTicket(0);
        TimeTicket timeTicket = new TimeTicket(true, Day.MONTH);
        QuantTicket quantTicket = new QuantTicket(true, Quant.TEN);

        Ticket ticket1 = TicketControl.regist(timeTicket);
        Ticket ticket2 = TicketControl.regist(moneyTicket);
        TicketControl.block(ticket1);

        stile.work(quantTicket);
        stile.work(ticket1);
        stile.work(ticket2);

        List<Ticket> expected = new ArrayList<>();
        expected.add(quantTicket);
        expected.add(timeTicket);
        expected.add(moneyTicket);

        Assertions.assertEquals(expected, TicketControl.fail);

    }

}