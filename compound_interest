import java.util.Scanner;

public class compound_interest {
        public static void main(String[] args) {
            double principal , rate,amount;
            int timesCompound,years;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the principal amount:- ");
            principal = s.nextDouble();
            System.out.println("Enter the interest:- ");
            rate  = s.nextDouble()/100;
            System.out.println("Enter the # of times compounded per year:- ");
            timesCompound = s.nextInt();
            System.out.println("Enter the number of years:- ");
            years = s.nextInt();
            amount = principal * Math.pow(1+rate/timesCompound,timesCompound*years);
            System.out.println("the amount really:- "+ amount);

            s.close();

        }
    }
