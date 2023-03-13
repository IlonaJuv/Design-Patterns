import java.io.*;
import java.util.Properties;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        //Or
        Random rand = new Random();
        int[] dataToBeSorted = new int[10000];

        for (int i = 0; i < dataToBeSorted.length; i++) {
            dataToBeSorted[i] = rand.nextInt(10000);
        }

        long startTime, endTime;

        Customer_Context context = new Customer_Context(new BubbleSort());
        startTime = System.currentTimeMillis();
        context.sort(dataToBeSorted);
        endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort Time: " + ((endTime - startTime)% 60) + " seconds");

        context.setStrategy(new SelectionSort());
        startTime = System.currentTimeMillis();
        context.sort(dataToBeSorted);
        endTime = System.currentTimeMillis();
        System.out.println("Selection Sort Time: " + ((endTime - startTime)% 60) + " seconds");

        context.setStrategy(new MergeSort());
        startTime = System.currentTimeMillis();
        context.sort(dataToBeSorted);
        endTime = System.currentTimeMillis();
        System.out.println("Merge Sort Time: " + ((endTime - startTime)% 60) + " seconds");

    }
}
