import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[15];
        int[] B = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            int fatorial = 1;
            for (int j = 1; j <= A[i]; j++) {
                fatorial *= j;
            }
            B[i] = fatorial;
        }

        for (int i = 0; i < 15; i++) {
            System.out.println("A[" + i + "] = " + A[i] + " -> fatorial = " + B[i]);
        }

        ler.close();
    }
}