package Lab7;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Program {


    public static void main(String[] args) throws Exception {
        Calculation calculation1 = new Calculation(8);
        Calculation calculation2 = new Calculation(100000);
        Calculation calculation3 = new Calculation(1);
        System.out.println("8 cores");
        calculation1.calculate();

        System.out.println("--------------------------------------");

        System.out.println("10000 cores");
        calculation2.calculate();

        System.out.println("--------------------------------------");

        System.out.println("1 core");
        calculation3.calculate();
    }




}
