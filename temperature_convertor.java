import java.util.*;
public class temperature_convertor {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("1. For celsius to fahrenheit  temperature\n2. For fahrenheit to celsius \n");
        System.out.print("Enter your  choice:- ");
        int choice  = sc.nextInt();
        if(choice ==1 ){
            System.out.print("Enter celsius Value:- ");
            double input = sc.nextDouble();
            System.out.println("Fahrenheit value is :- " + ((input*9/5)+32) + " F");
        }
        else{
            System.out.print("Enter fahrenheit  Value:- ");
            double input = sc.nextDouble();
            System.out.println("Celsius value is :- " + ((input-32)*5/9) + " C");
        }
    }
}