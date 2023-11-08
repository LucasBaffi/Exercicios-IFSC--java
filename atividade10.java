import java.util.Scanner;


class atividade10{

    public static void main(String[] args){
        try (Scanner leia = new Scanner(System.in)) {
            byte contador = 1, alunos;
            float n1, n2, n3;
        
            double mediaGeral,media, somaMedia=0, aprovado=0, reprovado=0, recuperacao=0, maiorMedia=0;
            String status = "aprovado", nome, alunoMaiorMedia = "";

            System.out.println("Digite o numeros de alunos");
            alunos = leia.nextByte();

            do{
                System.out.println("Digite o nome do aluno");
                nome = leia.next();


                System.out.print("Nota 1 : ");
                n1 = leia.nextFloat();
                while(n1 > 10 || n1 < 0 ){
                    System.out.println("nota invalida");
                    System.out.print("Nota 1 : ");
                    n1 = leia.nextFloat();
                }
                n1 *=1;
                
                System.out.print("Nota 2 : ");
                n2 = leia.nextFloat();
                while(n2 > 10 || n2 < 0 ){
                    System.out.println("nota invalida");
                    System.out.print("Nota 2 : ");
                    n2 = leia.nextFloat();
                }
                n2 *=3;
             
                System.out.print("Nota 3 : ");
                n3 = leia.nextFloat();
                while(n3 > 10 || n3 < 0 ){
                    System.out.println("nota invalida");
                    System.out.print("Nota 3 : ");
                    n3 = leia.nextFloat();
                }
                n3 *=5;
                             
                media = (n1 + n2 + n3) / 9;         
                
                if(media > maiorMedia){
                    maiorMedia = media;
                    alunoMaiorMedia = nome;
                }
        
                if(media < 4 ){
                    status = "reprovado"; 
                    reprovado++;
                }else if(media >= 4 && media < 6){	
                    status = "em recuperação";
                    recuperacao++;
                }else{
                    status = "aprovado";
                    aprovado++;
                }
                
                somaMedia+= media;
                System.out.println("o aluno " + nome + " tem media " + media + " e esta " + status);
                
                contador++;                
            }while(contador <= alunos);
            
            aprovado = aprovado * 100.00 / (alunos);
            recuperacao = recuperacao * 100.00 / (alunos);
            reprovado = reprovado * 100.00 / (alunos);

            mediaGeral = somaMedia / alunos;
            System.out.println("Média Geral da Turma: " + mediaGeral + "\n" + "Quantidade de alunos aprovados: " + aprovado + "\n" + "Quantidade de alunos em recuperacao: " + recuperacao + "\n" + "Quantidade de alunos reprovados: " + reprovado + "\n O auno com maior media foi o(a): " + alunoMaiorMedia + " com media: "+ maiorMedia  );
        }
    }
}