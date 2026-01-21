/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaarrays;

import java.time.LocalDate;

/**
 *
 * @author DAM121
 */
public class ArrayUtil {
    public static int contarElementos(int[] array){
        int c=0;
        try{
            if(!estaVacio(array)){
                while(true){
                
                   array[c]=array[c];
                c++;
            }
            }
            else{
                throw new Exception();
            }
            
        }
        catch(IndexOutOfBoundsException e){
            
        }
        catch(Exception e){
            System.out.println("no se pudo encontrar el array");
            c=0;
        }
            return c;
        }
    public static boolean estaVacio(int[] array){
        return array==null;
    }
    
    public int obtenerPrimerElemento(int[] array){
        return !estaVacio(array)? array[0]:0;
    }
    public int obtenerUltimoElemento(int[] array){
        return !estaVacio(array)? contarElementos(array)-1:0;
    }
    
}
