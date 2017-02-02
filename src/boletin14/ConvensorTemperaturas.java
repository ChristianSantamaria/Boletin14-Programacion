/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author csantamariacameselle
 */
public class ConvensorTemperaturas {
    private final int temperaturamin = 80;

    public double centigradosAFharenheit(float t)throws TemperaturaErradaExcepcion{
        if(t < temperaturamin) {
            throw new TemperaturaErradaExcepcion("Temperatura invalida menor de 80ºC");
        }
        double farenh = 9/5 * t +32.4;
        return farenh;
    }
    
    public void centigradosAReamur(float t){
        double reamur = 4/5 * t;
    }

}

