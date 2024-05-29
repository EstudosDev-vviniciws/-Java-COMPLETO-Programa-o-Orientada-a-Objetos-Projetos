package Boxing;
import java.util.Scanner;
public class boxing01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Boxing:É o processo de conversão de um objeto tipo
        valor para um objeto tipo referência compatível. */
        
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        scanner.close();
    }
    
}
