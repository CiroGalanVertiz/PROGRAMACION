/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Calculo {

    Scanner teclado = new Scanner(System.in);

    public void metodo1() {
        int c = 10;
        while (c>= 0) {
            System.out.println(c);
            c--;
        }
        System.out.println("¡DESPEGUE!");
    }

    public void metodo2() {
        int c = 1;
        int n;
        int pos = 0;
        int neg = 0;
        int nul = 0;
        while (c <= 10) {
            System.out.println("Introduce un numero: ");
            n = teclado.nextInt();
            if (n > 0) {
                pos++;
            } else if (n == 0) {
                nul++;
            } else {
                neg++;
            }
            c++;
                   
        }
        System.out.println("positivos: "+pos);
        System.out.println("negativos: "+neg);
        System.out.println("nulos: "+nul);
    }

    public void metodo3() {
        System.out.println("Numero a calcular el factorial");
        int n=teclado.nextInt();
        int c=n-1;
        while (c>=1){
            n*=c;
            c--;
        }
        System.out.println("El factorial es: "+n);

    }

    public void metodo4() {
        String n= "";
        System.out.println("Escribe algo que acabe en .");
        while(!n.contains(".")){            
            n+=teclado.next();
            n+=" ";
        }
        System.out.println(n);

    }

    public void metodo5() {
        int c=1;
        int n=0;
        int a=0;
        System.out.println("Numeros a introducir:");
        n=teclado.nextInt();
        while(c<=n){
            System.out.println("numero "+c);
         a+=teclado.nextInt();
         c++;
        }
        System.out.printf("%s%,.2f","La media es: ",(float)a/n);

    }

}
