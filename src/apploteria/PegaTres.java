/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apploteria;

/**
 *
 * @author Toshiba
 */
public class PegaTres extends Evento{
    private int ganador[];
    private int premios[];
    private int numeroSorteo;
    
    PegaTres(String fecha, int numeroSorteo){
        super(fecha);
        this.numeroSorteo = numeroSorteo;
    }
}
