import java.util.Scanner;

public class trabajofinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Bomba;
        int i;
        int ventas_mayores_a_1000;
        int ventas_menores_a_500;
        double CNPB, GMXA, GMXL, Sigma1, Sigma2;
        double  ventatotal;
        double venta;
        int ventas_entre_500_y_1000 = 0;
        ventas_mayores_a_1000 = 0;
        ventas_menores_a_500 = 0;
        CNPB = 0;
        GMXA = 0;
        GMXL = 0;
        ventatotal = 0;
        System.out.println("Ingresar  #n ventas : ");
        int n = sc.nextInt();
        sc.nextLine();

        for (i=1; i<=n; i++) {

            System.out.println("Ingresar  valor de venta : ");
            venta = sc.nextDouble();

            System.out.println("Ingrese el tipo de bomba: ");
            Bomba = sc.nextInt();
            new String[]{"CNPB", "GMXA", "GMXL", "Sigma1", "Sigma2"}, null) + 1;
            if(venta>1000)
                ventas_mayores_a_1000=ventas_mayores_a_1000+1;
            if(venta>500 && <=1000)
            ventas_entre_500_y_1000=ventas_entre_500_y_1000+1;
            if(venta<=500)
                ventas_menores_a_500=ventas_menores_a_500+1;
            ventatotal=ventatotal+venta;
            if(Bomba==1)
                CNPB=CNPB+venta;
            if(Bomba==2)
                GMXA=GMXA+venta;
            if(Bomba==3)
                GMXL=GMXL+venta;
            if(Bomba==4)
                Sigma1=Sigma1+venta;
            if(Sigma2==5)
                Sigma2=Sigma2+venta;
        }

                "Valor de ventas entre 500 y 1000: " + ventas_entre_500_y_1000 + "\n" +
                        "Valor de ventas mayores a 1000: " + ventas_mayores_a_1000 + "\n" +
                        "Valor de ventas menores a 500: " + ventas_menores_a_500 + "\n" +
                        "Valor de monto de CNPB: " + CNPB + "\n" +
                        "Valor de monto de GMXA: " + GMXA + "\n" +
                        "Valor de monto de GMXL: " + GMXL + "\n" +
                        "Valor de monto de SIGMA1: " + Sigma1+ "\n" +
                        "Valor de monto de SIGMA2: " + Sigma2 + "\n" +
                        "Valor de Venta total: " + ventatotal);
    }


}
}
