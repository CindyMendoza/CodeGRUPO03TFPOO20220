 public static int [] ordBurbujaDesdnt(int arreglo[]){
        boolean ordenado=false; int indMax=arreglo.length-1;int valor;
        while(ordenado==false){
            ordenado=true;
            for (int i=0;i<indMax;i++){
                if(arreglo[i]<arreglo[i+1]) {
                    valor = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = valor;
                    ordenado=false;
                }
            }
            indMax=indMax-1;
        }
        return arreglo;
    }
    public static double promediobucle(int arreglo[]){
        double suma = 0;
        double promedio;
        for (int i=0; i<arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        promedio = suma / arreglo.length;
        return promedio;
    }
    public static int busquedaSecN(int arreglo[], double valor){
        int indMax=arreglo.length-1;
        int i=0;

        while(i<indMax && arreglo[i] > valor ){
            i=i+1;

            return i;
        }
        return -1;

    }
    public static void main(String[] args) {

        int arreglo[]={7,1,34,8,64,51,32,21,19,100};
        double promedioArr=0;
        int[] arrOrd=ordBurbujaDesdnt(arreglo);
        promedioArr=promediobucle(arreglo);
        int posicionMayorProm = busquedaSecN(arrOrd,promedioArr);
        System.out.println("Promedio del array: "+promediobucle(arreglo));
        System.out.println("Ordenamiento burbuja descendente: "+Arrays.toString(ordBurbujaDesdnt(arreglo)));
        System.out.println("El primer elemento mayor al promedio: "+posicionMayorProm);
    }