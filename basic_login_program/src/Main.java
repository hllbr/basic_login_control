
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int admittance = 3;
        String username ="@prince";
        String password ="123456";
        System.out.println("****************************************************");
        System.out.println("Welcometo LOGİN TEST PROGRAM");
        System.out.println("****************************************************");

        while(true){
        System.out.println("enter your username : ");
        String username_s = scn.nextLine();
        System.out.println("enter your password : ");
        String password_s = scn.nextLine();
        if(password.equals(password_s) && username.equals(username_s)){
            System.out.println("Welcome @prince");
            admittance = 3;
            System.out.println("Your login right has been reset " +admittance);
            //break;it is your choice to use
            
        }else if(!password.equals(password_s) && username.equals(username_s)){
            System.out.println("fault of password");
            admittance--;
            System.out.println("admittance : "+admittance);
            
        }else if(!username.equals(username_s)&& password.equals(password_s)){
            System.out.println("fault of username");
            admittance--;
            System.out.println("admittance : " +admittance);
        }else if(!username.equals(username_s)&& !password.equals(password_s)){
            
            System.out.println("username and password are incorrect");
            admittance--;
            System.out.println("admittance : " +admittance);

        }else{
            System.out.println("You made a wrong or wrong keying");
            admittance--;
            System.out.println("admittance : " +admittance);
        }
        if(admittance == 0){
            System.out.println("your right to enter is finished");
            break;
        }
        }
    }
    
}
