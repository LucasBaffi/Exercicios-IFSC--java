import java.util.Scanner;   

// Duas formas de encontrar as 20 primeiras raizes quadradas, uma com variaveis simples e a outra forma com vetor

 class variaveis {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int counter = 0, counter2=0 , counter3 = 0, counter4;

        for(; counter < 20; counter++){
            counter4 = counter2 * counter3;         
            counter2++;
            counter3++;
            System.out.println(counter4);
        }
           

    }
}

class vetores2 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int vetor[] = new int[20], i = 0;

        for(; i < 20 ; i++){
           vetor [i] = i * i;
           System.out.println(vetor[i] + " ");
        }
           

    }
}

