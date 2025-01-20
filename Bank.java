public class Bank {
//    Створіть клас Bank, який має наступні поля:
    String name;
    double balance;
    double interestRate;//    Додайте до класу наступні методи:
     void deposit(double amount){
         balance += amount;
         System.out.println(balance);
     } //- збільшує баланс на задану суму.
     void withdraw(double amount){
         balance -= amount;
         System.out.println(balance);
     } //- зменшує баланс на задану суму, якщо на рахунку достатньо грошей.
    void applyInterest() {
        balance +=( balance * interestRate);
      }//- збільшує баланс на відсоткову ставку.
    void displayInfo(){
        System.out.println(name);
        System.out.println("Balance= "+ balance);
    } //- виводить інформацію про банк, включаючи баланс і відсоткову ставку.
    public static void main(String[] args) {
     Bank mybank = new Bank();
     mybank.balance=100;
     mybank.name= "Liza";
     mybank.interestRate = 3;
     mybank.deposit(4);
     mybank.withdraw(5);
     mybank.applyInterest();
     mybank.displayInfo();}
}
