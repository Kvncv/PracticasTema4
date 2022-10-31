package practica3;

import javax.swing.*;

public class ArbolBinario3 {

    nodo3 raiz;

    public boolean esVacio() {
        return raiz == null;
    }

    public void insertar(int a) {
        if (esVacio()) {
            nodo3 nuevo = new nodo3();
            nuevo.dato = a;
            nuevo.hder = new ArbolBinario3();
            nuevo.hizq = new ArbolBinario3();
            raiz = nuevo;
        } else {
            if (a > raiz.dato) {
                (raiz.hder).insertar(a);
            }
            if (a < raiz.dato) {
                (raiz.hizq).insertar(a);
            }
        }
    }

    public void preorden() {
        if (!esVacio()) {
            System.out.print(raiz.dato + ", ");
            raiz.hizq.preorden();
            raiz.hder.preorden();
        }
    }

    public void inorden() {
        if (!esVacio()) {
            raiz.hizq.inorden();
            System.out.print(raiz.dato + ", ");
            raiz.hder.inorden();
        }
    }

    public void postorden() {
        if (!esVacio()) {
            raiz.hizq.postorden();
            raiz.hder.postorden();
            System.out.print(raiz.dato + ", ");
        }
    }


    public void eliminar(int i) {
        if (raiz.hizq.esVacio() && raiz.hder.esVacio()) {
            raiz = null;
        } else {
            if (raiz.hizq.esVacio()) {
                raiz = raiz.hder.raiz;
            } else {
                if (raiz.hder.esVacio()) {
                    raiz = raiz.hizq.raiz;
                } else {
                    nodo3 aux = raiz.hizq.raiz;
                    nodo3 padre = raiz.hizq.raiz;
                    while (!aux.hder.esVacio()) {
                        padre = aux;
                        aux = aux.hder.raiz;
                    }
                    raiz.dato = aux.dato;
                    if (padre == aux) {
                        padre.hizq.raiz = aux.hizq.raiz;
                    } else {
                        padre.hder.raiz = aux.hizq.raiz;
                    }
                }
            }
        }
    }

    public int cantidad() {
        if (!esVacio()) {
            return 1 + raiz.hizq.cantidad() + raiz.hder.cantidad();
        } else {
            return 0;
        }
    }

    public String altura() {
        if (esVacio()) {
            return "0";
        } else {
            int izq = Integer.parseInt(raiz.hizq.altura());
            int der = Integer.parseInt(raiz.hder.altura());
            if (izq > der) {
                return (izq + 1) + "";
            } else {
                return (der + 1) + "";
            }
        }
    }

    public String nivel() {
        if (esVacio()) {
            return "0";
        } else {
            int izq = Integer.parseInt(raiz.hizq.nivel());
            int der = Integer.parseInt(raiz.hder.nivel());
            if (izq > der) {
                return (izq + 1) + "";
            } else {
                return (der + 1) + "";
            }
        }
    }

    public String mayor() {
        if (raiz.hder.esVacio()) {
            return raiz.dato + "";
        } else {
            return raiz.hder.mayor();
        }
    }

    public String menor() {
        if (raiz.hizq.esVacio()) {
            return raiz.dato + "";
        } else {
            return raiz.hizq.menor();
        }
    }

    public boolean buscar(int numero) {
        if (esVacio()) {
            return false;
        } else {
            if (raiz.dato == numero) {
                return true;
            } else {
                if (numero > raiz.dato) {
                    return raiz.hder.buscar(numero);
                } else {
                    return raiz.hizq.buscar(numero);
                }
            }
        }
    }

    public void mostrarArbol() {
        if (!esVacio()) {
            System.out.print(raiz.dato + ", ");
            raiz.hizq.mostrarArbol();
            raiz.hder.mostrarArbol();
        }
    }

    public void balancear() {
        int[] arreglo = new int[cantidad()];
        int i = 0;
        inorden(arreglo, i);
        raiz = null;
        balancear(arreglo, 0, arreglo.length - 1);
    }

    private void balancear(int[] arreglo, int i, int i1) {

        if (i <= i1) {
            int medio = (i + i1) / 2;
            insertar(arreglo[medio]);
            balancear(arreglo, i, medio - 1);
            balancear(arreglo, medio + 1, i1);
        }
    }

    private void inorden(int[] arreglo, int i) {

        if (!esVacio()) {
            raiz.hizq.inorden(arreglo, i);
            arreglo[i] = raiz.dato;
            i++;
            raiz.hder.inorden(arreglo, i);
        }
    }
}