import java.util.Scanner;

class vetor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n;
        byte numPares = 0, numImpares = 0, soma = 0, maiorValor = 0, menorValor = 11, qntMaior = 1, qntMenor = 1, igualMaiorMedia = 0, qntMaiorIgualMedia = 0;
        double media;
        System.out.println("Quantos elementos vai ter o vetor? ");
        n = leia.nextInt();
        byte vetor[] = new byte[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite numero entre 0 e 10");

            vetor[i] = leia.nextByte();

            while (vetor[i] < 0 || vetor[i] > 10) {
                System.out.println("numero invalido");
                System.out.println("Digite numero entre 0 e 10");
                vetor[i] = leia.nextByte();

            }

            soma += vetor[i];
        }
        
        System.out.println("Os numeros digitados foram: ");
        for(int i = 0; i < n; i++){
            System.out.println(vetor[i] + " ");
        }
        
        
        System.out.println(" Os numeros pares são:  " );        
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                numPares++;
                System.out.println(vetor[i] + " ");
            }
            
        }
        System.out.println(" \n A porcentagem de numeros pares é " + numPares * 100.0 / n + "%");
        
        System.out.println(" \n Os numeros impares são: " );
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 != 0) {
                numImpares++;
                System.out.println(vetor[i] + " ");
            }
        }
        System.out.println("\n A porcentagem de numeros impares é  " + numImpares * 100.0 / n + "%");
        
        media = soma / n;
        System.out.println("A media do vetor e: " + media + "\n");

        System.out.println("O valor(es) maior ou igual a media e: ");
        for(int i = 0; i < n; i++){
            if(vetor[i] >= media){
               System.out.println( vetor[i] + " ");
               
        }                 
        
    }


       System.out.println("O maior valor do vetor e: ");
        for(int i = 0; i < n; i++){
            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
                qntMaior=1;
            }
            else if(vetor[i] == maiorValor){
                qntMaior++;
                
            }
        }
        System.out.println(maiorValor + " é repetido " + qntMaior + " vez(es)");
        
        System.out.println("O menor valor do vetor e: ");
        for(int i = 0; i < n; i++){
            if(vetor[i] < menorValor){
                menorValor = vetor[i];
                qntMenor=1;
            }
            else if(vetor[i] == menorValor){
                 qntMenor++;
                 
             }
        }
        System.out.println(menorValor + " é repetido  " + qntMenor + " vez(es)");
  

}
}
