import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
            System.out.println("B[" + i + "] = " + B[i]);
        }
        ler.close();
    }
}
