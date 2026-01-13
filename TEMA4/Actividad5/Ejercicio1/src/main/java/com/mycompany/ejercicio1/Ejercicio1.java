/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio1 {
private static int intentos=0;
    public static void main(String[] args) {
        
        String contrasenia="contra";
        Scanner teclado = new Scanner(System.in);
        boolean acceso=false;
        try{
        while(intentos<3 && acceso==false){
            System.out.print("Introduce la contraseña:");
        String contra = teclado.next();
        if(!contra.equals(contrasenia) && intentos<3){
            throw new ContraseñaNoValidaException();
            
        }
        else{
            acceso=true;
        }
            
            }
            if(intentos==3){
                throw new BloquearUsuarioException();
            }
        }
            
        
        catch(ContraseñaNoValidaException e){
            System.out.println("Contrasenia invalida");
            intentos++;
            main(args); 
        }
        catch(BloquearUsuarioException e){
            System.out.println("Bloqueando usuario...");
             int segundos = 180;
             System.out.println("Bloqueado:");

        while (segundos > 0) {
            int min = segundos / 60;
            int seg = segundos % 60;

            
            System.out.printf("%02d:%02d%n", min, seg);

            try {
                Thread.sleep(1000); // espera 1 segundo
            } catch (InterruptedException i) {
                i.printStackTrace();
            }

            segundos--;
        }
           intentos=0;
        main(args);
        }
        
        
    }

    
}
