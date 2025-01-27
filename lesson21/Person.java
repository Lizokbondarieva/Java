package lesson21;

class Person {
    private String name;// — имя.
    private int age;// — возраст.
    private int id;// — уникальный идентификатор.
    public static int totalPersons;// — общее количество объектов класса Person.

    //Добавьте статическое поле:
    Person(String name, int age, int id) {
        this.name = name;
        this.age = Math.max(age, 0); // Проверка возраста
        this.id = id;
        totalPersons++; // Увеличиваем общее количество объектов
    }

    Person() {
        this("Unknown", 18, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0); // Если возраст меньше 0, устанавливаем 0
    }

    public int getId() {
        return id;
    }

    public void printInfo() {// — выводит информацию о человеке (name, age, id) в консоль. Используйте ключевое слово this для доступа к полям объекта.
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
    }

    public static void printTotalPersons() {//— выводит общее количество объектов Person в консоль.
        System.out.println("Загальна кількість об'єктів" + totalPersons);
    }

    public boolean isOlderThan(int age) {
        return this.age > age;
    }//— возвращает true, если возраст текущего объекта больше переданного значения, иначе false.

    public static void main(String[] args) {
        Person myperson = new Person();
        myperson.setName("Liza");
        myperson.setAge(20);
        myperson.id = 123;
        myperson.printInfo();
        myperson.isOlderThan(myperson.age);
        Person p1 = new Person();
        p1.setName("Ivan");
        p1.setAge(24);
        p1.id = 345;
        p1.printInfo();
        Person p2 = new Person("Ola", 42, 541);
        p2.printInfo();
        Person.printTotalPersons();
    }

}