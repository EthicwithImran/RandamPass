import java.util.*;
public class RandamPass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name,dob,sym;
        System.out.println("Enter Your First Name : ");
        name=s.next();
        System.out.println("Enter Your Date Of Birth In format of DD/MM/YYYY :");
        dob=s.next();
        System.out.println("Enter the Symbol like ! @ # $ %   :  ");
        sym=s.next();
        
        String Password=name.substring(0, 4)+dob.substring(0, 2)+sym.substring(0, 1);
        System.out.println("Password is :"+Password);

    }
    
}
