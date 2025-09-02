import java.util.*;
public class number_guessinggame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Choose range :- ");
        System.out.print("Choose start range:- ");
        int first  = sc.nextInt();
        System.out.print("Choose end range:- ");
        int end = sc.nextInt();
        int start = 1;
        while(start ==1){
            System.out.printf("Please choose a number between %d and %d\n",first,end);
            int user_input = sc.nextInt();
            int computer_input = rd.nextInt(first , end);
            if (user_input == computer_input){
                System.out.println("YAY!! YOU GUESSED RIGHT 🎊");
            }
            else{
                System.out.println("YOU LOOSE COMPUTER WIN 😂");
                System.out.println("Press 1 to continue and 0 to exit");
                System.out.print("Choose:- ");
                start  =sc.nextInt();
            }
        }
    }
}