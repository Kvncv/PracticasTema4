package practica1;

public class ArbolBinario1 {

    nodo1 raiz;

    public boolean esVacio(){
        return raiz == null;
    }

    public void insertar(int a){
       if(esVacio()){
           nodo1 nuevo = new nodo1();
           nuevo.dato = a;
           nuevo.hder = new ArbolBinario1();
           nuevo.hizq = new ArbolBinario1();
           raiz = nuevo;
    }
         else{
              if(a > raiz.dato){
                  (raiz.hder).insertar(a);
              }
              if(a < raiz.dato){
                  (raiz.hizq).insertar(a);
              }
         }
     }

        public void preorden(){
            if(!esVacio()){
                System.out.print(raiz.dato + ", ");
                raiz.hizq.preorden();
                raiz.hder.preorden();
            }
        }

        public void inorden(){
            if(!esVacio()){
                raiz.hizq.inorden();
                System.out.print(raiz.dato + ", ");
                raiz.hder.inorden();
            }
        }

        public void postorden(){
            if(!esVacio()){
                raiz.hizq.postorden();
                raiz.hder.postorden();
                System.out.print(raiz.dato + ", ");
            }
        }
}