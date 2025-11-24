import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[20];
        int[] B = new int[20];
        int posPar = 0, posImpar = 19;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[posPar] = A[i];
                posPar++;
            } else {
                B[posImpar] = A[i];
                posImpar--;
            }
        }

        System.out.println("Vetor B:");
        for (int i = 0; i < 20; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
        ler.close();
    }
}
