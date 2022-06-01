package TF;

import Taller4.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List<Empresa> empresas;
    private List<Enlace> enlaces;

    public Agencia() {
        empresas = new ArrayList<>();
        enlaces = new ArrayList<>();
    }

    public void registrarEmpresa(String nombre, String ruc){
        Empresa empresa = new Empresa(nombre,ruc);
        System.out.println("empresa registrada correctamente");
        System.out.println(empresa);
        empresas.add(empresa);
    }
    public void registrarEnlace(String url, String dominio, String empresa) throws EmpresaNoExisteException{
        List<Empresa> listadodeempresas = empresas;
        empresas = empresas;
        Enlace enlace = new Enlace(url, dominio, empresa, (ArrayList<Empresa>) listadodeempresas);
        if (enlace.getEmpresa()==null){
            throw new EmpresaNoExisteException();
        }
        System.out.println("enlace registrado correctamente");
        System.out.println(enlace);
        enlaces.add(enlace);

    }


    public void buscarEnlacePorDominio(String dominio) throws DominioNoExisteException{
        Enlace enlace = new Enlace();
        List<Enlace> listadoenlaces =enlaces;
        System.out.println("resultado de busqueda de enlace por dominio");
        if (enlace.buscarEnlacePorDominio(dominio, (ArrayList<Enlace>)listadoenlaces) == null){
            throw new DominioNoExisteException();
        }else {
            System.out.println(enlace.buscarEnlacePorDominio(dominio, (ArrayList<Enlace>)listadoenlaces));;
        }


    }
    public void buscarEnlacePorEmpresa(String empresa)  throws EmpresaNoExisteException{
        Enlace enlace = new Enlace();
        List<Enlace> listadoenlaces =enlaces;
        System.out.println("resultado de busqueda de enlace por empresa");

        if (enlace.buscarEnlacePorEmpresa(empresa, (ArrayList<Enlace>)listadoenlaces)==null){
            throw new EmpresaNoExisteException();
        }else {
            System.out.println(enlace.buscarEnlacePorEmpresa(empresa, (ArrayList<Enlace>)listadoenlaces));
        }

    }

    public void obtenerEnlaces(){
        System.out.println("listado de enlaces");
        System.out.println(enlaces);
    }
    public void obtenerEmpresas(){
        System.out.println("listado de empresas");
        System.out.println(empresas);
    }
    public List<Empresa> getEmpresas() {
        return empresas;
    }
}
