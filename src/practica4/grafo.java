package practica4;

public class grafo {

    public static void main(String[] args) {

        int opcion = 0;
        int[][] matriz = new int[10][10];
        int[] vector = new int[10];
        int i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
        int a, b, c, d, e, f, g, h;
        int arista = 0;
        int vertice = 0;

        do {
            System.out.println("1. Crear grafo");
            System.out.println("2. Mostrar grafo");
            System.out.println("3. Agregar arista");
            System.out.println("4. Eliminar arista");
            System.out.println("5. Agregar vertice");
            System.out.println("6. Eliminar vertice");
            System.out.println("7. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = Leer.datoInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero de vertices");
                    vertice = Leer.datoInt();
                    System.out.println("Ingrese el numero de aristas");
                    arista = Leer.datoInt();
                    for (i = 0; i < vertice; i++) {
                        for (j = 0; j < vertice; j++) {
                            matriz[i][j] = 0;
                        }
                    }
                    for (k = 0; k < arista; k++) {
                        System.out.println("Ingrese el vertice de origen");
                        a = Leer.datoInt();
                        System.out.println("Ingrese el vertice de destino");
                        b = Leer.datoInt();
                        matriz[a][b] = 1;
                    }
                    break;

                case 2:
                    for (l = 0; l < vertice; l++) {
                        for (m = 0; m < vertice; m++) {
                            System.out.print(matriz[l][m] + " ");
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el vertice de origen");
                    c = Leer.datoInt();
                    System.out.println("Ingrese el vertice de destino");
                    d = Leer.datoInt();
                    matriz[c][d] = 1;
                    break;

                case 4:
                    System.out.println("Ingrese el vertice de origen");
                    e = Leer.datoInt();
                    System.out.println("Ingrese el vertice de destino");
                    f = Leer.datoInt();
                    matriz[e][f] = 0;
                    break;

                case 5:
                    System.out.println("Ingrese el vertice a agregar");
                    g = Leer.datoInt();
                    for (n = 0; n < vertice; n++) {
                        matriz[n][g] = 0;
                    }
                    for (o = 0; o < vertice; o++) {
                        matriz[g][o] = 0;
                    }
                    vertice++;
                    break;

                case 6:
                    System.out.println("Ingrese el vertice a eliminar");
                    h = Leer.datoInt();
                    for (p = 0; p < vertice; p++) {
                        matriz[p][h] = 0;
                    }
                    for (q = 0; q < vertice; q++) {
                        matriz[h][q] = 0;
                    }
                    vertice--;
                    break;

                case 7:
                    System.out.println("Saliendo ...");
                    break;

                default:
                    System.out.println("Seleccione una opcion valida");
                    break;
            }
        } while (opcion != 7);
    }
}
