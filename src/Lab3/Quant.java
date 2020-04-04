package Lab3;

public enum Quant {
    FOUR(4, 30),
    TEN(10, 70),
    TWENTY(20, 130);

    private int quantity;
    private int price;

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    Quant(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

}
