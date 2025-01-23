package lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name; // — имя студента.
    int age; // — возраст студента.
    double grade; // — средний балл.
    String faculty; // — факультет студента.

    public Student(String name, int age, double grade, String faculty) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    public static class StudentManagement {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("Виберіть пункт меню: \n1-Показати всіх, 2-Додати студента, 3-Знайти студента, 4-видалити студента, 5-Завершити програму");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера после ввода числа

                switch (choice) {
                    case 1:
                        // Показать всех студентов
                        if (students.isEmpty()) {
                            System.out.println("Список студентів пустий.");
                        } else {
                            for (Student s : students) {
                                System.out.println(s);
                            }
                        }
                        break;

                    case 2:
                        // Добавить нового студента
                        System.out.print("Введите имя: ");
                        String name = scanner.nextLine();
                        System.out.print("Введите возраст: ");
                        int age = scanner.nextInt();
                        System.out.print("Введите средний балл: ");
                        double grade = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Введите факультет: ");
                        String faculty = scanner.nextLine();

                        students.add(new Student(name, age, grade, faculty));
                        System.out.println("Студент добавлен.");
                        break;

                    case 3:
                        // Найти студентов по критериям
                        System.out.println("Критерии поиска:");
                        System.out.print("Средний балл выше (введите значение или -1 для пропуска): ");
                        double minGrade = scanner.nextDouble();
                        System.out.print("Минимальный возраст (введите значение или -1 для пропуска): ");
                        int minAge = scanner.nextInt();
                        System.out.print("Максимальный возраст (введите значение или -1 для пропуска): ");
                        int maxAge = scanner.nextInt();
                        scanner.nextLine(); // Очистка буфера
                        System.out.print("Факультет (оставьте пустым для пропуска): ");
                        String searchFaculty = scanner.nextLine();

                        boolean found = false; // Флаг для проверки найденных студентов
                        for (Student s : students) {
                            boolean matches = minGrade == -1 || !(s.grade <= minGrade);
                            if (minAge != -1 && s.age < minAge) {
                                matches = false;
                            }
                            if (maxAge != -1 && s.age > maxAge) {
                                matches = false;
                            }
                            if (!searchFaculty.isEmpty() && !s.faculty.equalsIgnoreCase(searchFaculty)) {
                                matches = false;
                            }

                            if (matches) {
                                System.out.println(s);
                                found = true; // Устанавливаем флаг
                            }
                        }
                        if (!found) {
                            System.out.println("Нет студентов, соответствующих критериям.");
                        }
                        break;

                    case 4:
                        // Удалить студента
                        System.out.print("Введите имя студента для удаления: ");
                        String deleteName = scanner.nextLine();

                        boolean removed = students.removeIf(s -> s.name.equalsIgnoreCase(deleteName));
                        if (removed) {
                            System.out.println("Студент удалён.");
                        } else {
                            System.out.println("Студент с таким именем не найден.");
                        }
                        break;

                    case 5:
                        // Завершить программу
                        running = false;
                        System.out.println("Программа завершена.");
                        break;

                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        break;
                }
            }
            scanner.close();
        }
    }
}
