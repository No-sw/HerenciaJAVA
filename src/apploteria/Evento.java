/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apploteria;

/**
 *
 * @author Toshiba
 */
public abstract class Evento {
    private String fecha;
    private boolean esRealizado;
    
    Evento(String fecha){
        this.fecha = fecha;
        this.esRealizado = false;
    }
    
    protected void cambiarEvento(String fecha){
        this.fecha = fecha;
    }
    
    protected void cambiarEstado(){
//toggle
    esRealizado = !esRealizado;
    String mensaje = esRealizado ? "Realizado" : "No Realizado";
    System.out.println("Estado actualizado: "+mensaje);    
    }
    
    protected void getFecha(){
        System.out.println("Fecha: "+this.fecha);
    }
    
    protected void getEstado(){
        System.out.println("Estado actual: "+this.esRealizado);
    }
    protected abstract void realizarSorteo();
    protected abstract void buscarGanadores();
}
