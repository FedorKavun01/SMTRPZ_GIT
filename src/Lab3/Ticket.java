package Lab3;

import java.util.Date;

public abstract class Ticket {

    public static int count = 0;

    public abstract int getPrice();


    private int id;
    private Date dateRegistration;
    public boolean privilage;
    private boolean isBlocked;
    public int balance;

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", dateRegistration=" + dateRegistration +
                ", privilage=" + privilage +
                ", isBlocked=" + isBlocked +
                ", balance=" + balance +
                '}';
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public Ticket(boolean privilage) {
        this.id = count++;
        this.privilage = privilage;
        this.isBlocked = false;
        dateRegistration = new Date();
    }

    public int getId() {
        return id;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public abstract void use();

}
