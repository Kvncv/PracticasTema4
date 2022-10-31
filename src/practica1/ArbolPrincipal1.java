package practica1;

import java.util.Scanner;

public class ArbolPrincipal1 {

        public static void main(String[] args) {
            ArbolBinario1 arbol = new ArbolBinario1();
            Scanner in = new Scanner(System.in);

            int cantidad;

            System.out.println("¿Cuántos datos desea agregar al árbol?: ");
            cantidad = in.nextInt();

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese un numero: ");
                arbol.insertar(in.nextInt());
            }

            System.out.println("Recorrido en preorden: ");
            arbol.preorden();
            System.out.println();

            System.out.println("Recorrido en orden: ");
            arbol.inorden();
            System.out.println();

            System.out.println("Recorrido en postorden: ");
            arbol.postorden();
            System.out.println();

        }
}
