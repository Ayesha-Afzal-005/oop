import java.util.Scanner;

public class ScannerExp{   
           
           static String USERNAME="Ayesha"; 
           static String PASSWORD="12345";

     public static void main(String[] args){  
           Scanner sc=new Scanner(System.in);
        
           System.out.print("Enter the User name:");
           String inputUsername = sc.next();

           System.out.print("Enter the Password:");
           String inputPassword = sc.next();
  
           if (USERNAME.equals(inputUsername) && PASSWORD.equals(inputPassword)){
                     System.out.print("You entered correct Username and Password...");
} else{ 
                     System.out.print("You entered Wrong Username and Password...");
}
}
}