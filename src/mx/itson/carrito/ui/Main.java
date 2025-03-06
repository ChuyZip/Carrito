/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author rosales
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la distancia:");
        double distance = sc.nextDouble();
        
        System.out.println("Ingresa la velocidad:");
        double speed = sc.nextDouble();
        
        //Generamos una instancia de la clase carro
        
        Carro bmw = new Carro();
        
        bmw.setBrand("BMW");
        bmw.setCategory("Sport");
        bmw.setColor("Silver");
        bmw.setYear(2025);
        bmw.setKilometers(10000);
        bmw.setTipoMotor(TipoMotor.HÍBRIDO);
       
               
       double time = bmw.arriveTime(distance, speed);
       
        System.out.println("El tiempo que le tomará al carro " + bmw.getBrand() 
                + " de color " + bmw.getColor() 
                + " de clase " + bmw.getCategory() 
                +  " será " + time + " horas " 
                + " y ahora su kilometraje es de " + bmw.getKilometers() );
    }
}
