package For_Each;
import java.util.Scanner;
public class forEach01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vet = new String[] {"Mendes", "Primo", "Alice"};

        System.out.println("--------------");
        for (String obj : vet) {
            System.out.println(obj);
        }
        scanner.close();
    }
    
}
