package TF;

import java.util.ArrayList;
import java.util.List;

public class Enlace {
    private String url;
    private String dominio;
    private String empresa;
    private List<Empresa> empresas;



    public Enlace() {

    }

    public Enlace(String url, String dominio, String empresa, ArrayList<Empresa> empresas) {
        this.url = url;
        this.dominio = dominio;
        this.empresas = empresas;
        this.empresa = buscarEmpresa(empresa);
    }


    public String getUrl() {
        return url;
    }

    public String getDominio() {
        return dominio;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String toString(){
        return "Enlace: " +
                " url: " + url + " dominio: " + dominio + " empresa: " + empresa;
    }



    public Enlace buscarEnlacePorDominio(String dominio, ArrayList<Enlace> enlaces){
        for (Enlace enlace:enlaces){
            if (enlace.getDominio().equals(dominio)){
                return enlace;
            }else {
                System.out.println("no encontrado");
            }
        }
        return null;
    }
    public Enlace buscarEnlacePorEmpresa(String empresa, ArrayList<Enlace> enlaces){
        for (Enlace enlace:enlaces){
            if (enlace.getEmpresa().equals(empresa)){
                return enlace;
            } else {
                System.out.println("no encontrado");
            }
        }
        return null;
    }
    public String buscarEmpresa(String nombre){
        for (Empresa empresa:empresas){
            if (empresa.getNombre().equals(nombre)){
                return empresa.getNombre();
            }
        }
        return null;

    }


}

