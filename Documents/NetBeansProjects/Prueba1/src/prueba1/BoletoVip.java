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
public class BoletoVip {
    public String nombre;
    public double precio;

    public BoletoVip() {
        this.nombre = " LA VELADA ";
        this.precio = 500;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
   
    
    public double precioboletovip( double cantidad){
     return precio*cantidad;
            
    }
}
