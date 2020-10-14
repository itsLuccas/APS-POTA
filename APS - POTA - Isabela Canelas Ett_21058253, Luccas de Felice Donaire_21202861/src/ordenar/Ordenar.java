package ordenar;
import java.util.Random;
import java.util.ArrayList;

// @author Isabela Ett_21058253 Luccas de Felice_21202861

//testando git hub
public class Ordenar {

    public static void randomize(int[] array) {
        Random rand = new Random(1);        
        
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
        int [] tamanhos = {5, 10, 50, 100, 1000, 10000};
        
        for(int j=0; j<tamanhos.length; j++){
            int[] array = new int[tamanhos[j]];
            randomize(array);

            ArrayList <Sortable> algoritmos = new ArrayList<>();
            algoritmos.add(new BubbleSort());
            algoritmos.add(new SelectionSort());
            algoritmos.add(new InsertionSort());
            algoritmos.add(new MergeSort());
            //algoritmos.add(new QuickSort());
            
            System.out.println("\nTAMANHO DO VETOR =  " + tamanhos[j]);

            for(int i = 0; i < algoritmos.size(); i++){
                int count = algoritmos.get(i).sort(array);            
                System.out.println(algoritmos.get(i).toString() + " : " + count);
                randomize(array);
            }     
        }

    }
}
