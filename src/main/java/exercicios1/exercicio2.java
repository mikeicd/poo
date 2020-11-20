package exercicios1;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        float soma = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o numero de elementos da série harmônica: ");
        int n = teclado.nextInt();
        Float[] harmonica = new Float[n];

        System.out.print("Harmônicas: ");
        for (int i = 0; i < n; i++) {
            harmonica[i] = (float)1/(i+1);
            soma += harmonica[i];
            if (i == n-1){
                System.out.printf("%.3f.", harmonica[i]);
                continue;
            }
            System.out.printf("%.3f, ", harmonica[i]);
        }

        System.out.println("\nA soma dos elementos da série é: "+ soma);

    }
}
