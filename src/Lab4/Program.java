package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();
        PoliceCar policeCar = new PoliceCar();
        Policeman policeman = new Policeman();
        Policeman policeman1 = new Policeman();
        policeCar.getIn(policeman, policeman1);
        System.out.println(policeCar.passangers);
        System.out.println(policeCar.getCurrentPass());
        System.out.println(policeCar.getMaxPass());

        policeCar.getOut(policeman);
        System.out.println(policeCar.passangers);
        System.out.println(policeCar.getCurrentPass());


        PoliceCar policeCar1 = new PoliceCar();
        Policeman policeman2 = new Policeman();

        Fireman fireman = new Fireman();

        Taxi taxi = new Taxi();
        taxi.getIn(person, policeman, fireman);
        System.out.println(taxi.passangers);
        taxi.getOut(fireman);
        System.out.println(taxi.passangers);

        
    }
}
