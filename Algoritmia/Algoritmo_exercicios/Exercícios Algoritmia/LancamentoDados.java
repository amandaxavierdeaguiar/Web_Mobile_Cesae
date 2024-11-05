/** Objetivo: Desenvolver um programa que simule o lançamento de dois dados, verificando se o 
 * utilizador acertou no número total que saiu. 
 * Informação adicional: Os dados são de seis faces. 
 * Requisitos: 
 * - Pedir ao utilizador que tente adivinhar o número que irá sair no lançamento dos dados, 
 * informando que no mínimo só poderá sair 2 e que no máximo só poderá sair 12. 
 * Assuma que o utilizador escreve um número inteiro, mas faça a validação ao valor fornecido de modo a 
 * verificar se é entre 2 a 12. Caso contrário, repetir o pedido até o utilizador fornecer um valor válido! 
 * Simular números aleatórios para os dois dados, calculando o seu total. Tudo isto deve ser 
 * apresentado no ecrã através de texto (valor de cada dado e seu somatório). 
 * Comparar o resultado dos dados com o valor fornecido pelo utilizador. Se o utilizador tiver
 * acertado no número que saiu, apresentar a mensagem: “Ganhou 100 euros!”. Caso 
 * contrário, apresentar a mensagem: “Tem de pagar 10 euros!”. 
*/
 
//import Random
import java.util.Random;
import java.util.Scanner;

class LancamentoDados
{
    Scanner inputNumber = new Scanner(System.in);
    Scanner newGame = new Scanner(System.in);
    Random objetoNumeroAleatorio = new Random();
    
    LancamentoDados()
    {
        pedidoLancamento();
    }

    void pedidoLancamento(){
        System.out.println("Tente adivinhar o número que irá sair no lançamento dos dados");
        
        System.out.println("O computador lançara dois dados, voce tem que saber o valor da soma dos dados");
        System.out.println("O valor tem que estar entre 2 e 12");
        
        //Para pedir dado para o utilizador:
        int valorUtilizadorGuardado = inputNumber.nextInt();
        System.out.println("Você digitou o número: " + valorUtilizadorGuardado);
        
        if (valorUtilizadorGuardado >= 2 || valorUtilizadorGuardado <= 12)
        {
            dado(valorUtilizadorGuardado);
        }
        else{
            System.out.println("fornecer um valor válido!");
            pedidoLancamento();
        }
        
    }
    
    void dado(int inputUtilizador){
        int dado1 = objetoNumeroAleatorio.nextInt(6) + 1;
        int dado2 = objetoNumeroAleatorio.nextInt(6) + 1;
        int somaDados = dado1 + dado2;
        System.out.println("O valor do Dado 1: "+ dado1 + "Dado 2: " + dado2 + " A soma dos dados são: " + somaDados);
        
        if (inputUtilizador == somaDados){
            System.out.println("Ganhou 100 euros!");
        } else{
            System.out.println("Tem de pagar 10 euros!");
            System.out.println("Quer jogar novamente? ");
            jogarNovamente();
        }
    }
    
    void jogarNovamente(){
        String resposta = newGame.nextLine();
        if (resposta.equals("sim")){
            pedidoLancamento();    
        }
    }
}