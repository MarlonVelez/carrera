/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patricio
 */
public class Proceso extends Thread {

    private Pista miPista;

    public Proceso(String name, Pista pista) {
        super(name);
        this.miPista = pista;
    }

    @Override
    public void run() {
        Random numero_ale= new Random();
        int valor_slepp= 5+ numero_ale.nextInt();

        switch (getName()) {
            case "P1":
                moverP1();
                break;
            case "P2":
                moverP2();
                break;
            case "P3":
                moverP3();
                break;
        }
    }

    private void moverP1() {
        while (true) {
            miPista.getLblP1().setLocation(miPista.getLblP1().getLocation().x + 5, miPista.getLblP1().getLocation().y);
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void moverP2() {
        while (true) {
            miPista.getLblP2().setLocation(miPista.getLblP2().getLocation().x + 5, miPista.getLblP2().getLocation().y);
            try {
                sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void moverP3() {
        while (true) {
            miPista.getLblP3().setLocation(miPista.getLblP3().getLocation().x + 5, miPista.getLblP3().getLocation().y);
            try {
                sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
