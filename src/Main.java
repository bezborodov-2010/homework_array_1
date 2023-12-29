import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int[] words = new int[3];
        double[] weight = {1.57, 7.654, 9.986};
        int[] dogs = {35, 36, 85, 45, 0, 0, 0};

        System.out.println("Задача 2");

        words[0] = 25;
        words[1] = 15;
        words[2] = 5;
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(dogs));

        System.out.println("Задача 3");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println( );
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println( );
        for (int i = dogs.length - 1; i >= 0; i--) {
            System.out.print(dogs[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println( );
        System.out.println("Задача 4");

        int[] arr = {1, 2, 3, 7, 13};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 1;
                System.out.print(arr[i] + " ");
            }

        }
    }
}