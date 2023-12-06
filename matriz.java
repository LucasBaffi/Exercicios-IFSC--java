import java.util.Scanner;
import java.util.Random;

public class matriz {
 public static void  main(String[] args) {
     Scanner leia = new Scanner(System.in);
     Random random = new Random();

     System.out.print("Informe o tamanho das matrizes: ");
     int n = leia.nextInt();

     int[][] matrizA = new int[n][n];
     System.out.println("Matrix A:");

     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             matrizA[i][j] = random.nextInt(10);
             System.out.print(matrizA[i][j] + " ");
         }
         System.out.println();
     }
     
      int[][] matrizB = new int[n][n];
     System.out.println("Matrix B:");
       for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             matrizB[i][j] = random.nextInt(10);
             System.out.print(matrizB[i][j] + " ");
         }
         System.out.println();
     }
        System.out.println("Matrix C com o produto das matrizes A e B:");
         int[][] matrizC = new int[n][n];
     for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            System.out.print(matrizC[i][j] + " ");
        }
        System.out.println();
    }
}
}

