package lesson2;

class Car {
    String make;//марка
    String model;//модель
    int year; //рік випуску
    double mileage;// пробіг

    void increaseMileage(){
        double additionalMileage=10;
        mileage += additionalMileage;
    }
    void displayInfo(){
        System.out.println("make: "+ make);
        System.out.println("model: "+ model);
        System.out.println("year:" + year);
        System.out.println("mileage" + mileage);
    }
}
class CarDemo {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.make = "Audi";
        mycar.model = "hjdk";
        mycar.year = 2023;
        mycar.mileage = 3000;
        mycar.increaseMileage();
        mycar.displayInfo();

    }
}