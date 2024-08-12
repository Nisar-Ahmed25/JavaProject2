package JavaProject2;
import java.util.*;

public class LogAccount {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.err.print("Enter your Email");
    String email = sc.nextLine();

    System.err.print("Enter your Password");
    String password = sc.nextLine();
  
        if (email.compareTo("nisarahmed4825@gmail.com")==0 &&password.compareTo("nisarali123")==0){

            System.out.println("Wellcom Nisar Ahmed.");
        }else {
            System.out.println("Login field!!");
        }

    }
    
}
