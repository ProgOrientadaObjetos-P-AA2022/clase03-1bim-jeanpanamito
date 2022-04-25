/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 1145567;
        hospital.presupuesto = 56045;
        hospital.valor= 10;
        
        // Se presenta valores en pantalla
        System.out.printf("Nombre: %s - Camas: %d - Presupuesto: %.2f Valor: %d\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto,hospital.valor);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
