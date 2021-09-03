/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Patricio
 */
public class Carrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pista laPista= new Pista(); // Estoy instanciado el componente visual
        laPista.setVisible(true);
      
        laPista.getBtnIniciar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           Proceso hilo1 = new Proceso("P1", laPista);
           Proceso hilo2 = new Proceso("P2", laPista);
           Proceso hilo3 = new Proceso("P3", laPista);
           hilo1.start();
           hilo2.start();
           hilo3.start();
            }
        });
    }
    
}
