import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Divisores de " + A[i] + ":");
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    System.out.println(j);
                }
            }
        }
        ler.close();
    }
}
