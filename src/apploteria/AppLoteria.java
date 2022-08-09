/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apploteria;

/**
 *
 * @author Toshiba
 */
public class AppLoteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Evento nuevoEvento = new Evento("08/08/2022");
        nuevoEvento.cambiarEstado();*/
        
        PegaTres nuevoSorteo = new PegaTres("11/02/2022", 1001);
        nuevoSorteo.getFecha();
        nuevoSorteo.getEstado();
        nuevoSorteo.cambiarEstado();
    }
}
