package ordenar;

// @author Isabela Ett_21058253 Luccas de Felice_21202861

public class SelectionSort implements Sortable{    
    
    @Override
    public int sort(int[] array) {
        int minimo;
        int temp; 
        int cont = 0;
        for(int i = 0; i < array.length; i++) {
            minimo = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minimo]) {                    
                    minimo = j;
                    cont++;
                }
            }
            temp = array[i];
            array[i] = array[minimo];
            array[minimo] = temp;
        }
        return cont;
    }
    
    public String toString() {
        return "SelectionSort";
    }
}

