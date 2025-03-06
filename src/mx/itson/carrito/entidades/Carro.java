/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author rosales
 */

public class Carro {

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the kilometers
     */
    public double getKilometers() {
        return kilometers;
    }

    /**
     * @param kilometers the kilometers to set
     */
    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
    
    private String color;
    
    private int year;
    
    private String brand;
    
    private String category;
    
    private double kilometers;
   
    private TipoMotor tipoMotor;  
    /**
     * Calcula el tiempo que tarda el carro en recorrer una distancia.
     * @param distance Distancia que recorrerá el carro.
     * @param speed Velocidad en la que avanza el carro.
     * @return Tiempo en el que llegará el carro.
     */
    public double arriveTime(double distance, double speed) {
      
        this.kilometers += distance;

      //La línea de arriba es lo mismo que ésta de abajo
      
      //this.kilometers = this.kilometers + distance;
      
        /*double time = distance/speed;
        return time;
        */
        return distance/speed;
      }
    
 }

