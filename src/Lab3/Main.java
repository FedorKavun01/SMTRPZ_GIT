package Lab3;

public class Main {
    public static void main(String[] args) {
        MoneyTicket moneyTicket = new MoneyTicket(50);
        TimeTicket timeTicket = new TimeTicket(true, Day.MONTH);
        QuantTicket quantTicket = new QuantTicket(true, Quant.TEN);

        Ticket card1 = TicketControl.regist(moneyTicket);
        Ticket card2 = TicketControl.regist(timeTicket);
        Ticket card3 = TicketControl.regist(quantTicket);

        Stile stile = new Stile();
        stile.work(new MoneyTicket(10));
        stile.work(card1);
        stile.work(card2);
        stile.work(card3);
        TicketControl.block(card1);
        stile.work(card1);

        stile.work(card2);
        stile.work(card3);

        TicketControl.unblock(card1);
        stile.work(card1);
        stile.work(new MoneyTicket(10));

//        Если запустить код, вывод получается не по порядку, почему?
    }
}
