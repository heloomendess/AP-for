import java.util.Scanner;
public class de1ateX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = input.nextInt();

        System.out.println("Números ímpares de 1 até " + x + ": ");
        for (int i = 1; i <= x; i+=2) {
            System.out.println(i);
        }
        input.close();
    }
    
}
