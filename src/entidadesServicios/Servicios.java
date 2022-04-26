/*
barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.
 */
package entidadesServicios;

import entidades.Baraja;
import entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;

public class Servicios {
    
    public static void barajar(Baraja b){
        Collections.shuffle(b.getCartas());
    }
    
    public static Carta siguienteCarta(Baraja b){
   
        if(b.size()>0){
            return b.getCarta();
        } 
        
        System.out.println("NO HAY MAS CARTAS");
        return null;
    }
    
    public static void mostrarBaraja(Baraja b){
        System.out.println(b.toString());
    }
    public static int cartasDisponibles(Baraja b){
        return b.getCartas().size();
    }
    
    public static ArrayList darCartas(int num, Baraja b){
        ArrayList<Carta> a = new ArrayList();
        if (b.size()>=num)
        {
            for (int i = 0; i < num; i++)
            {   
                a.add(b.getCarta());
            }
            return a;
        }
        
        
        System.out.println("CARTAS INSUFICIENTES");
        return null;
    }
    
    public static ArrayList cartasMonton(Baraja b){
        return b.getCartasUsadas();
    }
 
}
