import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean primo = true;
            if (A[i] <= 1) {
                primo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(A[i]); j++) {
                    if (A[i] % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println("A[" + i + "] = " + A[i] + " é primo.");
            } else {
                System.out.println("A[" + i + "] = " + A[i] + " não é primo.");
            }
        }

        ler.close();
    }
}
