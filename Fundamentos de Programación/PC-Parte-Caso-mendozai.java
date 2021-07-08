 public static double Calcular_pago_punico(int cant_cancion_ingles, int cant_cancion_espanol){

        double total_espanol=0;
        double total_ingles=0;
        double tarifa_mensual = 30;
        double cantidad_restante_cancion_ingles =cant_cancion_ingles - 10;
        double cantidad_restante_cancion_espanol =cant_cancion_espanol - 10;
        if (cantidad_restante_cancion_ingles>0){
            total_ingles=cantidad_restante_cancion_ingles*1.5+10*3;
        }else{
            total_ingles= cant_cancion_ingles*3;
        }
        if (cantidad_restante_cancion_espanol>0){
            total_espanol=cantidad_restante_cancion_espanol*1+10*2;
        }else{
            total_espanol= cant_cancion_espanol*2;
        }

        return total_ingles+total_espanol+tarifa_mensual;
    }
    public static double Calcular_pago_pgrupal(int cant_cancion_ingles, int cant_cancion_espanol){

        double total_espanol=0;
        double total_ingles=0;
        double tarifa_mensual = 70;
        double cantidad_restante_cancion_ingles =cant_cancion_ingles - 15;
        double cantidad_restante_cancion_espanol =cant_cancion_espanol - 15;
        if (cantidad_restante_cancion_ingles>0){
            total_ingles=cantidad_restante_cancion_ingles*1+15*2.5;
        }else{
            total_ingles= cant_cancion_ingles*2.5;
        }
        if (cantidad_restante_cancion_espanol>0){
            total_espanol=cantidad_restante_cancion_espanol*0.5+15*1.5;
        }else{
            total_espanol= cant_cancion_espanol*1.5;
        }

        return total_ingles+total_espanol+tarifa_mensual;
    }
    public static double Calcular_pago_perfil(String tipo_perfil,int cant_cancion_ingles, int cant_cancion_espanol){
        double pago_segun_perfil=0;
        switch(tipo_perfil) {
            case "u":
                // code block
                pago_segun_perfil=Calcular_pago_punico(cant_cancion_ingles,cant_cancion_espanol);
                break;
            case "g":
                // code block
                pago_segun_perfil=Calcular_pago_pgrupal(cant_cancion_ingles,cant_cancion_espanol);
                break;
            default:
                // code block
                System.out.println("Ingrese la letra u para perfil unico y g para perfil general");
        }
        return pago_segun_perfil;
    }