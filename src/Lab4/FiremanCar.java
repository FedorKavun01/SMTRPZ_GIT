package Lab4;

public class FiremanCar extends Vehicle<Fireman> {
    private static int maxPass = 5;

    @Override
    public int getMaxPass() {
        return maxPass;
    }
}
