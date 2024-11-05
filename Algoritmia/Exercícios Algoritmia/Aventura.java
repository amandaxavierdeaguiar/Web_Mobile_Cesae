
/** Objetivo: Desenvolver um programa que apresente uma breve história de uma personagem num
* local e que permita o utilizador escolher uma direção, descrevendo o que acontece a seguir a essa
* escolha.
* Requisitos:
* Logo desde início, apresentar um texto descritivo de uma personagem e do local onde esta
* se encontra. Utilize a sua vasta imaginação!
* Pedir ao utilizador que escolha uma das seguintes opções: “norte”, “sul”, “este” ou
* “oeste”. Para este exercício não serão necessárias validações. Assuma que o utilizador vai
* escrever corretamente uma destas opções.
* O programa deverá estar preparado para apresentar uma narrativa diferente para cada
* opção. Em função da escolha do utilizado, apresente o texto respetivo.
*/

import java.util.Scanner;
import java.util.Random;

class Aventura
{
    // global
    Scanner valorPedido = new Scanner(System.in);

    Aventura()
    {
        System.out.println("X-Man estava numa missão, ela tem que procurar o Vilão Magneto. Digite as direções para ver se encontra o vilão");
        System.out.println("Escreve as direções para ver se o encontra");
        System.out.println("NORTE - SUL - LESTE - OESTE");
        
        pedido();
    }
    
    void pedido()
    {
        System.out.println("Qual a direção desejada? Se quiser sair escreva sair");
        String inputUsuario = valorPedido.nextLine();
        
        historiaVilao(inputUsuario);
    }
    
    void historiaVilao(String opcaoUsuario)
    {
        if (opcaoUsuario.equalsIgnoreCase("norte")){
            System.out.println("X-man chega e sente o Odor do Vilão Magneto, porém ele fugiu para outro lugar, logo atrás da montanha, escolha uma nova opção");
            pedido();
        }
        if (opcaoUsuario.equalsIgnoreCase("sul")){
            System.out.println("Foi por um triz, x-man quase apanhou o Vilão Magneto, tente novamente...");
            pedido();    
        }
        if (opcaoUsuario.equalsIgnoreCase("leste")){
            System.out.println("Magneto estava sentado na mesa do bar bebendo uma ceveja, convidou X-MAN para beber uma com ele e esquecerem a rivalidade");
            System.out.println("Você aceita?");
            System.out.println("Escreva sim ou nao");
            
            String inputConvite= valorPedido.nextLine();
            
            if (inputConvite.equalsIgnoreCase("sim")){
                System.out.println("Beberam uma, duas, três e no fim ficaram amigos!");
                
            } 
            if (inputConvite.equalsIgnoreCase("nao")){
                System.out.println("X-MAN não aceitou seu pedido e ficou furioso, pegou suas garras e espetou sua barriga do Vilao Magneto ");
                pedido();
            } 
        }
        if (opcaoUsuario.equalsIgnoreCase("oeste")){
            System.out.println("X-MAN se sentou e pensou em qual direção seguir.");
            pedido(); 
        }
        if(opcaoUsuario.equalsIgnoreCase("sair")){
            System.out.println("Até logo!");
        }
    }
}
