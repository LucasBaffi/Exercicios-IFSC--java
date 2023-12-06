import java.util.Scanner;

public class ordemCrescente {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {

            byte n1, n2, n3;

            System.out.println("digite o primeiro numero");
            n1 = leia.nextByte();
            System.out.println("digite o segundo numero");
            n2 = leia.nextByte();
            System.out.println("digite o terceiro numero");
            n3 = leia.nextByte();

            if (n1 < n2 && n1 < n3) {
                if (n2 < n3) {
                    System.out.println(n1 + " " + n2 + " " + n3);
                } else {
                    System.out.println(n1 + " " + n3 + " " + n2);
                }
            }else if(n2 < n1 && n2 < n3){
                if(n1 < n3){
                    System.out.println(n2 + " " + n1 + " " + n3);
                }else{
                    System.out.println(n2 + " " + n3 + " " + n1);
                }
            }else if(n3 < n1 && n3 < n2){
                if(n1 < n2){
                    System.out.println(n3 + " " + n1 + " " + n2);
                }else{
                    System.out.println(n3 + " " + n2 + " " + n1);
                }
            }


        }
    }
}
