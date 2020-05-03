package Lab4;

public class Bus extends Vehicle<Person> {
    private static int max_pass = 50;

    @Override
    public int getMaxPass() {
        return max_pass;
    }
}
