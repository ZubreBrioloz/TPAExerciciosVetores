import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = ler.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
            System.out.println("C[" + i + "] = " + C[i]);
        }
        ler.close();
    }
}
