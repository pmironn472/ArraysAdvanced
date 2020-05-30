package examples;

public class ArrayExampleOne {


    final static int NUMBER = 1;

    public static void run() {
        System.out.println("Example  Start " + NUMBER);
        //Hm 1)
        //array int[] <{ 50,-10,40,-30,20}
        // code (for,inf,new) --> integersNegative ,positive-->integersPositive

        int[] integers = {10, -20, 30, 40, -50};
        int[] integersNegative = new int[integers.length];
        int[] integersPositive = new int[integers.length];

        for (int i : integers) {

            System.out.println(i);
        }


        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < 0) {
                integersNegative[i] = integers[i];
            } else {
                integersPositive[i] = integers[i];
            }

        }
        System.out.println();
        System.out.println();

        System.out.println("The negative numbers of the integersNegative Array from array Integers are: ");

        for (int i = 0; i < integersNegative.length; i++) {

            if (integersNegative[i] != 0)
                System.out.println(integersNegative[i]);
        }
        System.out.println();
        System.out.println();

        System.out.println("The positive numbers of the integersPositive Array from array Integers are: ");

        for (int i = 0; i < integersPositive.length; i++) {
            if (integersPositive[i] > 0)
                System.out.println(integersPositive[i]);
        }


        System.out.println("Example  End " + NUMBER);
    }
}
