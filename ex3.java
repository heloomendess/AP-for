import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeAluno;
        float n1, n2, media;
        System.out.println("Digite o nome do aluno: ");
        nomeAluno = input.next();
        System.out.println("Digite a N1: ");
        n1 = input.nextFloat();
        System.out.println("Digite a N2: ");
        n2 = input.nextFloat();
        media = (n1 + n2)/2;

        System.out.printf("%s, \n a média" + " das notas %.1f e %.1f é:" + "\t \n %.2f \n", nomeAluno, n1, n2, media);
    }
}
