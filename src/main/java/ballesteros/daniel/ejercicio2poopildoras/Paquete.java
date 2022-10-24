/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ballesteros.daniel.ejercicio2poopildoras;

/**
 *
 * @author Dani
 */
public class Paquete {
    
    private int referencia;
    private int peso;
    private String DNIRemitente;
    private byte prioridadEnvio;
    private int precio;
    
    public Paquete(int referencia, int peso, String DNIRemitente, byte prioridadEnvio){
        this.referencia = referencia;
        this.peso = peso;
        this.DNIRemitente = DNIRemitente;
        this.prioridadEnvio = prioridadEnvio;
    }
    
    public void setPeso (int peso){
        this.peso = peso;
    }
    
    public void setPrioridad (byte prioridadEnvio){
        this.prioridadEnvio = prioridadEnvio;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public byte getPrioridad(){
        return this.prioridadEnvio;
    }
    
    public int getReferencia(){
        return this.referencia;
    }
    
    public int getPrecio(){
        int precioExtra;
        if (this.prioridadEnvio == 0) precioExtra = 0;
        else if (this.prioridadEnvio == 1) precioExtra = 10;
        else if (this.prioridadEnvio == 2) precioExtra = 20;
        else precioExtra = 30;
        
        this.precio = this.peso*2 + precioExtra;
        
        return this.precio;
    }
}
