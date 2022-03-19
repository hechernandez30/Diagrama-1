/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

/**
 *
 * @author Hector Hernandez
 */
public class Staff extends Person {
    String school;
    double pay;
    
    public void Staff(String name, String address, String school, double pay){
        System.out.println("Su nombre es " + name + ", su direccion es " + address + ", su escuela es " + school + 
                ", su pago sera de " + pay + ".");
    }
    public String getSchool(){
        System.out.println("La escuela ingresada es " + school + ".");
        return school;
    }
    public void setSchool(String school){
        System.out.println("La escuela ingresada es " + school + ".");
    }
    public double getPay(){
        System.out.println("El monto establecido es de " + pay + ".");
        return pay;
    }
    public double setPay(int pay){
        System.out.println("El monto ingresado es de " + pay + ".");
        return pay;
    }
    public String toString(){
        System.out.println("Estoy imprimiendo desde la clase Staff");
        return null;
    }
    
}
