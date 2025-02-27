package main;
import util.PasswordValidator;
import user.UserManager;
import java.util.Scanner;
import java.io.console;
public class LoginSystem{
       public static void main(String[]args){
              Console console=System.console();
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter Username:");
              sc.next();
              System.out.println("Enter Password:");
              console.readPassword();
          if(UserManager.authenticate(username,password)){
                     System.out.println("Login Successful..."){
          }else{
                     System.out.println("Lgon not Successfull...")
}
}
}

}