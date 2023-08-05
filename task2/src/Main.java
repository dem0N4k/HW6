import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;


        // Узнаем наибольший вес череез if-else

        /*
        if (first > second && first > third) {
            greatest = first;
        }
        if (second > first && second > third) {
            greatest = second;
        }
        if (third > first && third > second) {
            greatest = third;
        }
        */

        // Узнаем наибольный вес через тенарные операторы


        // Узнаем средний вес
        average = ((first + second + third) / 3);

        // Узнаем наименьший вес

        if (first < second && first < third) {
            smallest = first;
        } else if (second < first && second < third) {
            smallest = second;
        } else if (third < first && third < second) {
            smallest = third;
        }



        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
