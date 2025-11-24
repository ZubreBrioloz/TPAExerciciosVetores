import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = ler.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = ler.nextInt();
        }

        System.out.println("Interseção:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (A[i] == B[j]) {
                    System.out.println(A[i]);
                }
            }
        }
        ler.close();
    }
}
