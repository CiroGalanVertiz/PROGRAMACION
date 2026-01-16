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
    public int[] copia(int array[]){
        int[] copia = array;
        return copia;
    }
    public int[] invertir(int array[]){
       int[] copia = new int [ArrayUtil.contarElementos(array)];
        for (int i = ArrayUtil.contarElementos(array); i > 0; i--) {
            for (int j = 0; i < ArrayUtil.contarElementos(array); j++) {
                copia[j]=array[i];
            }
        }
        return copia;
    }
    
}
