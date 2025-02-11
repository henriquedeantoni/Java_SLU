package Modulo4;

public class TestaBubbleSort_exercicio5 {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        
        int[] numeros = {11, 2, 4, -6, 0, 3, 5, -2, 7};
        
        System.out.println("Array antes da ordenação:");
        bubbleSort.imprimirArraySorted(numeros);
        
        bubbleSort.ordenar(numeros);
        
        System.out.println("Array depois da ordenação:");
        bubbleSort.imprimirArraySorted(numeros);
    }	
}
