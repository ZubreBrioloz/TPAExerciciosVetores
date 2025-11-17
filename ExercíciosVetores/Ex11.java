import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            A[i] = ler.nextInt();
        }

        System.out.print("Digite o número que deseja buscar: ");
        int X = ler.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (A[i] == X) {
                System.out.println("Número " + X + " encontrado na posição A[" + i + "].");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número " + X + " não está no vetor.");
        }

        ler.close();
    }
}
