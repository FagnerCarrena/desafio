
import java.util.Scanner;
public class Desafio_02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();


            System.out.println("Sequência de Fibonacci até o número " + numero + ":");
            int a = 0, b = 1, c;
            System.out.print(a + ", " + b);
            while (b <= numero) {
                c = a + b;
                System.out.print(", " + c);
                a = b;
                b = c;
            }
            System.out.println();


            boolean pertence = pertenceSequenciaFibonacci(numero);
            if (pertence) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }


            scanner.close();
        }

        public static boolean pertenceSequenciaFibonacci(int numero) {
            int a = 0, b = 1, c;
            while (b <= numero) {
                if (b == numero) {
                    return true;
                }
                c = a + b;
                a = b;
                b = c;
            }
            return false;
        }
    }



