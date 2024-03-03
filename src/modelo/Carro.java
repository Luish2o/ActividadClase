/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controller.AccionesVehiculo;

/**
 *
 * @author camilo
 */
public class Carro extends Vehiculo implements AccionesVehiculo {

  String tipoTraccion; 

    public Carro(String marca, String modelo, String placa, int velocidadMaxima, String tipoTraccion) {
        super(marca, modelo, placa, velocidadMaxima);
        this.tipoTraccion = tipoTraccion;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Carro frenando...");
    }

    @Override
    public void estacionar() {
        System.out.println("Carro estacionando...");
    }

    @Override
    public void girar() {
        System.out.println("Carro girando...");
    }
    
}
