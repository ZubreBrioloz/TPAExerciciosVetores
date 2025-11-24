import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            A[i] = ler.nextInt();
        }

        System.out.print("Digite o elemento X para buscar: ");
        int X = ler.nextInt();

        int posicao = -1;
        for (int i = 0; i < 10; i++) {
            if (A[i] == X) {
                posicao = i;
                break;
            }
        }


        if (posicao == -1) {
            System.out.println("Elemento " + X + " não encontrado no vetor.");
        } else {
            System.out.println("Elemento " + X + " encontrado na posição " + posicao + ".");
        }

        ler.close();
    }
}
