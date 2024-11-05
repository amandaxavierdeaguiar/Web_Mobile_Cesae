
/** Objetivo: Desenvolver um programa que converta um determinado número de euros para
* reais.
* Informação adicional: 1 euro equivale a 6.04 reais neste momento. Para este exercício, não é para fazer arredondamentos de valores.
* Requisitos:
* Pedir ao utilizador que forneça um determinado número de euros. Para este
* exercício não serão necessárias validações. Assuma que o utilizador vai fornecer um
* número real positivo.
* Em seguida, o programa deverá apresentar o número de reais respetivo.
*/

//Importacoes
import java.util.Scanner;

class ConversaoEuro
{
    // variáveis global
    Scanner valorPedido = new Scanner(System.in);
    Scanner novoPedido = new Scanner(System.in);

    ConversaoEuro()
    {
        // inicializa variáveis de instância
        System.out.println("-- CONVERSÃO DE MOEDA --");
        System.out.println("-- REAL - EURO --");
                
        pedidoUsuario();
        
    }
    
    void pedidoUsuario()
    {
        System.out.println("Digite o valor que deseja que seja convertido.");
        float dinheiroConversao = valorPedido.nextFloat();
        conversao(dinheiroConversao);
    }

    void conversao(float valorConversao)
    {
        float cotacaoDia = 6.04f;
        
        System.out.println("-- COTAÇÃO DO DIA:" + cotacaoDia + "--");
        
        float totalCotacao = valorConversao * cotacaoDia;
        
        System.out.println("-- TOTAL TRANSAÇÃO: --");
        
        System.out.println(valorConversao + "Reais " + " equivalem " + totalCotacao + " Euros");
        
        novaMensagem();
    }
    
    void novaMensagem(){
        System.out.println("");
        System.out.println("-- DESEJA REALIZAR NOVA COTAÇÃO? --");
        System.out.println("[1] - Para continuar");
        System.out.println("Qualquer número para sair");
        
        int opcao = novoPedido.nextInt();
        if (opcao == 1){
            pedidoUsuario();
        } else{
            System.out.println("Saindo do programa...");
        }
    }
}
