public static Stack<Integer> arraytopila(int arreglo[]){
        Stack<Integer> pila = new Stack<>();
        for (int i=0; i<arreglo.length; i++){
            if (arreglo[i]%2 !=0){
                pila.push(arreglo[i]);
            }
        }
        return pila;

    }
    public static void printPilas(Stack<Integer> pila){

        while (!pila.isEmpty()){
            System.out.print(pila.pop()+" ");
        }
    }
    public static void main(String[] args) {


        int [] arreglo = {10,9,8,7,6,5,4,3,2,1};

        System.out.println("Valores de arreglo a una pila:"+arraytopila(arreglo));
        System.out.println("Mostrar los valores de la pila generada: ");
        printPilas(arraytopila(arreglo));

    }