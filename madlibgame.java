import java.util.Scanner;
public class madlibgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective1,adjective2,adjective3,noun1,verb1;
        System.out.println("Enter correct words");
        System.out.println("Enter three adjectives  , noun and verb");
        adjective1 = scanner.nextLine();
        adjective2 =scanner.nextLine();
        adjective3=scanner.nextLine();
        noun1 = scanner.nextLine();
        verb1=scanner.nextLine();

        System.out.println("Today was just so " +adjective1);
        System.out.println("This is best " +verb1);
        System.out.println( noun1 + " is so great.");
        System.out.println(noun1 + " has very rich "+adjective3);
        scanner.close();

    }
}