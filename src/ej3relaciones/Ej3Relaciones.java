/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3relaciones;

import entidades.Baraja;
import entidadesServicios.Servicios;
import java.util.Scanner;

public class Ej3Relaciones {

    public static void main(String[] args) {
        Baraja b = new Baraja();
        Servicios.barajar(b);
        Scanner leer = new Scanner(System.in);
        
        Servicios.mostrarBaraja(b);
        System.out.println("_____________________________________________________________");
        
        System.out.println("LA SIGUIENTE CARTA ES : " + Servicios.siguienteCarta(b));
        Servicios.mostrarBaraja(b);
        
        System.out.println("LA CANTIDAD DE CARTAS QUE HAY ES: " + Servicios.cartasDisponibles(b));
     System.out.println("_____________________________________________________________");
        System.out.println("INDIQUE EL NUMERO DE CARTAS QUE QUIERE");
        int num= leer.nextInt();
        System.out.println("LAS CARTAS DADAS SON: "+ Servicios.darCartas(num, b));
        System.out.println("_____________________________________________________________");
        System.out.println("LA CANTIDAD DE CARTAS QUE HAY ES: " + Servicios.cartasDisponibles(b));
        
        System.out.println("_____________________________________________________________");
        if (b.getCartasUsadas()!=null)
        {
            System.out.println("LAS CARTAS ELIMINADAS SON : " + b.getCartasUsadas());
        }else{
            System.out.println("NO HAY CARTAS ELIMINADAS");
        }
    }
    
}
