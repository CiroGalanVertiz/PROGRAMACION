/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaarrays;

/**
 *
 * @author DAM121
 */
public class ArrayBusqueda {
    public static boolean contiene(int array[],int num){
        boolean contiene=false;
        for (int i = 0; i < ArrayUtil.contarElementos(array) && !contiene; i++) {
            if(array[i]==num){
                contiene=true;
            }
            
        }
        return contiene;
}
    public static int indiceDe (int array[],int num){
        int resultado=-1;
        boolean encontrado=false;
        for (int i = 0; i < ArrayUtil.contarElementos(array) && !encontrado; i++) {
            if(array[i]==num){
                resultado=i;
                encontrado=true;
            }
            
        }
        return resultado;
    }
    public static int ultimoindiceDe (int array[],int num){
        int resultado=-1;
        for (int i = 0; i < ArrayUtil.contarElementos(array); i++) {
            if(array[i]==num){
                resultado=i;
            }
            
        }
        return resultado;
    }
}
