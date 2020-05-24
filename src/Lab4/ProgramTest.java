package Lab4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {


    @Test
    void okTaxiTestGetIn() {
        Set<Person> expectedSet = new HashSet<>();
        boolean expected = true;


        Taxi taxi = new Taxi();
        Person person = new Person();
        Fireman fireman1 = new Fireman();
        Policeman policeman1 = new Policeman();
        taxi.getIn(fireman1, policeman1, person);
        expectedSet.add(fireman1);
        expectedSet.add(policeman1);
        expectedSet.add(person);
        boolean actual = expectedSet.equals(taxi.passangers);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void okFiremanCarTestGetIn() {
        Set<Person> expectedSet = new HashSet<>();
        boolean expected = true;


        FiremanCar firemanCar = new FiremanCar();
        Fireman fireman1 = new Fireman();
        Fireman fireman2 = new Fireman();
        firemanCar.getIn(fireman1, fireman2);
        expectedSet.add(fireman1);
        expectedSet.add(fireman2);
        boolean actual = expectedSet.equals(firemanCar.passangers);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void okPoliceCarTestGetIn() {
        Set<Person> expectedSet = new HashSet<>();
        boolean expected = true;

        PoliceCar policeCar = new PoliceCar();
        Policeman policeman1 = new Policeman();
        Policeman policeman2 = new Policeman();
        policeCar.getIn(policeman1, policeman2);
        expectedSet.add(policeman1);
        expectedSet.add(policeman2);
        boolean actual = expectedSet.equals(policeCar.passangers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void exceptionBusGetInTest() {
        Bus bus = new Bus();
        Person[] people = new Person[bus.getMaxPass() + 1];
        for (int i = 0; i < bus.getMaxPass() + 1; i++) {
            people[i] = new Person();
        }
        Assertions.assertThrows(RuntimeException.class, () -> bus.getIn(people));
    }

    @Test
    void exceptionTaxiGetInTest() {
        Taxi taxi = new Taxi();
        Assertions.assertThrows(RuntimeException.class, () -> taxi.getIn(new Person(), new Policeman(), new Fireman(), new Person()));
    }

    @Test
    void okTaxiGetOutTest() {
        Set<Person> expectedSet = new HashSet<>();
        boolean expected = true;

        Taxi taxi = new Taxi();
        Person person = new Person();
        Policeman policeman = new Policeman();
        Fireman fireman = new Fireman();
        taxi.getIn(person);
        taxi.getIn(policeman);
        taxi.getIn(fireman);
        taxi.getOut(person);
        taxi.getOut(fireman);
        expectedSet.add(policeman);
        boolean actual = expectedSet.equals(taxi.passangers);
        Assertions.assertEquals(expected, actual);
    }
}