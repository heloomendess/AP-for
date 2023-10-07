import java.util.Random;

public class dadosRandom {
    public static void main(String[] args) {
        int nLancamentos = 1000000;
        int[] frequenciaFaces = new int[6];
        Random random = new Random();

        for (int i = 0; i < nLancamentos; i++) {
            int resultadoLancamento = random.nextInt(6) + 1;
            frequenciaFaces[resultadoLancamento - 1]++;
        }
        for (int i = 0; i < 6; i++) {
            double porcentagem = (double) frequenciaFaces[i] / nLancamentos * 100;
            System.out.println("Face " + (i + 1) + ": " + porcentagem + "%");
        }
    }
}
