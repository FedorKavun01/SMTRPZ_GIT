package Lab4;

public class Taxi extends Vehicle<Person> {
    private static int maxPass = 3;

    @Override
    public int getMaxPass() {
        return maxPass;
    }
}
