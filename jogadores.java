import java.util.Scanner;

import javax.print.DocFlavor.STRING;


public class jogadores {

    public static void main(String[] args) {
        try(Scanner leia= new Scanner(System.in)){
           
           
            int counter = 0, i = 0;
            String players[] = new String[12], bigPlayer = "";
            double heigth[] = new double[12], mediaAltura = 0, somaAltura = 0, bigHeigth= 0;

            do{
                System.out.println("Qual o nome do jogador: ");
                players[i] = leia.nextLine();
                System.out.println("Qual a altura do jogador: ");
                heigth[i] = leia.nextDouble();
                somaAltura += heigth[i];

                if(heigth[i] > bigHeigth){
                    bigHeigth = heigth[i];
                    bigPlayer = players[i];
                }
               
            // System.out.println("O jogador " + players[i] + " tem " + heigth[i] + " de altura");
            counter++;
            }while(counter < 12);
            mediaAltura = somaAltura / counter;
        }
    }
    
}