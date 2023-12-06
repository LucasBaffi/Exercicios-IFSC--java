
import java.util.Random;

class binario {

    public static void main(String[] args) {
        int[] digitosBinarios = new int[8];
        int valorDecimal = 0, expoente = 0;
        Random random = new Random();

         System.out.print("Dígitos binários gerados: ");
        for (int i = 0; i < 8; i++) {
            digitosBinarios[i] = random.nextInt(2);
            System.out.print(digitosBinarios[i] + " ");
        }

      
        for (int i = digitosBinarios.length - 1; i >= 0; i--) {
            valorDecimal += digitosBinarios[i] * Math.pow(2, expoente);
            expoente++;
        }

        System.out.println("\nValor decimal correspondente: " + valorDecimal);

    }
}