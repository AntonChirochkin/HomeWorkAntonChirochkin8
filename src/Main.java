import java.util.*;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;


        double[] gram = {1.57d, 7.654d, 9.986d};


        int[] months = new int[12];

        months[0] = 1;
        int january = months[0];
        months[1] = 2;
        int february = months[1];
        months[2] = 3;
        int march = months[2];
        months[3] = 4;
        int april = months[3];
        months[4] = 5;
        int may = months[4];
        months[5] = 6;
        int june = months[5];
        months[6] = 7;
        int jule = months[6];
        months[7] = 8;
        int august = months[7];
        months[8] = 9;
        int september = months[8];
        months[9] = 10;
        int october = months[9];
        months[10] = 11;
        int november = months[10];
        months[11] = 12;
        int december = months[11];
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        System.out.println(Arrays.toString(apple));

        double[] gram = {1.57d, 7.654d, 9.986d};
        System.out.println(Arrays.toString(gram));

        int[] months = new int[12];
        months[0] = 1;
        int january = months[0];
        months[1] = 2;
        int february = months[1];
        months[2] = 3;
        int march = months[2];
        months[3] = 4;
        int april = months[3];
        months[4] = 5;
        int may = months[4];
        months[5] = 6;
        int june = months[5];
        months[6] = 7;
        int jule = months[6];
        months[7] = 8;
        int august = months[7];
        months[8] = 9;
        int september = months[8];
        months[9] = 10;
        int october = months[9];
        months[10] = 11;
        int november = months[10];
        months[11] = 12;
        int december = months[11];
        System.out.println(Arrays.toString(months));
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] apple = new int[3];
        apple[0] = 3;
        apple[1] = 2;
        apple[2] = 1;
        System.out.println(Arrays.toString(apple));

        double[] gram = {9.986d, 7.654d, 1.57d};
        System.out.println(Arrays.toString(gram));

        int[] months = new int[12];
        months[0] = 12;
        int december = months[0];
        months[1] = 11;
        int november = months[1];
        months[2] = 10;
        int october = months[2];
        months[3] = 9;
        int september = months[3];
        months[4] = 8;
        int august = months[4];
        months[5] = 7;
        int jule = months[5];
        months[6] = 6;
        int june = months[6];
        months[7] = 5;
        int may = months[7];
        months[8] = 4;
        int april = months[8];
        months[9] = 3;
        int march = months[9];
        months[10] = 2;
        int february = months[10];
        months[11] = 1;
        int january = months[11];
        System.out.println(Arrays.toString(months));
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        for (int i = 0; i < 3; i++) {
            apple[0]++;
            apple[1] = 2 + 1;
            apple[2] = 3 + 1;
            if (apple[i] % 2 == 0) {
                System.out.println(apple[i]);

            }
        }
    }
}