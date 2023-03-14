import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        double[] weight1 = {1.57, 7.654, 9.986};
        System.out.println(weight1[0]);
        System.out.println(weight1[1]);
        System.out.println(weight1[2]);
        int[] years = {2021, 2022, 2023};
        System.out.println(years[0]);
        System.out.println(years[1]);
        System.out.println(years[2]);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.print(weight[0] + "," + weight[1] + "," + weight[2]);
        System.out.println();
        double[] weight1 = {1.57, 7.654, 9.986};
        System.out.print(weight1[0] + ", " + weight1[1] + ", " + weight1[2]);
        System.out.println();
        int[] years = {2021, 2022, 2023};
        System.out.print(years[0] + "," + years[1] + "," + years[2]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.print(weight[2] + "," + weight[1] + "," + weight[0]);
        System.out.println();
        double[] weight1 = {1.57, 7.654, 9.986};
        System.out.print(weight1[2] + ", " + weight1[1] + ", " + weight1[0]);
        System.out.println();
        int[] years = {2021, 2022, 2023};
        System.out.print(years[2] + "," + years[1] + "," + years[0]);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] weights = {1,2,3};
        for (int i = 0; i < weights.length; i++) {
            weights [0] = weights[0] + 1;
            weights [2]= weights[0] ;
            System.out.println(weights[i]);
        }
    }
}