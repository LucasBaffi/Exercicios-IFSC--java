import java.util.Scanner;

public class geomatria {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opcao = 0;
        double lado = 0;
        do {
            System.out.println("GEOMETRIA PLANA");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1-QUADRADO");
            System.out.println("3-TRIANGULO");
            System.out.println("2-CIRCUNFERENCIA");
            System.out.println("0-SAIR");
            System.out.println("DIGITE A OPCAO DESEJADA");
            opcao = leia.nextInt();

            if (opcao == 1) {
            quadrado();              
            } else if (opcao == 2) {
              triangulo();
            } else if (opcao == 3) {
                circunferencia();
            }else if(opcao != 1 & opcao != 2 & opcao != 3 & opcao != 0){
                System.out.println("OPCAO INVALIDA");
            }

        } while (opcao != 0);

    };

    public static void quadrado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado do quadrado: ");
        int lado = scanner.nextInt();

        // Calculando a área do quadrado
        int area = lado * lado;

        // Exibindo a área
        System.out.println("A área do quadrado é: " + area);
    };

    public static void triangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da base do triagulo: ");
        int base = scanner.nextInt();

        System.out.print("Digite o comprimento da altura do triagulo: ");
        int altura = scanner.nextInt();

        int area = (base * altura) / 2;

        System.out.println("A área do triagulo é: " + area);
    };

    public static void circunferencia() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do raio da circunferencia: ");
        double raio = scanner.nextInt();

        double area = (raio * raio) * 3.14;

        System.out.println("A área da circunferencia é: " + area);
    }
}