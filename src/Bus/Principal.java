
package Bus;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System .in);
        
         System.out.println("Ingrese la placa del bus:");
         String placa = dato.nextLine();
         System.out.println("Ingrese el precio del pasaje en el bus por persona:");
         double pasaje = dato.nextDouble();
         System.out.println("Ingrese la capacidad de pasajeros del bus:");
         int capacidad = dato.nextInt();
         System.out.println("Ingrese los pasajeros actuales:");
         int pasajerosActuales = dato.nextInt();
         
        if (pasajerosActuales > capacidad) {
         System.out.println("Los pasajeros actuales superan la capacidad del cupo del bus.");
        }else{
            
         Bus bus = new Bus(placa, capacidad, pasaje, pasajerosActuales);
            
         System.out.println("Ingrese los pasajeros a subir al bus:");
         int pasajeros1= dato.nextInt();
         bus.subirPasajeros(pasajeros1);
         
         System.out.println("Ingrese los pasajeros a bajar al bus:");
         int pasajeros2 = dato.nextInt();
         bus.bajarPasajeros(pasajeros2);
            
         System.out.println("");
         System.out.println("La placa del bus es: "+bus.getPlaca());
         System.out.println("La capacidad del bus es de "+bus.getCapaciad()+" pasajeros.");
         System.out.println("El precio del pasaje del bus es de: $"+bus.getPrecioPasaje());
         System.out.println("Los pasajeros actuales que se tiene en el bus es: "+pasajerosActuales);
         System.out.println("Los pasajeros que se subieron al bus fueron: "+pasajeros1);
         System.out.println("Los pasajeros que se bajaron del bus fueron: "+pasajeros2);
         System.out.println("El total de pasajeros que se subieron al bus son: "+bus.getPasajerosTotales());
         System.out.println("El dinero acumulado del transporte de los pasajeros es de: $"+bus.getdineroAcumulado());
         System.out.println("Total de pasajeros actuales: "+bus.getPasajerosActuales());
 
                 
        }
        
        
    }
    
}
