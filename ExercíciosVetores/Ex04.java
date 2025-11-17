import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Pares até " + A[i] + ":");
            for (int j = 0; j <= A[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j);
                }
            }
        }
        ler.close();
    }
}
