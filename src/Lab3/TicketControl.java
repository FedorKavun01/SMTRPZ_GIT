package Lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketControl {
    public static Map<Integer, Ticket> cards = new HashMap<>();
    public static List<Ticket> fail = new ArrayList<>();
    public static List<Ticket> successful = new ArrayList<>();

    public static void block(Ticket ticket) {
        ticket.setBlocked(true);
    }

    public static void unblock(Ticket ticket) {
        ticket.setBlocked(false);
    }

    public static Ticket regist(Ticket ticket) {
        cards.put(ticket.getId(), ticket);
        int price = ticket.privilage ? ticket.getPrice() / 2 : ticket.getPrice();
        info(ticket.getId());


        System.out.println(ticket + " был продан за " + price);
        return ticket;
    }

    public static void info(int id) {
        if (cards.containsKey(id)) {
            Ticket ticket = cards.get(id);
            System.out.println("Информация: " + ticket);
        } else {
            System.out.println("Нет карты с таким id " + id);
        }
    }

    public static void fail(Ticket ticket) {
        fail.add(ticket);
    }

    public static void successes(Ticket ticket) {
        successful.add(ticket);
    }
}
