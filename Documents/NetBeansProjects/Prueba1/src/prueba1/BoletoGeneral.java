/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

/**
 *
 * @author Laboratorios DCCO
 */
public class BoletoGeneral {
    private String nombre;
    private double precio;

    public BoletoGeneral(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double precioboleto( double precio,double cantidad){
        return precio*cantidad;
            
    }
}
