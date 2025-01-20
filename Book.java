import java.util.Scanner;
public class Book {
//    Створіть клас Book, який має наступні поля:
  String title;// () - назва книги
   String author; // - автор книги
    int yearPublished; // - рік видання
   double price; // ціна книги

//    Додайте до класу наступні методи:
void   discountPrice(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введіть знижку= ");
    double discount = scanner.nextInt();
    price -=discount;
} //- зменшує ціну на задану суму.
 void  displayInfo() //- виводить інформацію про книгу, включаючи назву, автора, рік видання і ціну.
 {
     System.out.println("Info:");
     System.out.println(title);
     System.out.println(author);
     System.out.println(yearPublished);
     System.out.println(price);
 }
    public static void main(String[] args) {
    Book mybook = new Book();
    mybook.title="Coffe";
    mybook.author="Lizok";
    mybook.yearPublished = 2025;
    mybook.price=1000;
    mybook.discountPrice();
    mybook.displayInfo();
    }
}
