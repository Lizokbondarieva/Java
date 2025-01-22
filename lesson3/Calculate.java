package lesson3;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число= ");
        int a = scanner.nextInt();
        int b;
    for (int n=1; n<11; n++){
        b=n*a;
        System.out.println(a +"*"+ n+ "="+b);
    }
    }
}