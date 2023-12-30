import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner( System.in );
        while( true ){
            System.out.println("Ingrese su email:");
            String email = console.nextLine();
            if( email.equals("toor") ){
                System.out.println("Este usuario está baneado.");
                continue;
            }
            System.out.println("Ingrese su contraseña");
            String password = console.nextLine();
            if( email.equals("root") && password.equals("1234") ){
                System.out.println("Welcome to la interfaz.");
                break;
            }
        }
    }
}