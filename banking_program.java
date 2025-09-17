import java.util.*;
public class banking_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance =  100000;
        System.out.println("*******************************");
        System.out.println("BANKING SYSTEM");
        System.out.println("*******************************");
        int temp = 1;
        while(temp ==1) {
            System.out.println("1. for Display balance\n2. for deposit\n3. for withdraw\n4. for exit");
            System.out.println("Enter your choice:- ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> display_balance(balance);
                case 2 -> deposit(balance);
                case 3 -> withdraw(balance);
                default -> exit();
            }
        }
        sc.close();
    }
     static void display_balance( double balance){
        System.out.println("Your Current balance:- "+ balance );

    }
    static void deposit(double balance){
        Scanner sc  =  new Scanner(System.in);
        System.out.print("Amount that you want to deposit:- ");
        double amount = sc.nextDouble();
        balance+=amount;
        System.out.println("New Balance:- "+ balance);

    }
    static void withdraw( double balance){
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount that you want to withdraw:- ");
        double amount = sc.nextDouble();
        balance-=amount;
        System.out.println("New Balance:- " + balance);
    }
    static void exit(){
        return; break;
    }


}
