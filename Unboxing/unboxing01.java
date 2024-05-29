package Unboxing;
import java.util.Scanner;
public class unboxing01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 30;

        Object obj = x;

        System.out.println(obj);

        /* Unboxing: É o processo de conversão de um objeto
        tipo referência para um objeto tipo valor compatível.*/

        int y = (int) obj;

        System.out.println(y);

        scanner.close();
    }
    
}
