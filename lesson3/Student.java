package lesson3;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name; // — имя студента.
    int age; // — возраст студента.
    double grade; // — средний балл.
    String faculty; // — факультет студента.

    Student(String name, int age, double grade, String faculty) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.faculty = faculty;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    public class StudentManagement {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            int a;
            while (running) {
                System.out.println("Виберіть пункт меню: \n1-Показати всіх, 2-Додати студента, 3-Знайти студента, 4-видалити студента, 5-Завершити програму");
                a = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера после ввода числа

                switch (a) {
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
                        System.out.println("Критерии поиска:");
                        System.out.print("Средний балл выше (введите значение или -1 для пропуска): ");
                        double minGrade = scanner.nextDouble();
                        System.out.print("Минимальный возраст (введите значение или -1 для пропуска): ");
                        int minAge = scanner.nextInt();
                        System.out.print("Максимальный возраст (введите значение или -1 для пропуска): ");
                        int maxAge = scanner.nextInt();
                        scanner.nextLine(); // очистка буфера
                        System.out.print("Факультет (оставьте пустым для пропуска): ");
                        String searchFaculty = scanner.nextLine();
                        for (Student s : students) {
                            boolean matches = true;
                            if (minGrade != -1 && s.grade <= minGrade) {
                                matches = false;
                            }
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
                            }
                        }
                        break;
                    case 4:
                        System.out.print("Введите имя студента для удаления: ");
                        String deleteName = scanner.nextLine();

                        boolean found = false;
                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).name.equalsIgnoreCase(deleteName)) {
                                students.remove(i);
                                found = true;
                                System.out.println("Студент удалён.");
                                break;
                            }
                        }
                        if (!found) {
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
        }
    }
}