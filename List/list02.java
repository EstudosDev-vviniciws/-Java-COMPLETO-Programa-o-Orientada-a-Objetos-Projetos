import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class list02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Vini");
        list.add("Mendes");
        list.add("Alice");
        list.add("Luigi");
        list.add(2, "Humberto");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------");
        list.remove(3);
        list.removeIf(x -> x.charAt(0) == 'M');
        
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------");
        System.out.println("Index of Humberto: " + list.indexOf("Humberto"));

        System.out.println("------------");
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
        for (String x : resultado) {
            System.out.println(x);
        }

        System.out.println("---'-'--------");
        String nome = list.stream().filter(x -> x.charAt(0) == 'Y').findFirst().orElse(null);
        System.out.println(nome);
        scanner.close();
    }
    
}
