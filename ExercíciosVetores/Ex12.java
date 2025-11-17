import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] senhas = {101, 202, 303, 404, 505, 606, 707, 808, 909, 1001};
        boolean[] usadas = new boolean[10];

        System.out.print("Digite a senha para verificar: ");
        int senha = ler.nextInt();

        boolean existe = false;
        for (int i = 0; i < 10; i++) {
            if (senhas[i] == senha) {
                existe = true;
                if (usadas[i]) {
                    System.out.println("Senha " + senha + " já foi usada.");
                } else {
                    System.out.println("Senha " + senha + " existe e ainda não foi usada.");
                    usadas[i] = true;
                }
                break;
            }
        }

        if (!existe) {
            System.out.println("Senha " + senha + " não existe no sistema.");
        }

        ler.close();
    }
}
