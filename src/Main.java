import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundou");
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ahora numero dame favor porfa");
        int numero = keyboard.nextInt();
        System.out.println(numero);
        keyboard.close();
    }
    
}
