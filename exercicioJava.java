// Escreva um programa em Java que leia 10 números  e imprima a soma dos números pares e a soma dos números impares.

import java.util.Scanner;
public class exercicioJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor do item: ");
            n = input.nextInt();

            if (n % 2 == 0) {
                somaPar = somaPar + n; // ou somaPar += n
            } else {
                somaImpar = somaImpar + n; // ou somaImpar += n
            }
        }
        System.out.println("Impar: " + somaImpar);
        System.out.println("Par: " + somaPar);
        //System.out.printf("");
    }
}

