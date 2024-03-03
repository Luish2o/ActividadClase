/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import controller.AccionesVehiculo;
import java.util.Scanner;
import modelo.Carro;
import modelo.Moto;
import modelo.Vehiculo;

/**
 *
 * @author camilo
 */
public class ApiVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al programa ");
        
        System.out.println("!----------------------------------!");
     
        System.out.println("Porfavor ingresar los datos de la moto:");
        System.out.println("!----------------------------------");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();
      System.out.println("!----------------------------------!");
       
        System.out.print("Modelo: ");
          String modeloMoto = scanner.nextLine();
        System.out.println("!----------------------------------!");
       
        System.out.print("Placa: ");
         String placaMoto = scanner.nextLine();
        System.out.println("!----------------------------------!");
      
        System.out.print("Velocidad Máxima: ");
           int velocidadMaximaMoto = scanner.nextInt();
        System.out.println("!----------------------------------!");
        
        System.out.print("Cilindraje: ");
        int cilindrajeMoto = scanner.nextInt();

        
        Moto moto = new Moto(marcaMoto, modeloMoto, placaMoto, velocidadMaximaMoto, cilindrajeMoto);

        System.out.println("!Ahora engrese los otros datos !");
        System.out.println("");
        System.out.println("\nIngresar datos del carro:");
        System.out.println("!----------------------------------!");
        System.out.print("Marca: ");
        String marcaCarro = scanner.next();
        System.out.println("!---------------------------------- !");
      
        System.out.print("Modelo: ");
        System.out.println("!----------------------------------!");
        String modeloCarro = scanner.next();
        System.out.print("Placa: ");
        String placaCarro = scanner.next();
        System.out.println("!----------------------------------!");
      
        System.out.print("Velocidad Máxima: ");
        int velocidadMaximaCarro = scanner.nextInt();
        System.out.println("!----------------------------------!");
      
        System.out.print("Tipo de tracción (Mecanica/Automatica): ");
        String tipoTraccionCarro = scanner.next();

       
        Carro carro = new Carro(marcaCarro, modeloCarro, placaCarro, velocidadMaximaCarro, tipoTraccionCarro);

      
        realizarPruebaDeRuta(moto);
        realizarPruebaDeRuta(carro);
    }

    static void realizarPruebaDeRuta(AccionesVehiculo vehiculo) {
        System.out.println("\nRealizando prueba de ruta para el vehículo:");
        System.out.println("!----------------------------------");
         if (vehiculo instanceof Vehiculo) {
        ((Vehiculo) vehiculo).mostrarInformacion();
      }
         System.out.println("!----------------------------------");
        vehiculo.acelerar();
        System.out.println("!----------------------------------");
        vehiculo.frenar();
        System.out.println("!----------------------------------");
        vehiculo.estacionar();
        System.out.println("!----------------------------------");
        vehiculo.girar();
    }
}
    

