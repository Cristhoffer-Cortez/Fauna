/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author Laboratorios DCCO
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String boleto;
        double pboleto,nboleto;
        int opc;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa el nombre del boleto.");
        boleto=scanner.nextLine();
        
        System.out.println("Ingrese el precio del voleto.");
        pboleto=scanner.nextDouble();
        
        
        
        System.out.println("Que boleto quiere comprar.");
        System.out.println("Opcion 1 general.");
        System.out.println("Opcion 2 Vip.");
        opc=scanner.nextInt();
        BoletoGeneral boletog=new BoletoGeneral(boleto,pboleto);
        BoletoVip boletov=new BoletoVip();
        if(opc==1){
            System.out.println("su voleto es para."+boletog.getNombre());
            System.out.println("Ingrese la cantidad de voletos que desea.");
             nboleto=scanner.nextDouble();
            System.out.println("Su precio final es: "+boletog.precioboleto(pboleto, nboleto)); 
                 
        }else if(opc==2){
            System.out.println("Su boleto es para."+boletov.getNombre());
            System.out.println("Ingrese la cantidad de voletos que desea.");
            nboleto=scanner.nextDouble();
            System.out.println("Su precio final es: "+boletov.precioboletovip(nboleto)); 
        }else{
            System.out.println("OBCION NO VALIDA");
        }        
    }      
}
