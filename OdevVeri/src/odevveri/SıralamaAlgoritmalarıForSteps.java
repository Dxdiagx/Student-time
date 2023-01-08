package odevveri;

public class SıralamaAlgoritmalarıForSteps {
    
    public static int bubbleSort(int[] array) {
        int stepsForBubble = 0; // Adım sayısını tutan sayaç
    boolean sorted = false;
    while (!sorted) {
        sorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                stepsForBubble++;
                int temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                sorted = false;
            }
        }
    }
    return stepsForBubble;
}
    
    public static int insertionSort(int[] array) {
         int stepsForinsertion = 0; // Adım sayısını tutan sayaç
    for (int i = 1; i < array.length; i++) {
        int key = array[i];
        int j = i - 1;
        while (j >= 0 && array[j] > key) {
            // Her bir eleman karşılaştırıldığında adım sayısını arttır  
            stepsForinsertion++; 
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = key;
    }
    return stepsForinsertion;
}

public static int selectionSort(int[] array) {
    int stepsForSelection = 0; // Adım sayısını tutan sayaç
    for (int i = 0; i < array.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < array.length; j++) {
             
            if (array[j] < array[minIndex]) {
               // Her bir eleman karşılaştırıldığında adım sayısını arttır 
               stepsForSelection++;
                minIndex = j;
            }
        }
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
    }
    return stepsForSelection; // Adım sayısını döndür
}

    
}
