package ordenar;
import java.util.Random;
import java.util.ArrayList;

// @author Isabela Ett_21058253 Luccas de Felice_21202861

public class Ordenar {

    public static void randomize(int[] array, int cont) {
        Random rand = new Random(cont);        
        
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();            
        }
    }
    
    public static void printVetor(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);                        
        }
    } 
    
    public static void main(String[] args) {
        //int [] tamanhos = {5, 10, 50, 100, 1000, 10000};        
        int [] tamanhos = {5, 10, 50, 100, 1000, 10000};
        
        for(int j=0; j<tamanhos.length; j++){
            int[] array = new int[tamanhos[j]];
            

            ArrayList <Sortable> algoritmos = new ArrayList<>();
            algoritmos.add(new BubbleSort());
            algoritmos.add(new SelectionSort());
            algoritmos.add(new InsertionSort());
            algoritmos.add(new MergeSort());
            algoritmos.add(new QuickSort());
            
            System.out.println("\nTAMANHO DO VETOR =  " + tamanhos[j]);

            for(int i = 0; i < algoritmos.size(); i++) {
                randomize(array, 1);
                for(int k = 1; k <= 50; k++) {
                    int cont = algoritmos.get(i).sort(array);
                    System.out.println("Array número: " + k + " " + algoritmos.get(i).toString() + " : " + cont);
                    randomize(array, k+1);
                }
                System.out.println("");
            }     
        }

    }
}
