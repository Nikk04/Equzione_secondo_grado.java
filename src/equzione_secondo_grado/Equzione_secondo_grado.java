/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equzione_secondo_grado;

import java.lang.Math ;
import java.util.Scanner ;



public class Equzione_secondo_grado {

    static int X1, X2,a=0, b=0, c=0, Delta=0;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserisci la a \n");
        a = keyboard.nextInt();
        System.out.println("Inserisci la b \n");
        b = keyboard.nextInt();
        System.out.println("Inserisci la c \n");
        c = keyboard.nextInt();
        if(a==0&&b==0&&c==0){
            System.out.print("L'equazione è indeterminata \n" );

        }
        if(b!=0&&c==0&&a==0){
            System.out.print("L'equazione è spuria \n");


        }
        if(c!=0&&b==0&&a!=0){
            System.out.print( "L'equazione e pura \n");

        }
        if(c==0&&b==0&&a!=0){
            System.out.print( "L'equazione e monomia \n");

        }
        if(a!=0&&b!=0&&c!=0){
            System.out.print( "L'èquazione è completa \n");
        }
        Delta=(int) Math.pow(b,2)-(4*a*c);
    if(Delta==0){
        System.out.print("il delta è 0 quindi l'equazione è indeterminata \n");
        X2 = (int) ((-b+Math.sqrt(Delta))/(2*a));
        System.out.println("il prodotto è" + X2);


    }
    if(Delta>0){
        System.out.print("il delta è maggiore di 0 quindi l'equazione è determinata \n");
        X1 = (int) ((-b-Math.sqrt(Delta))/(a*2));
        X2 = (int) ((-b+Math.sqrt(Delta))/(a*2));
        System.out.println("il primo prodotto è" +X1+"Il secondo è" + X2);
    }
    if(Delta<0){
        System.out.print("il delta è minore di 0 quindi l'equazione è determinata \n");

    }


        // TODO code application logic here
    }
    
}
