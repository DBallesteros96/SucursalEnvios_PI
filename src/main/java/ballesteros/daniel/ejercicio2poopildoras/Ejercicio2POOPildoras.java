/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ballesteros.daniel.ejercicio2poopildoras;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Ejercicio2POOPildoras {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int numSucursal;
        String direccionSucursal;
        String ciudadSucursal;
        int numPaquetes;
        
        System.out.println("Introduzca los datos de la sucursal!");
        
        System.out.print("\tIntroduzca el número de sucursal: ");
        numSucursal = teclado.nextInt();
        teclado.nextLine();
        System.out.print("\n\tIntroduzca la dirección de la sucursal: ");
        direccionSucursal = teclado.nextLine();
        System.out.print("\n\tIntroduzca la ciudad de la sucursal: ");
        ciudadSucursal = teclado.nextLine();
        System.out.println("");
        
        System.out.println("");
        System.out.print("Introduzca el número de paquetes a enviar: ");
        numPaquetes = teclado.nextInt();
        
        Sucursal oficina = new Sucursal(numSucursal, direccionSucursal, ciudadSucursal);
        
        Paquete arrayPaquetes[] = new Paquete[numPaquetes];
        
        
        for (int i = 0; i < numPaquetes; i++){
            
            System.out.println("Introduzca los datos del paquete número " + (i+1));
            System.out.print("\n\tReferencia: ");
            int referencia = teclado.nextInt();
            System.out.print("\n\tPeso: ");
            int peso = teclado.nextInt();
            teclado.nextLine();
            System.out.print("\n\tDNI Remitente: ");
            String dniRemitente = teclado.nextLine();
            System.out.print("\n\tPrioridad envío: ");
            byte prioridad = teclado.nextByte();
            arrayPaquetes[i] = new Paquete(referencia, peso, dniRemitente, prioridad);
                  
        }
        
        System.out.println("___________SALIDA___________");
        System.out.println("Datos de la sucursal.");
        System.out.println("\tNúmero sucursal: " + oficina.getNumeroSucursal());
        System.out.println("\tCiudad sucursal: " + oficina.getCiudad());
        System.out.println("\tDirección sucursal: " + oficina.getDireccion());
        System.out.println("");
        
        int contador = 1;
        System.out.println("Datos Paquetes.");
        for (Paquete paquete : arrayPaquetes){
            
            System.out.println("Paquete " + contador);
            
            System.out.println("Paquete número ");
            System.out.println("\tReferencia: " + paquete.getReferencia());
            System.out.println("\tPeso: " + paquete.getPeso());
            System.out.println("\tPrioridad: " + paquete.getPrioridad());
            System.out.println("\tPrecio: " + paquete.getPrecio());
            
            contador++;
            System.out.println("");
        }
              
    }
}
