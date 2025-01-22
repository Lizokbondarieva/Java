package lesson3;

public class Student {
    String name; // — имя студента.
    int age; // — возраст студента.
    double grade; // — средний балл.
    String faculty; // — факультет студента.
    Student (String n, int a, double g, String f){
        name = n;
        age = a;
        grade = g;
        faculty = f;
    }
    void toStringa(){
System.out.println("Student: "+ name +age +grade +faculty);
    }
}
