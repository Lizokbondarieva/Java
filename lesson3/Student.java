package lesson3;

import java.util.Scanner;

public class Student {
    static String name; // — имя студента.
    static int age; // — возраст студента.
    static double grade; // — средний балл.
    static String faculty; // — факультет студента.

    Student(String n, int a, double g, String f) {
        name = "nfme";
        age = 1;
        grade = 1;
        faculty = "fmif";
    }

    static void toStringa() {
        System.out.println("Student: " + name + age + grade + faculty);
    }

    public static void main(String[] args) {
              int a;
               do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Виберіть пункт меню: \n 1-Показати всіх, 2-Знайти студента, 3-видалити студента, 4-Завершити програму");
            a = scanner.nextInt();
        } while (a < 1 || a > 5);
switch (a){
    case 1:
        toStringa();
        break;
}


    }
    }
