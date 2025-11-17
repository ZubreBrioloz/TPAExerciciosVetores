import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            A[i] = ler.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < 10 / 2; i++) {
            if (A[i] != A[9 - i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor não é um palíndromo.");
        }

        ler.close();
    }
}
