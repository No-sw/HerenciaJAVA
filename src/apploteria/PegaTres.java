/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apploteria;
import java.util.Random;
/**
 *
 * @author Toshiba
 */
public class PegaTres extends Evento{
    private int ganador[] = new int[3];
    private int premios[] = {100, 1000, 10000};
    private int numeroSorteo;
    
    PegaTres(String fecha, int numeroSorteo){
        super(fecha);
        this.numeroSorteo = numeroSorteo;
    }
    public void realizarSorteo(){
       Random rand = new Random();
       int numeroMax = 100;
       //generate random values form 0-99
       //ciclos
       int int_random = rand.nextInt(numeroMax);
       for (int i=0; i < 3; i++){
           ganador[i] = rand.nextInt(numeroMax);
           System.out.println("Numero ganador: "+int_random);
       }
    }
    
    public void buscarGanadores(){
        
    }
}
