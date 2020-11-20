package exercicios1;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Float[] lados = new Float[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o " + (i + 1) + "° lado do triangulo: ");
            lados[i] = teclado.nextFloat();
        }
        if(lados[0].equals(lados[1]) && lados[1].equals(lados[2])){
            System.out.println("O triângulo é equilátero!");
        } else if (!lados[0].equals(lados[1]) && !lados[1].equals(lados[2]) && !lados[0].equals(lados[2])) {
            System.out.println("O triângulo é escaleno!");
        } else
            System.out.println("O triângulo é isóceles!");

    }
}
