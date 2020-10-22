package ordenar;

// @author Isabela Ett_21058253 Luccas de Felice_21202861

public class InsertionSort implements Sortable{
    public void inverter(int[] array, int a, int b) {
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;       
        
    }
    
    public String toString() {
        return "InsertionSort";
    }
    
    public int sort(int[] array) {
        int n = array.length;    
        int cont = 0;
        for(int i = 1; i < n; i++) {
            int j = i;
            while(j > 0 && array[j-1] > array[j]) {
                inverter(array, j, j-1);
                j--;
                cont++;
            }
            cont++;
        }
        return cont;
    }
}
