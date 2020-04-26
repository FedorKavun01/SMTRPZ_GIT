package Lab3;

public enum Day {
    DAY(1, 8),
    WEEK(7, 50),
    MONTH(30, 200);

    Day(int days, int price) {
        this.days = days;
        this.price = price;
    }

    private int days;

    public int getDays() {
        return days;
    }

    public int getPrice() {
        return price;
    }

    private int price;
}
