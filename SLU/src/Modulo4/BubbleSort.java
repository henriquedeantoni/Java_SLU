package Modulo4;

public class BubbleSort {
	
    public void ordenar(int[] array) {
        int n = array.length;
        boolean troca;
        
        for (int i = 0; i < n - 1; i++) {
            troca = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                	
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    troca = true;
                }
            }
            
            if (!troca) {
                break;
            }
            
            System.out.print("Iteração "+ i+": ");
            imprimirArraySorted(array);
        }
    }
    
    public void imprimirArraySorted(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
