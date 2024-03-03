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
public class Moto extends Vehiculo implements AccionesVehiculo{

    int cilindraje;

    public Moto(String marca, String modelo, String placa, int velocidadMaxima, int cilindraje) {
        super(marca, modelo, placa, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Moto frenando...");
    }

    @Override
    public void estacionar() {
        System.out.println("Moto estacionando...");
    }

    @Override
    public void girar() {
        System.out.println("Moto girando...");
    }
    
}
