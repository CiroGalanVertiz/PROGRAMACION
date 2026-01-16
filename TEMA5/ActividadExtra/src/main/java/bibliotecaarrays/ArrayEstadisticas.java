/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaarrays;

/**
 *
 * @author DAM121
 */
public class ArrayEstadisticas {
    public static int suma(int[] array){
        int suma=0;
        for (int i = 0; i < ArrayUtil.contarElementos(array); i++) {
            suma+=array[i];
        }
        return suma;
    }
    public static double media(int[] array){
        return suma(array)/ArrayUtil.contarElementos(array);
    }
    public static int maximo(int[] array){
        int maximo=Integer.MIN_VALUE;
        for (int i = 0; i < ArrayUtil.contarElementos(array); i++) {
            if(array[i]>maximo){
                maximo=array[i];
            }
        }
        return maximo;
    }
    public static int minimo(int[] array){
        int maximo=Integer.MAX_VALUE;
        for (int i = 0; i < ArrayUtil.contarElementos(array); i++) {
            if(array[i]<maximo){
                maximo=array[i];
            }
        }
        return maximo;
    }
}
