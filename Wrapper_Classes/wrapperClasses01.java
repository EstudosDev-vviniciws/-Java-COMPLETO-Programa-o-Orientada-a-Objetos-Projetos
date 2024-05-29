package Wrapper_Classes;
import java.util.Scanner;
public class wrapperClasses01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 30;

        Integer obj = x;

        /* Com o Wrapper Classes, podemos usar o "Integer"
        ao inves de "Object", que assim fica equivalente
        aos tipos primitivos, que no caso nesse código 
        é o "int" acima. */

        System.out.println(obj);

        int y = obj;

        System.out.println(y);

        scanner.close();
    }
    
}
              
                 /*COMENTÁRIO EXTRA: */

        /* E vale lembrar que o Wrapper Classes aceitam
        valor null e usufruem dos recursos OO. 
        
        Exemplo:
        
        public class Produto {
            
            public String nome;
            public Int preco;
            public Integer dataNascimento;
        }*/
