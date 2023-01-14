/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veriodev3;

/**
 *
 * @author Sameet Acar
 */
import java.util.Scanner;

public class Dijkstra {

    // Girdi olarak alınan grafın komşuluk matrisini tutacak olan matris
    int[][] adjacencyMatrix;
    // Girdi olarak alınan grafın düğüm sayısı
    int numOfVertices;
    // Hangi düğümden başlangıç yapılacağı
    int startVertex;

    public Dijkstra(int[][] adjacencyMatrix, int numOfVertices, int startVertex) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.numOfVertices = numOfVertices;
        this.startVertex = startVertex;
    }

    public void runDijkstra() {
        // Öncelik sırasını tutacak olan dizi
        int[] priority = new int[numOfVertices];
        // Hangi düğümün önceliği düşürülmüş olduğunu tutacak olan dizi
        boolean[] visited = new boolean[numOfVertices];
        // Her düğümün en kısa yolunu tutacak olan dizi
        int[] shortestPath = new int[numOfVertices];

        // Öncelikleri sıfırla ve ziyaret edilmemiş olarak işaretle
        for (int i = 0; i < numOfVertices; i++) {
            priority[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        // Başlangıç düğümünün önceliğini sıfır olarak ayarla
        priority[startVertex] = 0;
        // Başlangıç düğümünün en kısa yolunun sıfır olduğunu ayarla
        shortestPath[startVertex] = 0;

        // Düğümleri gez
        for (int i = 0; i < numOfVertices - 1; i++) {
            // Önceliği en düşük olan düğümü bul
            int u = findMinPriorityVertex(priority, visited);
            // Bulunan düğümü ziyaret edildi olarak işaretle
            visited[u] = true;

            // Bulunan düğümün komşularını gez
            for (int v = 0; v < numOfVertices; v++) {
                // Eğer düğüm v ziyaret edilmemişse ve düğümler arasında bir yol varsa
                if (!visited[v] && adjacencyMatrix[u][v] != 0) {
                    // Eğer bulunan yol
// Düğümler arasındaki mevcut yolun kısa olup olmadığını kontrol et
                    if (priority[v] > priority[u] + adjacencyMatrix[u][v]) {
// Mevcut yol daha kısa ise, en kısa yolu güncelle
                        priority[v] = priority[u] + adjacencyMatrix[u][v];
// Bulunan düğümün en kısa yolunu güncelle
                        shortestPath[v] = u;
                    }
                }
            }
        }    // Bulunan en kısa yolları ekrana yazdır
        printShortestPaths(shortestPath, priority);
    }

// Önceliği en düşük olan düğümü bul
    private int findMinPriorityVertex(int[] priority, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < numOfVertices; i++) {
            if (visited[i] == false && priority[i] < min) {
                min = priority[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

// Bulunan en kısa yolları ekrana yazdır
    private void printShortestPaths(int[] shortestPath, int[] priority) {
        System.out.println("Baslangic Dugumu :  "+startVertex);
        System.out.println("Dugum\t"+"  En Kisa Yol ");
        for (int i = 0; i < numOfVertices; i++) {
            System.out.println(i + "\t"+"\t" + priority[i]);
        }
    }

}
