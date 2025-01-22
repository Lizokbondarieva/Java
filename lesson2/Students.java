package lesson2;

import java.util.ArrayList;
import java.util.Scanner;

class Students {
    String firstName;
    String lastName;
    String StudentID;
    ArrayList<Integer> grades = new ArrayList<>();
    double result = 0;
    int i;

    void addGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть оцінку: ");
        int a = scanner.nextInt();
        grades.add(a);
    }

    void calculateAverageGrade() {

        for (i = 0; i < grades.size(); i++) {
            result = result + grades.get(i);
            System.out.println("Среднее значение: " + result / grades.size());
        }
    }

    void displayInfo() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(StudentID);

    }

    public static void main(String[] args) {
        Students mystudents = new Students();
        mystudents.lastName = "Bondarieva";
        mystudents.firstName = "Liza";
        mystudents.StudentID = "1234";
        mystudents.addGrade();
        mystudents.addGrade();
        mystudents.addGrade();
        mystudents.calculateAverageGrade();
        mystudents.displayInfo();

    }
}