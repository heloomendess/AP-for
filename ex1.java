import java.util.Scanner;
// Exemplo do laço de repetição "for"
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inicio: ");
        int inicio = input.nextInt();

        System.out.println("Fim: ");
        int fim = input.nextInt();

        for (int i = inicio; i < fim; i++) { // ((i+=2) é para aparecer apenas os números pares) e ((i++ é para acrescentar um numéro)
           if (i%2 == 0) { // (%) faz com que nesse tipo de código nos deixe mostrar na tela apenas os números pares da sequencia
            System.out.println("Item " + i);
           }
        }

    }
}
