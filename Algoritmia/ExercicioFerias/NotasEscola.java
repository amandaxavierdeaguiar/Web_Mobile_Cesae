
/**
 * 2 – Notas da Escola
Objetivo: Desenvolver um pequeno programa que permita um aluno colocar todas as notas que 
pretender. As notas podem ter casas decimais. Quando o aluno parar de colocar notas, apresentar 
qual foi a nota mais alta de todas, qual foi a nota mais baixa de todas e apresentar também qual foi 
a média de todas as notas.
Requisitos:
• Começar por pedir ao utilizador uma nota. Para este exercício não serão necessárias 
validações. Assuma que o utilizador vai fornecer um número real positivo entre 0 a 20.
• Depois de introduzir uma nota, o programa deve sempre perguntar ao utilizador se pretende 
colocar mais outra nota. Peça ao utilizador para escrever a letra “s” se pretender introduzir 
outra nota ou letra “n” se pretender terminar o programa. Assuma que o utilizador vai
sempre escrever apenas uma destas letras e que nunca se vai enganar.
• Por fim, o programa deve indicar qual foi a nota mais alta de todas as notas introduzidas, 
bem como a mais baixa de todas. O programa também deverá apresentar a média de todas 
as notas introduzidas
 */
import java.util.Scanner;

class NotasEscola
{
    Scanner scanUser = new Scanner(System.in);
    
    NotasEscola()
    {
        notas();
        opcaoUser();
    }
    
    float notas(){
        float nota;
        
        do{
            System.out.println("Digite a nota do aluno:");
            nota = scanUser.nextInt();
            nota ++;
            
        }
    
    }
    
    void opcaoUser()
    {
        String opcao;
        do {
            System.out.println("Digite 's' se quiser continuar e 'n' para parar");
            opcao = scanUser.nextLine();
            if (!opcao.equals("s") && !opcao.equals("n")) {
                System.out.println("Opção Incorreta: Valide Novamente.");
            }
        } while (!opcao.equals("s") && !opcao.equals("n"));
    }
}
