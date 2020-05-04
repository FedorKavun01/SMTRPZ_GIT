package Lab3;

import java.util.Date;

public class TimeTicket extends Ticket {
    private Date dateTo;
    Day day;

    @Override
    public String toString() {
        return "TimeCard{" +
                " id=" + this.getId() +
                " isBlocked=" + this.isBlocked() +
                " dateTo=" + dateTo +
                ", isPrivilage=" + privilage +
                '}';
    }

    public TimeTicket(boolean isPrivilage, Day day) {
        super(isPrivilage);
        this.day = day;
        dateTo = getDateRegistration();
        dateTo.setDate(dateTo.getDate() + day.getDays());
        balance = -1;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void use() {
        Date currentDate = new Date();
        if (dateTo.compareTo(currentDate) >= 0) {
            System.out.println("Успешная оплата.");
        } else {
            throw new RuntimeException("Карта просрочена");
        }
    }
}

