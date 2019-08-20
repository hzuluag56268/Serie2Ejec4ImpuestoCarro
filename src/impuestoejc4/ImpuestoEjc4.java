/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestoejc4;

import java.util.Scanner;

/**
 *
 */
public class ImpuestoEjc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
         double precioB = 0, impuesto = 0, precioN = 0;
      String tipoV = "";
      Scanner teclado = new Scanner(System.in);
        
      System.out.print("Ingrese tipo de vehiculo, ya sea -Camioneta- o -Automovil- ");
      tipoV = teclado.nextLine();
      
      System.out.print("Ingrese el precio bruto del vehiculo: ");
      precioB = teclado.nextDouble();
      
      if(tipoV.equalsIgnoreCase("Camioneta")){
              if(precioB < 80){
                  System.out.println("Por esta camioneta no existe impuesto, el valor neto a pagar es " + precioB + ".");  
                };
              if(precioB >= 80){
                  impuesto = precioB / 2;
                  precioN = precioB + impuesto;
                  System.out.println("El impuesto para esta camioneta es de " + impuesto + ". El valor neto a pagar es " + precioN + ".");  
              };
      } else if(tipoV.equalsIgnoreCase("Automovil")){
              if(precioB < 20){
                  precioN = precioB + 5;
                  System.out.println("El impuesto para este Automovil es de 5. El valor neto a pagar es " + precioN + ".");  
                };
              if(precioB >= 20 && precioB <= 40){
                  impuesto = precioB / 5;
                  precioN = precioB + impuesto;
                  System.out.println("El impuesto para este Automovil es de " + impuesto + ". El valor neto a pagar es " + precioN + ".");  
              };
              if(precioB > 40){
                  impuesto = 9;
                  precioN = precioB + impuesto;
                  System.out.println("El impuesto para este Automovil es de 9. El valor neto a pagar es " + precioN + ".");  
              };
      } else {
           
         System.out.println("Lo sentimos, ingresaste un tipo de vehiculo diferente a -Automovil - o -Camioneta- ");
      };
      
      
      
      System.out.println("");
  }
    
}
