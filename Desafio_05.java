import java.util.Scanner;

public class Desafio_05 {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma string para inverter: ");
        String original = scanner.nextLine();


        String invertida = mudaString(original);


        System.out.println("String invertida: " + invertida);


        scanner.close();
    }


    public static String mudaString(String original) {

        char[] caracteres = original.toCharArray();


        String invertida = "";


        for (int i = caracteres.length - 1; i >= 0; i--) {

            invertida += caracteres[i];
        }


        return invertida;


    }
}
