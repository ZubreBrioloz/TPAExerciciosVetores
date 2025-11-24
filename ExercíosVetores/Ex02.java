import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Tabuada de " + A[i] + ":");
            for (int j = 0; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i]*j));
            }
        }
        ler.close();
    }
}