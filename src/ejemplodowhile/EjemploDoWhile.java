package ejemplodowhile;

import java.util.Scanner;

public class EjemploDoWhile {

    public static void main(String[] args) {

        int d;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero");
            d = teclado.nextInt();

        } while (d != 0);

    }

}
