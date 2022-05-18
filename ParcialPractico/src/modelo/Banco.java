package modelo;

import java.util.ArrayList;

public class Banco {
    private int contadordeSedes=0;
    private String nombre;
    final Integer NO_MAX_SEDES=10;
    private ArrayList<Sede> guardadoSedes= new ArrayList();
    private Sede sedes;

    public Banco() {
    }

    public Integer getNO_MAX_SEDES() {
        return NO_MAX_SEDES;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
    
    
    public int getContadordeSedes() {
        return contadordeSedes;
    }

    public void setContadordeSedes(int contadordeSedes) {
        this.contadordeSedes = contadordeSedes;        
    }
    public ArrayList<Sede> getGuardadoSedes() {
        return guardadoSedes;
    }

    public void setGuardadoSedes(ArrayList<Sede> guardadoSedes) {
        this.guardadoSedes = guardadoSedes;
    }

    
    public Banco(String nombre) {
        this.nombre = nombre;
    }
    
    public void NuevaSede(Sede sede){
        sedes=sede;
        guardadoSedes.add(sedes);
    }
    
    public void mostrarSedes(){
        for(int i=0; i<guardadoSedes.size(); i++){
            System.out.println("Sede "+i+": "+guardadoSedes.get(i));
        }
            
    }
    
    public String MostrarDatos() {
        return "Banco{" + "nombre=" + nombre + ", NO de Sedes en el banco=" + contadordeSedes +'}';
    }

    public Sede getSedes() {
        return sedes;
    }

    public void setSedes(Sede sedes) {
        this.sedes = sedes;
    }

    
    
    
    
    
    
}
