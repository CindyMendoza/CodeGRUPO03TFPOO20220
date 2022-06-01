package TF;

public class Main {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        //registrando una empresa
        agencia.registrarEmpresa("e1","r1");

        //resgitrando un enlace con validación de empresa no existente. Input e5 no existe
        try {
            agencia.registrarEnlace("u1", "d1", "e5");
        }catch (EmpresaNoExisteException e){
            System.out.println(e.getMessage());
        }
        //resgitrando un enlace con validación de empresa existente. Input e5 existe
        try {
            agencia.registrarEnlace("u2","d2","e1");
        }catch (EmpresaNoExisteException e){
            System.out.println(e.getMessage());
        }

        //buscando un dominio no registrado
        try {
            agencia.buscarEnlacePorDominio("d4");
        } catch (DominioNoExisteException e){
            System.out.println(e.getMessage());
        }
        //buscando una empresa no registrada
        try {
            agencia.buscarEnlacePorEmpresa("e2");
        } catch (EmpresaNoExisteException e){
            System.out.println(e.getMessage());
        }
        //buscando un dominio registrado, input d2
        try {
            agencia.buscarEnlacePorDominio("d2");
        } catch (DominioNoExisteException e){
            System.out.println(e.getMessage());
        }
        //buscando una empresa registrada, input: e1
        try {
            agencia.buscarEnlacePorEmpresa("e1");
        } catch (EmpresaNoExisteException e){
            System.out.println(e.getMessage());
        }
        //reporte de enlaces
        agencia.obtenerEnlaces();
        //reporte de empresas
        agencia.obtenerEmpresas();
    }
}
