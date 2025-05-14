import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaIntCrescente lista = new ListaIntCrescente();

        System.out.println("Informe um valor positivo para inserir e um negativo para encerrar ");
        int valor = sc.nextInt();
        while(valor >= 0) {
            lista.insere(valor);
            lista.mostra();
            System.out.println("Informe um valor positivo para inserir e um negativo para encerrar ");
            valor = sc.nextInt();
        }
        sc.close();
    }
}
