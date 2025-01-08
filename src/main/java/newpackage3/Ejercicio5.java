/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage3;

/**
 *
 * @author ASUS
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double A= 39;
        double B= 13;
        double C= 45;
        double D= 50;
        
        if(A>B && A>C && A>D){
        System.out.println("A es el numero mayor: "+A);}
        else if(B>A && B>C && B>D){
        System.out.println("B es el numero mayor: "+B);}
        else if(C>A && C>B && C>D){
        System.out.println("C es el numero mayor: "+C);}
        else{
        System.out.println("D es el numero mayor: "+D);}
        
    }
    
}
