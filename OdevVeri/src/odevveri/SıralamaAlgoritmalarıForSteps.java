package odevveri;

public class SıralamaAlgoritmalarıForSteps {
    
    public static int bubbleSort(int[] array) {
              int[] array2 = new int[array.length];
for (int i = 0; i < array.length; i++) {
array2[i] = array[i];
}
        int stepsForBubble = 0; // Adım sayısını tutan sayaç
    boolean sorted = false;
    while (!sorted) {
        sorted = true;
        for (int i = 1; i < array2.length; i++) {
            if (array2[i - 1] > array2[i]) {
                stepsForBubble++;
                int temp = array2[i - 1];
                array2[i - 1] = array2[i];
                array2[i] = temp;
                sorted = false;
            }
        }
    }
    return stepsForBubble;
}
    
    public static int insertionSort(int[] array) {
   int[] array2 = new int[array.length];
for (int i = 0; i < array.length; i++) {
array2[i] = array[i];
}
         int stepsForinsertion = 0; // Adım sayısını tutan sayaç
    for (int i = 1; i < array2.length; i++) {
        int key = array2[i];
        int j = i - 1;
        while (j >= 0 && array2[j] > key) {
            // Her bir eleman karşılaştırıldığında adım sayısını arttır  
            stepsForinsertion++; 
            array2[j + 1] = array2[j];
            j--;
        }
        array2[j + 1] = key;
    }
    return stepsForinsertion;
}

public static int selectionSort(int[] array) {
        int[] array2 = new int[array.length];
for (int i = 0; i < array.length; i++) {
array2[i] = array[i];
}
    int stepsForSelection = 0; // Adım sayısını tutan sayaç
    for (int i = 0; i < array2.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < array2.length; j++) {
             
            if (array2[j] < array2[minIndex]) {
               // Her bir eleman karşılaştırıldığında adım sayısını arttır 
               stepsForSelection++;
                minIndex = j;
            }
        }
        int temp = array2[i];
        array2[i] = array2[minIndex];
        array2[minIndex] = temp;
    }
    return stepsForSelection; // Adım sayısını döndür
}

    
}
