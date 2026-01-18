/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaarrays;

/**
 *
 * @author cococ
 */
public class ArrayOrdenacion {
    public static boolean estaOrdenadoAsc(int[] array){
        boolean ordenado=true;
        for (int i = 0; i < ArrayUtil.contarElementos(array)-1 && ordenado; i++) {
            if(array[i]>array[i+1]){
                ordenado=false;
            }
        }
        return ordenado;
    }
    public static int[] ordenarAsc(int[] array){
        for (int i = 0; i < ArrayUtil.contarElementos(array)-1; i++) {
            if(array[i]<array[i+1]){
                int arrayAux=array[i];
                array[i]=array[i+1];
                array[i+1]=arrayAux;
            }
        }
        return array;
    }
    public static int[] ordenarDesc(int[] array){
        for (int i = 0; i < ArrayUtil.contarElementos(array)-1; i++) {
            if(array[i]>array[i+1]){
                int arrayAux=array[i];
                array[i]=array[i+1];
                array[i+1]=arrayAux;
            }
        }
        return array;
    }
    
}
