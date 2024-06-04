import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;
import entidade01.Funcionario;
public class list03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Quantos funcionários seram registrados? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + i + ": ");

            System.out.print("Id: ");
            int id = scanner.nextInt();
            while (temId(list, id)) {
                System.out.print("Id já selecionado.Tente novamente: ");
                id = scanner.nextInt();
            }

            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            list.add(new Funcionario(id, nome, salario));
        }

        System.out.println();
        System.out.print("Informe o Id do funcionário que tera aumento salarial: ");
        int id = scanner.nextInt();
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (func == null) {
            System.out.println("Esse id não existe. ");
        }
        else {
            System.out.print("Coloque a porcentagem: ");
            double porcentagem = scanner.nextDouble();
            func.aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }
        
        scanner.close();
    }

    private static boolean temId(List<Funcionario> list, int id) {
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }    
}
