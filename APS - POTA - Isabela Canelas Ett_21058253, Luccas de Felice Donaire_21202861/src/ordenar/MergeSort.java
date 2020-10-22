package ordenar;

// @author Isabela Ett_21058253 Luccas de Felice_21202861

public class MergeSort implements Sortable{    
        int[] arrayAux;
    
   public String toString() {
       return "MergeSort";
   }
    
    public int sort(int[] array) {
        arrayAux = new int[array.length];
        int cont = mergesort(array, 0, array.length-1);    
        return cont;
    }
    
    public int mergesort(int[] array, int p, int r) {
        int q;
        int cont = 0;
        if(p < r) {
            q = (p + r) / 2;
            cont += mergesort(array, p, q);
            cont += mergesort(array, q+1, r);            
            cont += intercala(array, p, q, r);
        }
        return cont;
    }
    
     public int intercala(int[] array, int p, int q, int r) {        
        int i = 0;
        int j = 0;
        int k = 0;
        int cont = 0;
        
        for(i = p; i <= q; i++) {
            arrayAux[i] = array[i]; 
        }
        
        for(j = q+1 ; j <= r; j++) {
            arrayAux[r+q+1-j] = array[j];
        }
        
        i = p;
        j = r;
        
        for(k = p; k <= r; k++) {            
            cont++;
            System.out.println("1");
            if(arrayAux[i] <= arrayAux[j]) {
                array[k] = arrayAux[i];
                i = i+1;
            } else {
               array[k] = arrayAux[j];
               j = j -1;
            }
        }
        return cont;
    }
}
