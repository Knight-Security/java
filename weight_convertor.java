import java.util.*;
public class weight_convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to weight Convertor");
        System.out.print("Choose \n1. for lbs to kg\n2. for kg to lbs\n");
        System.out.print("Please enter your choice:- ");
        int a  = sc.nextInt();
        if(a==1){
            System.out.print("Enter lbs :- ");
            double input = sc.nextDouble();
            System.out.println("Converted value:- " + input*0.453592 + " kg");
        }
        else if (a==2){
            System.out.print("Enter kg :- ");
            double input = sc.nextDouble();
            System.out.println("Converted value:- " + input/0.453592 + " lbs");
        }
        else{
            System.out.println("Error! Please choose  again");
        }

    }
}
