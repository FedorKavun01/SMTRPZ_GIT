package Lab7;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Calculation implements Callable<Integer> {

    public static final double R = 1;
    public static final double S = Math.PI / 4;
    public static final int POINTS = 1000000000;
    public final int CORES;

    public Calculation(int cores) {
        CORES = cores;
    }

    @Override
    public Integer call() throws Exception {
        double x;
        double y;
        double distance;
        int success = 0;
        Random rand = new Random();

        for (int i = 0; i < POINTS/CORES; i++) {
            x = rand.nextDouble();
            y = rand.nextDouble();
            distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            if (distance <= R) {
                success++;
            }
        }

        return success;
    }

    public double calculate() throws Exception {
        Date start = new Date();
        ExecutorService exec = Executors.newFixedThreadPool(CORES);
        Future<Integer>[] futures = new Future[CORES];

        for (int i = 0; i < CORES; i++) {
            futures[i] = exec.submit(this);
        }

        exec.shutdown();

        int successful = 0;

        for (Future<Integer> partRes : futures) {
            successful += partRes.get();
        }

        double result = ((double)successful/(double) POINTS) * 4;
        Date finish = new Date();

        System.out.println("Time: " + (finish.getTime() - start.getTime()) + "ms");
        System.out.println("Cores: " + CORES);
        System.out.println("Iterations: " + POINTS);
        System.out.println("PI: " + result);

        return result;
    }
}
