package examples;


import java.util.concurrent.ThreadLocalRandom;


public class ArrayExampleTwo {

    final static int NUMBER = 2;

    public static void run() {
        System.out.println("Example  Start " + NUMBER);


        float[] temperaturesWeek = new float[7];
        for (int i = 0; i < temperaturesWeek.length; i++) {
            temperaturesWeek[i] = (float) ThreadLocalRandom.current().nextDouble(-10, 20);
        }
        String[] weekDays = {"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};

        for (int i = 0; i < weekDays.length; i++) {
            System.out.printf("%s:%9.1f%n", weekDays[i], temperaturesWeek[i]);

        }


        System.out.println();
        System.out.println();
        //max///
        float max = temperaturesWeek[6];
        for (int i = 0; i < temperaturesWeek.length; i++) {
            if (temperaturesWeek[i] > max) {
                max = temperaturesWeek[i];
            }

        }
        System.out.printf("The max temerature is %1.1f\n",max);


        System.out.println("Example  End " + NUMBER);
    }
}
