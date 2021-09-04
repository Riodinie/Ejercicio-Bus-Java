
package Bus;

public class Bus {
    
    private String placa;
    private int capacidadPasajeros;
    private double precioPasaje;
    private int pasajerosActuales;
    private int totalPasajeros;
    
  

    public Bus (String placa, int capacidad, double pasaje, int pasajerosActuales){
        this.placa = placa;
        this.capacidadPasajeros = capacidad;
        this.precioPasaje = pasaje;
        this.pasajerosActuales = pasajerosActuales;    
    }
 
    public String getPlaca(){
        return placa;
    }

    public int getCapaciad(){
        return capacidadPasajeros;
    }    
   
    public double getPrecioPasaje(){
        return precioPasaje;
    }
    
    public int getPasajerosActuales(){
        return pasajerosActuales;        
    }
    
    
    
    public int getPasajerosTotales(){
        return totalPasajeros;  
    }
     
    
     public void subirPasajeros(int pasajeros){
         
        if (pasajerosActuales > capacidadPasajeros) {
            System.out.println("No se puede subir "+pasajeros+ " pasajeros por SOBRECUPO.");
            totalPasajeros = pasajerosActuales;
            
        }else if(pasajerosActuales +  pasajeros> capacidadPasajeros ){
            System.out.println("No se puede subir "+pasajeros+ " pasajeros por SOBRECUPO.");
            pasajeros = capacidadPasajeros - pasajerosActuales;
            System.out.println("Por lo que solo se permitira subir a "+pasajeros+" pasajeros.");
            
            totalPasajeros = pasajerosActuales +  pasajeros;
            pasajerosActuales = pasajerosActuales +  pasajeros;
        }else{
           
            totalPasajeros = pasajerosActuales +  pasajeros;
            pasajerosActuales = pasajerosActuales +  pasajeros;
            
        }
        
    }
   
  
 
    public void bajarPasajeros(int pasajeros){
        if (pasajeros > pasajerosActuales) {
            System.out.println("La cantidad de pasajeros que desea bajar es mayor al numero de pasajeros actuales.");
        } else {      
            pasajerosActuales =  pasajerosActuales  - pasajeros;
        }
    } 
    

    public double getdineroAcumulado(){
        double dineroAcumulado;
        dineroAcumulado =  totalPasajeros * precioPasaje;
        return dineroAcumulado;        
    }  
    
    
    
}
