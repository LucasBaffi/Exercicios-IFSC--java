import java.util.Scanner;

class tabuada {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {

            byte n1;
            String resposta = "";

            do {

                System.out.printf("digite um numero: ");
                n1 = leia.nextByte();
                for (byte cont = 1; cont <= 10; cont++) {
                    System.out.println(n1 + " x " + cont + " = " + n1 * cont  );

                };                

                System.out.println("Deseja a tabuada de outro número (S/N)?");
                resposta = resposta.toLowerCase();
                resposta = leia.next();

                while(!resposta.equals("s")  && !resposta.equals("n") ){
                    System.out.println("digite s ou n");                    
                    resposta = leia.next();
                }                
                if(resposta.equals("n")){
                        System.out.println("fim");
                    }
                

            } while (resposta.equals("s")  );

        }
    }
}