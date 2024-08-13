import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = inputNumeros();
        imprimeDistancias(numeros);
    }

    public static List<Integer> inputNumeros(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int primeiroNumero;
        int segundoNumero;
        do{
            System.out.println("Insira o primeiro número");
            primeiroNumero = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Insira o segundo número (Deve ser maior que o primeiro)");
            segundoNumero = scanner.nextInt();

            if(primeiroNumero >= segundoNumero){
                System.out.println("O segundo número deve ser maior que o primeiro");
            }
        }while(primeiroNumero >= segundoNumero);
        scanner.close();
        numeros.add(primeiroNumero);
        numeros.add(segundoNumero);
        return numeros;
    }

    public static void imprimeDistancias(List<Integer> numeros){
        int limite = numeros.get(1) - numeros.get(0);
        for(int i = 1; i <= limite; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
