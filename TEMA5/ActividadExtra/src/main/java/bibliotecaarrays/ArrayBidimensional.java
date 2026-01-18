/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaarrays;

/**
 *
 * @author DAM121
 */
public class ArrayBidimensional {
    public static int contarElementos(int[][] matriz){
        int c=0;
        int suma=0;
        try{
            while (true){
               suma+=ArrayUtil.contarElementos(matriz[c]);
               c++;
            }
            
        }
        catch(IndexOutOfBoundsException e){
            
        }
        return suma;
        
    }
    public static int contarFilas(int[][] matriz){
        int c=0;
        int suma=0;
        try{
            while (true){
               suma+=ArrayUtil.contarElementos(matriz[c]);
               c++;
            }
            
        }
        catch(IndexOutOfBoundsException e){
            
        }
        return c;
        
    }
    public static int sumaTotal(int[][] matriz){
        int suma=0;
        for (int i = 0; i <contarFilas(matriz); i++) {
            for (int j = 0; j < ArrayUtil.contarElementos(matriz[i]); j++) {
                suma+= matriz[i][j];
            }
        }
        return suma;
    }
    public static int sumaFila(int[][] matriz,int fila){
        int suma=0;
        for (int i = 0; i <contarFilas(matriz); i++) {
                suma+= matriz[fila][i];
        }
        return suma;
    }
    public static int sumaColumna(int[][] matriz,int columna){
        int suma=0;
        for (int i = 0; i <contarFilas(matriz); i++) {
                suma+= matriz[i][columna];
        }
        return suma;
    }
}
