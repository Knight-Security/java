import java.util.*;
public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your e-mail id :- ");
        String email = sc.nextLine();
        if(email.contains("@")){
            String username  = email.substring(0,email.indexOf("@")-1);
            String domain = email.substring(email.indexOf("@")+1,email.length());
            System.out.println("Username :- " + username);
            System.out.println("Domain :- " + domain);
        }
       else{
            System.out.println("Not Valid Email Id");
        }
    }
}