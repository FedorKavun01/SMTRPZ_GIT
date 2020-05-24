package Lab4;

import java.util.HashSet;
import java.util.Set;

public abstract class Vehicle<T extends Person> {
    Set<Person> passangers;

    public Vehicle() {
        this.passangers = new HashSet<>();
    }

    public abstract int getMaxPass();

    public int getCurrentPass() {
        return passangers.size();
    }

    void getIn(T... people) {
        for (T person : people) {
            passangers.add(person);
            if (passangers.size() > getMaxPass()) {
                throw new RuntimeException("Слишком много людей");
            }
        }
    }

    public void getOut(T... people) {
        for (T person : people) {
            try{
                getOut(person);
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void getOut(T person) {
        if (passangers.contains(person)) {
            passangers.remove(person);
        } else {
            throw new RuntimeException("Человека здесь нет");
        }
    }
}
