/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jvilchiso.a03;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPPJVilchisOA03 {
Scanner keyboard = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Paso 1. Declaración de variables (identificadores)
    double a, b,c,d,e,f,i;
    //Paso 2. Asignar valores a las variables.
     Scanner keyboard = new Scanner (System.in);
    System.out.println( "Introduce tu primer variable");
    a=keyboard.nextDouble();
    System.out.println( "Introduce la potencia a la que se desea elevar primer variable");
    b=keyboard.nextDouble();
    
    System.out.println( "Introduce tu segunda variable");
    d=keyboard.nextDouble();
    System.out.println( "Introduce la potencia a la que se desea elevar su segunda varibale");
    e=keyboard.nextDouble();
    
    
    //Paso 3. Introduzca su variable.
    c=  Math.pow (a,b);
     f =  Math.pow (d,e);
    //Paso 4. El resultado de su primera problemas es
        System.out.println("El resultado de su priemra operación es = "+c);
    //Paso 5. El resultado de su primera problemas es
        System.out.println("El resultado de su segunda operación es = "+f);
//Paso 3. Introduzca su variable.
    i=  Math.pow (a,b);
    }
    
}