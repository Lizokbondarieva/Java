package lesson3;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть суму= ");
        double sum = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Клиент VIP (true-1 /false-0): ");
        int a = scanner2.nextInt();
        System.out.println("Сумма покупки до скидки:" + sum);
        double b;
        if (a==1){
            double c = (sum*0.05);
            sum -= c;
            System.out.println("Дополнительная скидка для VIP: 5%:"+c+" руб.");

        }
        if (sum<1000)
    {
        System.out.println("Итоговая сумма к оплате:"+sum+" руб.");
    }
    else if (sum > 1000 && sum <= 5000) {
               b = (sum*0.05);
        System.out.println("Скидка: 5%"+b);
        sum -= b;
        System.out.println("Итоговая сумма к оплате:"+sum+" руб.");
    }
    else if (sum > 5000 && sum <= 10000) {
        b = (sum*0.1);
        System.out.println("Скидка: 10%"+b);
        sum -= b;
        System.out.println("Итоговая сумма к оплате:"+sum+" руб.");
    }
    else if (sum > 10000){
        b = (sum*0.15);
        System.out.println("Скидка: 15%"+b);
        sum -= b;
        System.out.println("Итоговая сумма к оплате:"+sum+" руб.");
    }

    }
}
