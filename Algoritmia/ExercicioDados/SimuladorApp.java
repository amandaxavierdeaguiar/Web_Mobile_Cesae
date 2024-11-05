// import da classe Random para gerar numeros aleários;
import java.util.Random;
// importacao do input
import java.util.Scanner;

class SimuladorApp
{
    // propriedade global
    // Scanner nao pode apenas ter (), tem que ser declarado dentro o System.in
    Scanner scanNumeroUtilizador = new Scanner(System.in);
    Scanner scanTextoUtilizador = new Scanner(System.in);
    Random objetoNumeroAleatorio = new Random();

    /**
     * Construtor para objetos da classe SimuladorApp
     */
    SimuladorApp()
    {
        mensagemBoasVindas();
        pedidoLancamento();
        
    }
    
    void mensagemBoasVindas(){
        //Dar boas vindas ao utilizador
        System.out.println("Bem vindo ao Programa de Lançamento de Dados");
        System.out.println("Esse programa permite lançar dados de 4, 6 e 8 lados");        
    }
    
    void pedidoLancamento(){
            System.out.println("Por favor escreva 4, 6 ou 8 para determinar o gênero de dado e lançar: ");
            int valorUtilizadorGuardado = scanNumeroUtilizador.nextInt();
            System.out.println("Você digitou o número: " + valorUtilizadorGuardado);
            
            if (valorUtilizadorGuardado == 4 || 
                valorUtilizadorGuardado == 6 || 
                valorUtilizadorGuardado == 8)
            {
                escreveResultado(valorUtilizadorGuardado);
            }
            else{
                System.out.println("Dados inválidos.");
                pedidoLancamento();
        }
        
        
        }
      void escreveResultado(int res){
        int resultadoDoLancamento = objetoNumeroAleatorio.nextInt(res) + 1;
        System.out.println("O numero sorteado pela máquina foi " + resultadoDoLancamento);
        
        System.out.println("Deseja mais um lançamento? \nEscreva sim para lançar outro dado \nCaso contrário escreva outra coisa");
        
        String escritaUtilizador = new String();
        //scanNumeroUtilizador.nextLine(); //Linha extra para nao ter o bug de mudar o tipo de dado.
        escritaUtilizador = scanTextoUtilizador.nextLine();
        
        //equals para comparar as strings. obrigatorio o uso de equals
        if(escritaUtilizador.equals("sim"))
        {
            pedidoLancamento();
        } else{
            System.out.println("Até logo!");
        }
    }  
}
    
