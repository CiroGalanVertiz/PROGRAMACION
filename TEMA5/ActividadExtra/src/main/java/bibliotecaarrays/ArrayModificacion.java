/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaarrays;

/**
 *
 * @author DAM121
 */
public class ArrayModificacion {
    public static int[] copia(int array[]){
        int[] copia = array;
        return copia;
    }
    public static int[] invertir(int array[]){
       int[] copia = new int [ArrayUtil.contarElementos(array)];
        for (int i = ArrayUtil.contarElementos(array); i > 0; i--) {
            for (int j = 0; i < ArrayUtil.contarElementos(array); j++) {
                copia[j]=array[i];
            }
        }
        return copia;
    }
    public static int[] concatenar(int[] array1,int[] array2){
        int [] array = new int[ArrayUtil.contarElementos(array1)+ArrayUtil.contarElementos(array2)];
        for (int i = 0; i < ArrayUtil.contarElementos(array1); i++) {
            array[i]=array1[i];
        }
        for (int i = 0; i < ArrayUtil.contarElementos(array2); i++) {
            array[i+ArrayUtil.contarElementos(array1)]=array2[i];
        }
        return array;
    }
    
}
