package exercicio1;

import filas.FilaInt;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        System.out.print("Informe um valor positivo para inserir na fila: ");
        int valor = sc.nextInt();
        while (valor >= 0) {
            fila.enqueue(valor);
            System.out.print("Informe um valor positivo para inserir na fila: ");
            valor = sc.nextInt();
        }

        System.out.println("Esvaziando a fila");
        while (!fila.isEmpty()) {
            System.out.println("Valor retirado: " + fila.dequeue());
        }
        sc.close();
    }
}
