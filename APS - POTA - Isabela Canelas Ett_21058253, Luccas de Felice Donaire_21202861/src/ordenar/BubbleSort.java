package ordenar;

// @author Isabela Ett_21058253 Luccas de Felice_21202861

public class BubbleSort implements Sortable{    
    public void inverter(int[] v, int a, int b) {
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;       
        
    }
    
    public String toString() {
        return "BubbleSort";
    }
    
    public int sort(int[] array) {
        int n = array.length;
        int cont = 0;
        boolean invertido;        
        do {
            invertido = false;
            for(int i = 1; i < n; i++) {
                if(array[i-1] > array[i]) {
                    inverter(array, i-1, i);
                    invertido = true;
                }                
                cont++;
            }            
        }while(invertido == true);
        return cont;
    }
}
    
