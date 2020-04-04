package Lab3;

public class QuantTicket extends Ticket {
    Quant quant;

    @Override
    public void use() {
        if (balance > 0) {
            this.balance--;
            System.out.println("Успешная оплата");
        } else {
            throw new RuntimeException("Недостаточно средств");
        }
    }

    @Override
    public int getPrice() {
        return quant.getPrice();
    }

    public QuantTicket(boolean isPrivilage, Quant quant) {
        super(isPrivilage);
        this.quant = quant;
        balance = quant.getQuantity();
    }
}
