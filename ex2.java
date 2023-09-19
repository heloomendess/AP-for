import java.util.Scanner;

//Exemplo do laço for para acumular valores
public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o item " + i);
            n = input.nextInt();
            soma = soma + n;
        }
        System.out.println("Total: " + soma);
    }
}
