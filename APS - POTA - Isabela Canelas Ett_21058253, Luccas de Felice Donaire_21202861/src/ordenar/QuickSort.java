/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

/**
 *
 * @author lucca
 */
public class QuickSort implements Sortable{
    public int sort(int[] array) {
        int cont = quicksort(array, 0, array.length-1);
        return cont;
    }
    
    public int quicksort(int[] array, int inicio, int fim) {
        int cont = 0;
        if(inicio < fim) {
            int meioContador[] = new int[2];
            meioContador = particionar(array, inicio, fim); 
            meioContador[1] += quicksort(array, inicio, meioContador[0] - 1);
            meioContador[1] += quicksort(array, meioContador[0] + 1, fim);
            cont+= meioContador[1];
        }
        return cont;
    }
    
    public int[] particionar(int[] array, int inicio, int fim) {
        int i = inicio + 1;
        int j = fim;
        int aux = 0;
        int cont = 0;
        
        while(i <= j) {            
            if(array[i] < array[inicio]) {  
                System.out.println("1");
                cont++;
                i++;
            } else if(array[j] > array[inicio]) {  
                System.out.println("2");
                cont += 2;
                j--;
            } else {
                System.out.println("2");
                cont += 2;
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }
        aux = array[inicio];
        array[inicio] = array[j];
        array[j] = aux;
        int[] newArray = {j, cont};
        return newArray;
    }
    
    public String toString() {
        return "QuickSort";
    }
}
