package Lab8;

public class LessMoneyException extends Exception {
    @Override
    public String getMessage() {
        return "Less money on your account";
    }
}
