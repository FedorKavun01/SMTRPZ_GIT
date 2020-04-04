package Lab3;

public class Stile {
    public void work(Ticket ticket) {
        if (TicketControl.cards.containsValue(ticket) && !ticket.isBlocked()) {
            if (ticket.privilage) {
                System.out.println("Документы, пожалуйста");
            }
            try {
                ticket.use();
                TicketControl.successes(ticket);
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                TicketControl.fail(ticket);
            }
        } else {
            System.err.println("Ваша карта не существует или заблокирована");
        }
    }
}
