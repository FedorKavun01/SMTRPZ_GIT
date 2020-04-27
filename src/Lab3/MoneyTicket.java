package Lab3;

public class MoneyTicket extends Ticket {
    public static int ticketPrice = 8;

    @Override
    public int getPrice() {
        return ticketPrice;
    }

    @Override
    public void use() {
        if (balance > ticketPrice) {
            balance -= ticketPrice;
            System.out.println("Успешная оплата");
        } else {
            throw new RuntimeException("Недостаточно средств");
        }
    }

    public MoneyTicket(int balance) {
        super(false);
        this.balance = balance;
    }
}
