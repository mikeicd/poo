package exercicios1;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        double[] pesos = {3,4,2};
        Scanner leitura = new Scanner(System.in);

        double prod = 0, media;
        String linha = leitura.nextLine();
        String[] dados = linha.split(" ", 0);
        for (String x : dados)
            System.out.println(x);
    }
}
