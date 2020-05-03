package Lab4;

import java.util.List;

public class PoliceCar extends Vehicle<Policeman> {

    private static int maxPass = 3;

    @Override
    public int getMaxPass() {
        return maxPass;
    }
}
