/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;
import java.util.*;
/**
 *
 * @author Estudiante
 * 
 */



public class POO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de escaner para leer todo xdd
        Scanner flujoEnt=new Scanner(System.in);
        //Declaracion de variables
        String nombre= null;
        int numHoras=0;
        double valorHora=0;
        double valorPagar= 0;
        //lectura de datos
        System.out.println("nombre:");
        nombre=flujoEnt.next();
        
        System.out.println("horas trabajadas:");
        numHoras=flujoEnt.nextInt();
        
        System.out.println("valor hora:");
        valorHora=flujoEnt.nextDouble();

        //invocando la funcion
        valorPagar=calcularSalario(numHoras,valorHora);
        System.out.println("Nombre:"+nombre+" Total a pagar:"+valorPagar);
        
                
                
    }
    /* Realice una función que permita determinar la cantidad de dinero recibida 
    por un trabajador por concepto de las horas semanales trabajadas en una empresa  
    @param Horas
    @param valor
    */
        public static double calcularSalario(int horas,double valor){
        double totalSalario=0;
        
        if( horas<=40 ){
             totalSalario= horas*valor;
                      
        } 
        else{ if(horas<=48){
            double horasdobles=horas-40;
            totalSalario=40*valor+2*valor*horasdobles;
        }else{
                       double horastriples=horas-48;
             totalSalario=40*valor+16*valor+3*(valor*horastriples);
            
        }
        
        
        
        }
        
        return totalSalario;
        }
        
        
        // TODO code application logic here
    }
    
