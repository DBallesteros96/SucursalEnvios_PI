/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ballesteros.daniel.ejercicio2poopildoras;

/**
 *
 * @author Dani
 */
public class Sucursal {
    
    private int numeroSucursal;
    private String direccion;
    private String ciudad;
    
    public Sucursal (int numeroSucursal, String direccion, String ciudad){
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    
    public int getNumeroSucursal(){
        return this.numeroSucursal;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public String getCiudad(){
        return this.ciudad;
    }
    
    public double CalculaPrecio(Paquete paquete){
        double precioPaquete;
        
        precioPaquete = paquete.getPeso()*2.5;
        
        if (paquete.getPrioridad() == 0) ;
        else if (paquete.getPrioridad() == 1) precioPaquete += 10;
        else if (paquete.getPrioridad() == 2) precioPaquete += 20;
        
        return precioPaquete;  
        
    }
}
