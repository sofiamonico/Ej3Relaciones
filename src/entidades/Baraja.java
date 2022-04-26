/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasUsadas;

    public Baraja() {
        this.llenarBaraja();
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public Carta getCarta() {
 
        if (this.cartas.size()>0){
            Carta c = this.cartas.remove(0);
            this.cartasUsadas.add(c);
            return c;
           
        }
        return null;
    }

    public ArrayList<Carta> getCartasUsadas() {
        return cartasUsadas;
    }
    
    public int size(){
        return this.cartas.size();
    }

    public void setCartasUsadas(ArrayList<Carta> cartasUsadas) {
        this.cartasUsadas = cartasUsadas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + ", cartasUsadas=" + cartasUsadas + '}';
    }
    
    

    
    
    
    
    
   
    
    public void llenarBaraja(){
        this.cartas=new ArrayList();
        this.cartasUsadas=new ArrayList();
         String palo=null;
        
        for (int i = 0; i < 4; i++)
        {
            switch(i){
                case 0: 
                    palo="Basto";
                    break;
                case 1:
                    palo="Espada";
                    break;
                case 2:
                    palo="Oro";
                    break;
                case 3:
                    palo="Copa";
                    break;
            }
            for (int j = 1; j < 13; j++)
            {
                if (j!=8 && j!=9)
                {
                    
                    this.cartas.add(new Carta(j,palo));
                }
            } 
        }
    }
    
}
